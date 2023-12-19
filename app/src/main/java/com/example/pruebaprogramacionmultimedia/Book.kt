package com.example.pruebaprogramacionmultimedia

import android.os.Parcel
import android.os.Parcelable
import android.view.View

class Book(
    private var libro: String?,
    private var pagina: String?,
    private var autor: String?,
    private var publicacion: String?
) : Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun toString(): String {
        return "Nombre: ${libro}, Pagina: ${pagina}, Autor: ${autor}, Publicacion: ${publicacion}"
    }

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        TODO("Not yet implemented")
    }

    companion object CREATOR : Parcelable.Creator<Book> {
        override fun createFromParcel(parcel: Parcel): Book {
            return Book(parcel)
        }

        override fun newArray(size: Int): Array<Book?> {
            return arrayOfNulls(size)
        }
    }

}


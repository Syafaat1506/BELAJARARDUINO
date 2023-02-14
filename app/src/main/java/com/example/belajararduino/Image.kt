package com.example.belajararduino

import android.os.Parcel
import android.os.Parcelable

data class Image(
    val imageSrc : Int,
    val Title: String?,
    val Desc : String?,
    val Rangkaian : Int,
    val Code : String?,
    val Hasil : String?,
    val Project: Int,
    val Tvhasil :String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readString()

    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(imageSrc)
        parcel.writeString(Title)
        parcel.writeString(Desc)
        parcel.writeInt(Rangkaian)
        parcel.writeString(Code)
        parcel.writeString(Hasil)
        parcel.writeInt(Project)
        parcel.writeString(Tvhasil)


    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Image> {
        override fun createFromParcel(parcel: Parcel): Image {
            return Image(parcel)
        }

        override fun newArray(size: Int): Array<Image?> {
            return arrayOfNulls(size)
        }
    }
}
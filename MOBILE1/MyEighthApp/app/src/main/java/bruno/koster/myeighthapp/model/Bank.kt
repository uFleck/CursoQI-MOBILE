package bruno.koster.myeighthapp.model

import android.os.Parcel
import android.os.Parcelable

//import java.io.Serializable
//
//class Bank : Serializable {
//    var money: Double? = 0.0
//    var total: Double? = 0.0
//
//    override fun toString(): String {
//        return "Money = $money, Total = total"
//    }
//}

class Bank(var money: Double?) : Parcelable {

    override fun toString(): String {
        return "$$money"
    }

    constructor(source: Parcel) : this(
        source.readValue(Double::class.java.classLoader) as Double?
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeValue(money)
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<Bank> = object : Parcelable.Creator<Bank> {
            override fun createFromParcel(source: Parcel): Bank = Bank(source)
            override fun newArray(size: Int): Array<Bank?> = arrayOfNulls(size)
        }
    }
}
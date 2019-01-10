package com.farizdotid.daerahindonesia.model.provinsi

/**
 * Created by Fariz Ramadhan.
 * website : https://farizdotid.com/
 * github : https://github.com/farizdotid
 * linkedin : https://www.linkedin.com/in/farizramadhan/
 */
class Provinsi(
    private var id: Int?,
    private var nama: String?
) {
    fun getId(): Int? {
        return id
    }

    fun getNama() : String?{
        return nama
    }
}
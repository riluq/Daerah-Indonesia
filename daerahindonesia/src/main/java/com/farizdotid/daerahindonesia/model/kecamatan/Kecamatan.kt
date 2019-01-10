package com.farizdotid.daerahindonesia.model.kecamatan

/**
 * Created by Fariz Ramadhan.
 * website : https://farizdotid.com/
 * github : https://github.com/farizdotid
 * linkedin : https://www.linkedin.com/in/farizramadhan/
 */
class Kecamatan(
    private var id: Int?,
    private var idKabupaten: String?,
    private var nama: String?
) {
    fun getId(): Int? {
        return id
    }

    fun getIdKabupaten(): String? {
        return idKabupaten
    }

    fun getNama() : String?{
        return nama
    }
}
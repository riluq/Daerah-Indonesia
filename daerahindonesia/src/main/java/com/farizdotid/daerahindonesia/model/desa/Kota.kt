package com.farizdotid.daerahindonesia.model.desa

/**
 * Created by Fariz Ramadhan.
 * website : https://farizdotid.com/
 * github : https://github.com/farizdotid
 * linkedin : https://www.linkedin.com/in/farizramadhan/
 */
class Kota(
    private var id: Long?,
    private var idKecamatan: String?,
    private var nama: String?
) {
    fun getId(): Long? {
        return id
    }

    fun getIdKecamatan(): String? {
        return idKecamatan
    }

    fun getNama() : String?{
        return nama
    }
}
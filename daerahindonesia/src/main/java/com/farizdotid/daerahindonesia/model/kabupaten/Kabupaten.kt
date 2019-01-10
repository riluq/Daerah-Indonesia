package com.farizdotid.daerahindonesia.model.kabupaten

/**
 * Created by Fariz Ramadhan.
 * website : https://farizdotid.com/
 * github : https://github.com/farizdotid
 * linkedin : https://www.linkedin.com/in/farizramadhan/
 */
class Kabupaten(
    private var id: Int?,
    private var idProv: String?,
    private var nama: String?
) {
    fun getId(): Int? {
        return id
    }

    fun getIdProv(): String? {
        return idProv
    }

    fun getNama() : String?{
        return nama
    }
}
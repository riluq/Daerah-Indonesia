package com.farizdotid.daerahindonesia

import com.farizdotid.daerahindonesia.model.desa.ResponseDesa
import com.farizdotid.daerahindonesia.model.kabupaten.ResponseKabupaten
import com.farizdotid.daerahindonesia.model.kecamatan.ResponseKecamatan
import com.farizdotid.daerahindonesia.model.provinsi.ResponseAllProvinsi
import com.farizdotid.daerahindonesia.model.provinsi.ResponseSingleProvinsi

/**
 * Created by Fariz Ramadhan.
 * website : https://farizdotid.com/
 * github : https://github.com/farizdotid
 * linkedin : https://www.linkedin.com/in/farizramadhan/
 */
interface DaerahContract {

    interface View {
        fun showMessage(message: String)
        fun isReqAllProvinsi(responseAllProvinsi: ResponseAllProvinsi)
        fun isReqSingleProvinsiById(responseSingleProvinsi: ResponseSingleProvinsi)
        fun isReqProvinsiByName(responseAllProvinsi: ResponseAllProvinsi)
        fun isReqKabupaten(responseKabupaten: ResponseKabupaten)
        fun isReqKabupatenById(responseKabupaten: ResponseKabupaten)
        fun isReqKabupatenByName(responseKabupaten: ResponseKabupaten)
        fun isReqKecamatan(responseKecamatan: ResponseKecamatan)
        fun isReqKecamatanById(responseKecamatan: ResponseKecamatan)
        fun isReqKecamatanByName(responseKecamatan: ResponseKecamatan)
        fun isReqKota(responseDesa: ResponseDesa)
        fun isReqKotaById(responseDesa: ResponseDesa)
        fun isReqKotaByName(responseDesa: ResponseDesa)
    }

    interface Presenter {
        fun requestAllProvinsi()
        fun requestSingleProvinsiById(idProvinsi: Int)
        fun requestProvinsiByName(name: String)
        fun requestKabupaten(idProvinsi: Int)
        fun requestKabupatenById(idProvinsi: Int, idKabupaten: Int)
        fun requestKabupatenByName(idProvinsi: Int, name: String)
        fun requestKecamatan(idKabupaten: Int)
        fun requestKecamatanById(idKabupaten: Int, idKecamatan: Int)
        fun requestKecamatanByName(idKabupaten: Int, name: String)
        fun requestKota(idKecamatan: Int)
        fun requestKotaById(idKecamatan: Int, idKota: Long)
        fun requestKotaByName(idKecamatan: Int, name: String)
        fun requestDisposableRx()
    }
}
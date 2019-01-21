package com.farizdotid.daerahindonesia

import android.content.Context
import android.support.annotation.NonNull
import android.widget.Toast
import com.farizdotid.daerahindonesia.model.desa.Kota
import com.farizdotid.daerahindonesia.model.desa.ResponseDesa
import com.farizdotid.daerahindonesia.model.kabupaten.Kabupaten
import com.farizdotid.daerahindonesia.model.provinsi.ResponseAllProvinsi
import com.farizdotid.daerahindonesia.model.provinsi.ResponseSingleProvinsi
import com.farizdotid.daerahindonesia.model.kabupaten.ResponseKabupaten
import com.farizdotid.daerahindonesia.model.kecamatan.Kecamatan
import com.farizdotid.daerahindonesia.model.kecamatan.ResponseKecamatan
import com.farizdotid.daerahindonesia.model.provinsi.Provinsi


/**
 * Created by Fariz Ramadhan.
 * website : https://farizdotid.com/
 * github : https://github.com/farizdotid
 * linkedin : https://www.linkedin.com/in/farizramadhan/
 */
class DaerahIndonesiaHelper(
    @NonNull private val context: Context
) : DaerahContract.View {

    private val TAG: String = "LIBRARY_TAG"

    private var mPresenter: DaerahPresenter = DaerahPresenter(this)

    /*
    ---------- CASE PROVINSI -----------
     */
    private var listProvinsi: ArrayList<Provinsi> = arrayListOf()
    private lateinit var provinsi: Provinsi

    fun requestAllProvinsi() {
        mPresenter.requestAllProvinsi()
    }

    fun requestSingleProvinsiById(idProvinsi: Int) {
        mPresenter.requestSingleProvinsiById(idProvinsi)
    }

    fun requestProvinsiByName(name: String) {
        mPresenter.requestProvinsiByName(name)
    }

    fun getAllProvinsi(): ArrayList<Provinsi> {
        return listProvinsi
    }

    fun getAllProvinsiByName(): ArrayList<Provinsi> {
        return listProvinsi
    }

    fun getIdProvinsi(): Int? {
        return if (provinsi.getId() == null){
            0
        } else {
            provinsi.getId()
        }
    }

    fun getNameProvinsi(): String? {
        return if (provinsi.getNama() == null){
            "-"
        } else {
            return provinsi.getNama()
        }
    }

    override fun isReqAllProvinsi(responseAllProvinsi: ResponseAllProvinsi) {
        val dataItemList = responseAllProvinsi.data
        if (dataItemList != null) {
            for (i in dataItemList.indices) {
                val id = dataItemList[i].id
                val name = dataItemList[i].nama
                listProvinsi.add(Provinsi(id, name))
            }
        }
    }

    override fun isReqSingleProvinsiById(responseSingleProvinsi: ResponseSingleProvinsi) {
        val id = responseSingleProvinsi.data?.id
        val name = responseSingleProvinsi.data?.nama

        provinsi = Provinsi(id, name)
    }

    override fun isReqProvinsiByName(responseAllProvinsi: ResponseAllProvinsi) {
        val dataItemList = responseAllProvinsi.data
        if (dataItemList != null) {
            for (i in dataItemList.indices) {
                val id = dataItemList[i].id
                val name = dataItemList[i].nama
                listProvinsi.add(Provinsi(id, name))
            }
        }
    }

    /*
    ---------- CASE PROVINSI -----------
     */

    /*
    ---------- CASE KABUPATEN -----------
     */
    private var listKabupaten: ArrayList<Kabupaten> = arrayListOf()

    fun requestKabupaten(idProvinsi: Int) {
        mPresenter.requestKabupaten(idProvinsi)
    }

    fun requestKabupatenById(idProvinsi: Int, idKabupaten: Int) {
        mPresenter.requestKabupatenById(idProvinsi, idKabupaten)
    }

    fun requestKabupatenByName(idProvinsi: Int, name: String) {
        mPresenter.requestKabupatenByName(idProvinsi, name)
    }

    fun getAllKabupaten(): ArrayList<Kabupaten> {
        return listKabupaten
    }

    fun getIdKabupaten(): Int? {
        return if (listKabupaten[0].getId() == null){
            0
        } else {
            listKabupaten[0].getId()
        }
    }

    fun getNameKabupaten(): String? {
        return if (listKabupaten[0].getNama() == null){
            "-"
        } else {
            listKabupaten[0].getNama()
        }
    }

    fun getAllKabupatenByName(): ArrayList<Kabupaten> {
        return listKabupaten
    }

    override fun isReqKabupaten(responseKabupaten: ResponseKabupaten) {
        initDataKabupaten(responseKabupaten)
    }

    override fun isReqKabupatenById(responseKabupaten: ResponseKabupaten) {
        initDataKabupaten(responseKabupaten)
    }

    override fun isReqKabupatenByName(responseKabupaten: ResponseKabupaten) {
        initDataKabupaten(responseKabupaten)
    }

    fun initDataKabupaten(responseKabupaten: ResponseKabupaten) {
        val dataItemList = responseKabupaten.data
        if (dataItemList != null) {
            for (i in dataItemList.indices) {
                val id = dataItemList[i]?.id
                val idProv = dataItemList[i]?.idProv
                val name = dataItemList[i]?.nama
                listKabupaten.add(Kabupaten(id, idProv, name))
            }
        }
    }
    /*
   ---------- CASE KABUPATEN -----------
    */

    /*
    --------- CASE KECAMATAN ---------
     */

    private var listKecamatan: ArrayList<Kecamatan> = arrayListOf()

    fun requestKecamatan(idKabupaten: Int) {
        mPresenter.requestKecamatan(idKabupaten)
    }

    fun requestKecamatanById(idKabupaten: Int, idKecamatan: Int) {
        mPresenter.requestKecamatanById(idKabupaten, idKecamatan)
    }

    fun requestKecamatanByName(idKabupaten: Int, name: String) {
        mPresenter.requestKecamatanByName(idKabupaten, name)
    }

    fun getAllKecamatan(): ArrayList<Kecamatan> {
        return listKecamatan
    }

    fun getKecamatanId(): Int? {
        return if (listKecamatan[0].getId() == null){
            0
        } else {
            listKecamatan[0].getId()
        }
    }

    fun getKecamatanName(): String? {
        return if (listKecamatan[0].getNama() == null){
            "-"
        } else {
            listKecamatan[0].getNama()
        }
    }

    override fun isReqKecamatan(responseKecamatan: ResponseKecamatan) {
        initDataKecamatan(responseKecamatan)
    }

    override fun isReqKecamatanById(responseKecamatan: ResponseKecamatan) {
        initDataKecamatan(responseKecamatan)
    }

    override fun isReqKecamatanByName(responseKecamatan: ResponseKecamatan) {
        initDataKecamatan(responseKecamatan)
    }

    fun initDataKecamatan(responseKecamatan: ResponseKecamatan) {
        val dataItemList = responseKecamatan.data
        if (dataItemList != null) {
            for (i in dataItemList.indices) {
                val id = dataItemList[i]?.id
                val idKabupaten = dataItemList[i]?.idKabupaten
                val name = dataItemList[i]?.nama
                listKecamatan.add(Kecamatan(id, idKabupaten, name))
            }
        }
    }
    /*
    --------- CASE KECAMATAN -----------
     */

    /*
    --------- CASE KOTA ----------
     */
    private var listKota: ArrayList<Kota> = arrayListOf()

    fun requestKota(idKecamatan: Int){
        mPresenter.requestKota(idKecamatan)
    }

    fun requestKotaById(idKecamatan: Int, idKota: Long){
        mPresenter.requestKotaById(idKecamatan, idKota)
    }

    fun requestKotaByName(idKecamatan: Int, name: String){
        mPresenter.requestKotaByName(idKecamatan, name)
    }

    fun getAllKota(): ArrayList<Kota> {
        return listKota
    }

    fun getKotaId(): Long? {
        return if (listKota[0].getId() == null){
            0
        } else {
            listKota[0].getId()
        }
    }

    fun getKotaName(): String? {
        return if (listKota[0].getNama() == null){
            "-"
        } else {
            listKota[0].getNama()
        }
    }

    override fun isReqKota(responseDesa: ResponseDesa) {
        initDataKota(responseDesa)
    }

    override fun isReqKotaById(responseDesa: ResponseDesa) {
        initDataKota(responseDesa)
    }

    override fun isReqKotaByName(responseDesa: ResponseDesa) {
        initDataKota(responseDesa)
    }

    fun initDataKota(responseDesa: ResponseDesa) {
        val dataItemList = responseDesa.data
        if (dataItemList != null) {
            for (i in dataItemList.indices) {
                val id = dataItemList[i]?.id
                val idKecamatan = dataItemList[i]?.idKecamatan
                val name = dataItemList[i]?.nama
                listKota.add(Kota(id, idKecamatan, name))
            }
        }
    }
    /*
    --------- CASE KOTA ----------
     */

    override fun showMessage(message: String) {
        Toast.makeText(context.applicationContext, message, Toast.LENGTH_SHORT).show()
    }
}
package com.farizdotid.daerahindonesia.utils.api

import com.farizdotid.daerahindonesia.model.desa.ResponseDesa
import com.farizdotid.daerahindonesia.model.kabupaten.ResponseKabupaten
import com.farizdotid.daerahindonesia.model.kecamatan.ResponseKecamatan
import com.farizdotid.daerahindonesia.model.provinsi.ResponseAllProvinsi
import com.farizdotid.daerahindonesia.model.provinsi.ResponseSingleProvinsi
import io.reactivex.Observable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import java.util.concurrent.TimeUnit

/**
 * Created by Fariz Ramadhan.
 * website : https://farizdotid.com/
 * github : https://github.com/farizdotid
 * linkedin : https://www.linkedin.com/in/farizramadhan/
 */
interface BaseApiService {

    /*
    GET ALL API PROVINSI
     */
    @GET("provinsi")
    fun requestAllProvinsi(): Observable<ResponseAllProvinsi>

    /*
    GET SINGLE PROVINSI BY ID
     */
    @GET("provinsi/id/{id}")
    fun requestSingleProvinsiById(@Path("id") id: Int): Observable<ResponseSingleProvinsi>

    /*
    GET SINGLE PROVINSI BY NAME
     */
    @GET("provinsi/name/{name}")
    fun requestProvinsiByName(@Path("name") name: String): Observable<ResponseAllProvinsi>

    /*
    GET KABUPATEN BY ID PROVINSI
    */
    @GET("provinsi/{id}/kabupaten")
    fun requestKabupaten(@Path("id") id: Int): Observable<ResponseKabupaten>

    /*
    GET KABUPATEN BY ID
     */
    @GET("provinsi/{idprovinsi}/kabupaten/id/{idkabupaten}")
    fun requestKabupatenById(
        @Path("idprovinsi") idProvinsi: Int,
        @Path("idkabupaten") idKabupaten: Int
    ): Observable<ResponseKabupaten>

    /*
    GET KABUPATEN BY NAME
     */
    @GET("provinsi/{id_provinsi}/kabupaten/name/{name}")
    fun requestKabupatenByName(
        @Path("id_provinsi") idProvinsi: Int,
        @Path("name") name: String
    ): Observable<ResponseKabupaten>

    /*
    GET KECAMATAN BY ID KABUPATEN
     */
    @GET("kabupaten/{id_kabupaten}/kecamatan")
    fun requestKecamatan(
        @Path("id_kabupaten") idKabupaten: Int
    ): Observable<ResponseKecamatan>

    /*
    GET KECAMATAN BY ID
     */
    @GET("kabupaten/{id_kabupaten}/kecamatan/id/{id_kecamatan}")
    fun requestKecamatanById(
        @Path("id_kabupaten") idKabupaten: Int,
        @Path("id_kecamatan") idKecamatan: Int
    ): Observable<ResponseKecamatan>

    /*
    GET KECAMATAN BY NAME
     */
    @GET("kabupaten/{id_kabupaten}/kecamatan/name/{name}")
    fun requestKecamatanByName(
        @Path("id_kabupaten") idKabupaten: Int,
        @Path("name") name: String
    ): Observable<ResponseKecamatan>

    /*
    GET KOTA BY ID KECAMATAN
     */
    @GET("kecamatan/{id_kecamatan}/desa")
    fun requestKota(
        @Path("id_kecamatan") idKecamatan: Int
    ): Observable<ResponseDesa>

    /*
    GET KOTA BY ID
     */
    @GET("kecamatan/{id_kecamatan}/desa/id/{id_desa}")
    fun requestKotaById(
        @Path("id_kecamatan") idKecamatan: Int,
        @Path("id_desa") idDesa: Long
    ): Observable<ResponseDesa>

    /*
    GET KOTA BY NAME
    */
    @GET("kecamatan/{id_kecamatan}/desa/name/{name}")
    fun requestKotaByName(
        @Path("id_kecamatan") idKecamatan: Int,
        @Path("name") name: String
    ): Observable<ResponseDesa>

    companion object {
        fun createApiService(): BaseApiService {
            val interceptor = HttpLoggingInterceptor()
            interceptor.level = HttpLoggingInterceptor.Level.BODY
            val client = OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .readTimeout(10, TimeUnit.SECONDS)
                .connectTimeout(30, TimeUnit.SECONDS)
                .build()

            val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://dev.farizdotid.com/api/indonesia/v1/")
                .client(client)
                .build()
            return retrofit.create(BaseApiService::class.java)
        }
    }
}
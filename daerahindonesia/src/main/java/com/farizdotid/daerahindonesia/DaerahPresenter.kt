package com.farizdotid.daerahindonesia

import com.farizdotid.daerahindonesia.utils.api.BaseApiService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers

/**
 * Created by Fariz Ramadhan.
 * website : https://farizdotid.com/
 * github : https://github.com/farizdotid
 * linkedin : https://www.linkedin.com/in/farizramadhan/
 */
class DaerahPresenter(
    private var mView: DaerahContract.View
) : DaerahContract.Presenter {

    private var disposable: Disposable? = null
    private val baseApiService by lazy {
        BaseApiService.createApiService()
    }

    override fun requestAllProvinsi() {
        disposable = baseApiService.requestAllProvinsi()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onNext = {
                    mView.isReqAllProvinsi(it)
                },
                onError = {
                    mView.showMessage(it.message.toString())
                },
                onComplete = {
                }
            )
    }

    override fun requestDisposableRx() {
        disposable?.dispose()
    }

    override fun requestSingleProvinsiById(idProvinsi: Int) {
        disposable = baseApiService.requestSingleProvinsiById(idProvinsi)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onNext = {
                    mView.isReqSingleProvinsiById(it)
                },
                onError = {
                    mView.showMessage(it.message.toString())
                },
                onComplete = {}
            )
    }

    override fun requestProvinsiByName(name: String) {
        disposable = baseApiService.requestProvinsiByName(name)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onNext = {
                    mView.isReqProvinsiByName(it)
                },
                onError = {
                    mView.showMessage(it.message.toString())
                },
                onComplete = {}
            )
    }

    override fun requestKabupaten(idProvinsi: Int) {
        disposable = baseApiService.requestKabupaten(idProvinsi)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onNext = {
                    mView.isReqKabupaten(it)
                },
                onError = {
                    mView.showMessage(it.message.toString())
                },
                onComplete = {}
            )
    }

    override fun requestKabupatenById(idProvinsi: Int, idKabupaten: Int) {
        disposable = baseApiService.requestKabupatenById(idProvinsi, idKabupaten)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onNext = {
                    mView.isReqKabupatenById(it)
                },
                onError = {
                    mView.showMessage(it.message.toString())
                },
                onComplete = {}
            )
    }

    override fun requestKabupatenByName(idProvinsi: Int, name: String) {
        disposable = baseApiService.requestKabupatenByName(idProvinsi, name)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onNext = {
                    mView.isReqKabupatenByName(it)
                },
                onError = {
                    mView.showMessage(it.message.toString())
                },
                onComplete = {}
            )
    }

    override fun requestKecamatan(idKabupaten: Int) {
        disposable = baseApiService.requestKecamatan(idKabupaten)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onNext = {
                    mView.isReqKecamatan(it)
                },
                onError = {
                    mView.showMessage(it.message.toString())
                },
                onComplete = {}
            )
    }

    override fun requestKecamatanById(idKabupaten: Int, idKecamatan: Int) {
        disposable = baseApiService.requestKecamatanById(idKabupaten, idKecamatan)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onNext = {
                    mView.isReqKecamatanById(it)
                },
                onError = {
                    mView.showMessage(it.message.toString())
                },
                onComplete = {}
            )
    }

    override fun requestKecamatanByName(idKabupaten: Int, name: String) {
        disposable = baseApiService.requestKecamatanByName(idKabupaten, name)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onNext = {
                    mView.isReqKecamatanByName(it)
                },
                onError = {
                    mView.showMessage(it.message.toString())
                },
                onComplete = {}
            )
    }

    override fun requestKota(idKecamatan: Int) {
        disposable = baseApiService.requestKota(idKecamatan)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onNext = {
                    mView.isReqKota(it)
                },
                onError = {
                    mView.showMessage(it.message.toString())
                },
                onComplete = {}
            )
    }

    override fun requestKotaById(idKecamatan: Int, idKota: Long) {
        disposable = baseApiService.requestKotaById(idKecamatan, idKota)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onNext = {
                    mView.isReqKotaById(it)
                },
                onError = {
                    mView.showMessage(it.message.toString())
                },
                onComplete = {}
            )
    }

    override fun requestKotaByName(idKecamatan: Int, name: String) {
        disposable = baseApiService.requestKotaByName(idKecamatan, name)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onNext = {
                    mView.isReqKotaByName(it)
                },
                onError = {
                    mView.showMessage(it.message.toString())
                },
                onComplete = {}
            )
    }
}
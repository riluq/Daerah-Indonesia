package com.farizdotid.daerahindonesia.model.desa

import com.google.gson.annotations.SerializedName

data class DataItem(

	@field:SerializedName("id_kecamatan")
	val idKecamatan: String? = null,

	@field:SerializedName("nama")
	val nama: String? = null,

	@field:SerializedName("id")
	val id: Long? = null
)
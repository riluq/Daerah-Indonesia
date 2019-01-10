package com.farizdotid.daerahindonesia.model.kabupaten

import com.google.gson.annotations.SerializedName

data class DataItem(

	@field:SerializedName("nama")
	val nama: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("id_prov")
	val idProv: String? = null
)
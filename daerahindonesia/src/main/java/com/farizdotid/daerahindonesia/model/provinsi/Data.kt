package com.farizdotid.daerahindonesia.model.provinsi

import com.google.gson.annotations.SerializedName

data class Data(

	@field:SerializedName("nama")
	val nama: String? = null,

	@field:SerializedName("id")
	val id: Int? = null
)
package com.farizdotid.daerahindonesia.model.provinsi

import com.google.gson.annotations.SerializedName

data class ResponseAllProvinsi(

	@field:SerializedName("data")
	val data: List<DataItem>? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)
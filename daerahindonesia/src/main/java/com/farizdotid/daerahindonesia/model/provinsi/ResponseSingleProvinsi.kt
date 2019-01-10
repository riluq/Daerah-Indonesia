package com.farizdotid.daerahindonesia.model.provinsi

import com.google.gson.annotations.SerializedName

data class ResponseSingleProvinsi(

	@field:SerializedName("data")
	val data: Data? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)
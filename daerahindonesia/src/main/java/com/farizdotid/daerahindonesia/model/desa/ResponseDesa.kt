package com.farizdotid.daerahindonesia.model.desa

import com.google.gson.annotations.SerializedName

data class ResponseDesa(

	@field:SerializedName("data")
	val data: List<DataItem?>? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)
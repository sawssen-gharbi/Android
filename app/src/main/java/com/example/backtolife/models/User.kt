package com.example.backtolife.models

import java.sql.Timestamp

data class User(

    var token: String? = null,
    var _id: String? = null,
    var fullName: String? = null,
    var email: String? = null,
    var password: String? = null,
    var phone: String? = null,
    var role: Boolean? = null,
    var address: List<Any>? = null,
    var photo: String? = null,
    var timestamp: Timestamp,



    )

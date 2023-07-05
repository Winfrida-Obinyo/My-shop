package com.winnie.myshop.models

data class Products(
    var id:Int,
    var title:String,
    var description:String,
    var rating:Double,
    var price:Double,
    var stock:String,
    var brand:String,
    var category:String,
    var thumbnail:String

)
package com.winnie.myshop.models

class ProductResponse (
    var products: List<Products>,
    var total: Int,
    var skip: Int,
    var limit: Int

    )
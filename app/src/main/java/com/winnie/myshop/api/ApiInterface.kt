package com.winnie.myshop.api

import com.winnie.myshop.models.ProductResponse
import com.winnie.myshop.models.Products
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {
    @GET("/products")
    suspend fun getProducts(): Response<ProductResponse>

    @GET("/products/{id}")
    suspend fun getProduct(@Path("id") productId: Int): Response<Products>










}
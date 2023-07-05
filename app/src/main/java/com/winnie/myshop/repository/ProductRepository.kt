package com.winnie.myshop.repository

import com.winnie.myshop.api.ApiClient
import com.winnie.myshop.api.ApiInterface
import com.winnie.myshop.models.ProductResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response


class ProductsRepository {
    val apiClient = ApiClient.buildClient(ApiInterface::class.java)
    suspend fun getProducts():Response<ProductResponse>{
        return withContext(Dispatchers.IO){
            apiClient.getProducts()
        }
    }
}
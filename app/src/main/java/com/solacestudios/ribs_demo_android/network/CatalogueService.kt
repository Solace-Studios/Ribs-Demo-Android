package com.solacestudios.ribs_demo_android.network

import com.solacestudios.ribs_demo_android.models.CatalogueDetail
import com.solacestudios.ribs_demo_android.models.CatalogueResponse
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CatalogueService {

    @GET("/allBrawlers")
    fun getAll(
        @Query("page") page: Int
    ): Observable<CatalogueResponse>

    @GET("/{name}")
    fun getDetail(
        @Path("name") name: String
    ): Observable<CatalogueDetail>
}
package com.solacestudios.ribs_demo_android.network

import com.solacestudios.ribs_demo_android.models.CatalogueDetail
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface DetailsService {

    @GET("/{name}")
    fun getDetail(
        @Path("name") name: String
    ): Observable<CatalogueDetail>
}
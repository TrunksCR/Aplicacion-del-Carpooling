package com.example.appcarpooling

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST


/**
 * Interfaz que define las operaciones del servicio web mediante Retrofit.
 */


interface  ApiService {


    /**
     * Obtiene la lista de choferes desde el servicio web.
     *
     * @return Una llamada (Call) que devuelve una lista de objetos ChoferModel.
     */



    @GET("/chofer")
    fun getChoferes(): Call<List<ChoferModel>>


    /**
     * Crea un nuevo chofer mediante el servicio web.
     *
     * @param chofer El objeto ChoferModel que se va a crear.
     * @return Una llamada (Call) que devuelve el ChoferModel creado.
     */

    @POST("/chofer")
    fun createChofer(@Body chofer: ChoferModel): Call<ChoferModel>
}
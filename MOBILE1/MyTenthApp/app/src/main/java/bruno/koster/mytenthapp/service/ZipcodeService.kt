package bruno.koster.mytenthapp.service

import bruno.koster.mytenthapp.model.Zipcode
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/*
    http://viacep.com.br/ws/    01001000/json/
    http://viacep.com.br/ws/    RS/Porto Alegre/domingos/json/
*/

interface ZipcodeService {
    @GET("{zipcode}/json/")
    fun findAddressByZipcode(@Path("zipcode") zipcode: String) : Call<Zipcode>

    @GET("{state}/{city}/{address}/json/")
    fun findZipcodeByStateDistrictAndAddress(
        @Path("address") address: String,
        @Path("state") state: String,
        @Path("city") city: String) : Call<List<Zipcode>>
}
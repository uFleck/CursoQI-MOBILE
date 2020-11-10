package bruno.koster.mytenthapp.service

import bruno.koster.mytenthapp.Constant
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInitializer {
    val gson = GsonBuilder()
        .setDateFormat("yyy-MM-dd'T'HH:mm:ss")
        .create()

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(Constant.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun zipcodeService() = retrofit.create(ZipcodeService::class.java)
}
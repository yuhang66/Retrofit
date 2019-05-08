package com.example.administrator.retrofit_rxjava;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {
   @GET("dis")
    // @GET("weather_mini")
//  此处回调返回的可为任意类型Call<T>，再也不用自己去解析json数据啦！！！

    Call<Translate> getcall();
    // Call<WeatherEntity> getMessage(@Query("city") String city);
}

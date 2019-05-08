package com.example.administrator.retrofit_rxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        doRequestByRetrofit();
    }

    private void doRequestByRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.30.89/OR/index.php/Groupjson/")
               // .baseUrl("http://wthrcdn.etouch.cn/")//基础URL 建议以 / 结尾
                .addConverterFactory(GsonConverterFactory.create())//设置 Json 转换器
                .build();
        WeatherService weatherService = retrofit.create(WeatherService .class);
       Call<Translate> call = weatherService.getcall();
       call.enqueue(new Callback<Translate>() {
           @Override
           public void onResponse(Call<Translate> call, Response<Translate> response) {
               Translate translate = response.body();
               for (int i=0;i<translate.getData().size();i++) {
                 //  Log.i("TAG", "" + i);

                   Log.i("TAG", "" + translate.getData().get(i).getTitle());
               }
           }

           @Override
           public void onFailure(Call<Translate> call, Throwable t) {

           }
       });

    }
}

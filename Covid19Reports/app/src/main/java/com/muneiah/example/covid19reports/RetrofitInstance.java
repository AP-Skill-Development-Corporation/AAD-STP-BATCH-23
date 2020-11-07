package com.muneiah.example.covid19reports;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitInstance {
    public static final String BASE_URL="https://api.covid19api.com";
    static Retrofit retrofit;
    public static Retrofit getCovid19Instance(){
        if (retrofit==null){
            retrofit=new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .build();
        }
        return retrofit;

    }

}

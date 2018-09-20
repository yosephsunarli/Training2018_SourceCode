package com.beonesolution.training2018.data.remote;

import android.content.Context;
import android.util.Log;

import com.beonesolution.training2018.R;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtils {
    public static String BASE_URL = "http://103.60.181.154:50001/b1s/v1/";
    private static SAPService instance;
    private static String TAG;

    public static SAPService getSAPService(Context context) {
        if (instance == null) {
            OkHttpClient okHttpClient = new OkHttpClient.Builder()
                    .addInterceptor(new AddCookieInterceptor(context))
                    .addInterceptor(new ReceivedCookieInterceptor(context))
                    .addInterceptor(getLoggingInterceptor())
                    .build();

            TAG = context.getString(R.string.app_name);

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .callFactory(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            instance = retrofit.create(SAPService.class);
        }
        return instance;
    }

    private static HttpLoggingInterceptor getLoggingInterceptor() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Log.i(TAG, message);
            }
        });
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return interceptor;
    }
}
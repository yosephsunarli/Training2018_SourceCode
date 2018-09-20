package com.beonesolution.training2018.data.remote;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;

import com.beonesolution.training2018.util.Preferences;

import java.io.IOException;
import java.util.HashSet;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class AddCookieInterceptor implements Interceptor
{
    private Context context;

    AddCookieInterceptor(Context context) {
        this.context = context;
    }

    @Override
    public Response intercept(@NonNull Interceptor.Chain chain) throws IOException
    {
        Request.Builder builder = chain.request().newBuilder();
        HashSet<String> preferences = Preferences.getInstance(context).getCookies();
        for (String cookie : preferences) {
            builder.addHeader("Cookie", cookie);
            Log.v("OkHttp", "Adding Header: " + cookie);
        }
        return chain.proceed(builder.build());
    }
}
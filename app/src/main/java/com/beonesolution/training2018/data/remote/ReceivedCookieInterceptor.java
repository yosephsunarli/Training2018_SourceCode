package com.beonesolution.training2018.data.remote;

import android.content.Context;
import android.support.annotation.NonNull;

import com.beonesolution.training2018.util.Preferences;

import java.io.IOException;
import java.util.HashSet;

import okhttp3.Interceptor;
import okhttp3.Response;

public class ReceivedCookieInterceptor implements Interceptor
{
    private Context context;

    ReceivedCookieInterceptor(Context context) {
        this.context = context;
    }

    @Override
    public Response intercept(@NonNull Interceptor.Chain chain) throws IOException
    {
        Response originalResponse = chain.proceed(chain.request());
        if (!originalResponse.headers("Set-Cookie").isEmpty()) {
            HashSet<String> cookies = new HashSet<>(originalResponse.headers("Set-Cookie"));
            Preferences.getInstance(context).setCookies(cookies);
        }
        return originalResponse;
    }
}
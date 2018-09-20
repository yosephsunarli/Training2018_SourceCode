package com.beonesolution.training2018.util;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashSet;

public class Preferences
{
    private static final String PREF_NAME = "lastlogin";
    private static Preferences instance;
    private static SharedPreferences sharedPreferences;
    private static Context context;

    public static Preferences getInstance(Context context) {
        if (instance == null) {
            instance = new Preferences();
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            Preferences.context = context;
        }
        return instance;
    }

    public SharedPreferences getSharedPreferences() {
        return sharedPreferences;
    }

    public long getInteger(String key) {
        return sharedPreferences.getInt(key, 0);
    }

    public String getString(String key) {
        return sharedPreferences.getString(key, "");
    }

    public boolean getBoolean(String key, boolean defValue) {
        return sharedPreferences.getBoolean(key, defValue);
    }

    public boolean writeString(String key, String value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        return editor.commit();
    }

    public boolean writeInteger(String key, int value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(key, value);
        return editor.commit();
    }

    public boolean writeBoolean(String key, boolean value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        return editor.commit();
    }

    public boolean clear() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        return editor.commit();
    }

    public HashSet<String> getCookies() {
        return (HashSet<String>) sharedPreferences.getStringSet("cookies", new HashSet<String>());
    }

    public boolean setCookies(HashSet<String> cookies) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        return editor.putStringSet("cookies", cookies).commit();
    }
}

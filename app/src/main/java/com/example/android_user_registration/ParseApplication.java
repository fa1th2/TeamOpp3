package com.example.android_user_registration;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("AS8uS5tqzJRAcB5F4AqptrIdu216QQqt7l6wBaPX")
                .clientKey("BfbjVuVnb8k0D0Jsp6rRkp8d5CxftcNkiY9wON3g")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

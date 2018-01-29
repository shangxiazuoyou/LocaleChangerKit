package com.shangxiazuoyou.localechangerkit;

import android.app.Application;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 * Created by admin on 2018/1/29.
 */

public class App extends Application {

    public static final List<Locale> SUPPORTED_LOCALES =
            Arrays.asList(
                    new Locale("en", "US"),
                    new Locale("zh", "rCN")
            );

    @Override
    public void onCreate() {
        super.onCreate();
        LocaleChangerKit.initialize(getApplicationContext(), SUPPORTED_LOCALES);
    }
}

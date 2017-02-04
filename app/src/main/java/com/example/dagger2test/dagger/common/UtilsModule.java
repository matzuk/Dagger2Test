package com.example.dagger2test.dagger.common;

import android.support.annotation.NonNull;

import com.example.dagger2test.utils.NumberUtils;
import com.example.dagger2test.utils.StringUtils;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;

/**
 * Created by Matsyuk on 03.02.2017.
 */

@Module
public class UtilsModule {

    @Provides
    @NonNull
    @Reusable
    public NumberUtils provideNumberUtils() {
        return new NumberUtils();
    }

    @Provides
    @NonNull
    public StringUtils provideStringUtils() {
        return new StringUtils();
    }

}

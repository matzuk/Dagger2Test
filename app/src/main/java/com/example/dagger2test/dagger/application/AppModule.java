package com.example.dagger2test.dagger.application;

import android.support.annotation.NonNull;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author e.matsyuk
 */
@Module
public class AppModule {

    @Provides
    @NonNull
    @Singleton
    @Named("SingleThread")
    public Executor provideSingleThreadExecutor() {
        return Executors.newSingleThreadExecutor();
    }

    @Provides
    @NonNull
    @Singleton
    @Named("MultiThread")
    public Executor provideMultiThreadExecutor() {
        return Executors.newCachedThreadPool();
    }

}

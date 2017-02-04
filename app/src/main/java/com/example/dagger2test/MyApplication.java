package com.example.dagger2test;

import android.app.Application;
import android.support.annotation.NonNull;

import com.example.dagger2test.dagger.application.AppComponent;
import com.example.dagger2test.dagger.application.AppModule;
import com.example.dagger2test.dagger.application.DaggerAppComponent;
import com.example.dagger2test.dagger.first_screen.FirstComponent;
import com.example.dagger2test.dagger.first_screen.FirstModule;
import com.example.dagger2test.dagger.first_screen.SpecialModule;
import com.example.dagger2test.dagger.second_screen.SecondComponent;
import com.example.dagger2test.dagger.second_screen.SecondModule;

/**
 * Created by Евгений on 28.01.2017.
 */

public class MyApplication extends Application {

    public static MyApplication getInstance() {
        return instance;
    }

    private static MyApplication instance;

    private AppComponent appComponent;
    private FirstComponent firstComponent;
    private SecondComponent secondComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        // init dagger2 AppComponent
        appComponent = prepareAppComponent().build();
    }

    @NonNull
    protected DaggerAppComponent.Builder prepareAppComponent() {
        return DaggerAppComponent.builder()
                .appModule(new AppModule());
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public FirstComponent getFirstComponent() {
        if (firstComponent == null) {
            firstComponent = getAppComponent()
                    .firstComponentBuilder()
                    .firstModule(new FirstModule())
                    .specialModule(new SpecialModule())
                    .build();
        }
        return firstComponent;
    }

    public SecondComponent getSecondComponent() {
        if(secondComponent == null) {
            secondComponent = getAppComponent()
                    .secondComponentBuilder()
                    .secondModule(new SecondModule())
                    .build();
        }
        return secondComponent;
    }

}

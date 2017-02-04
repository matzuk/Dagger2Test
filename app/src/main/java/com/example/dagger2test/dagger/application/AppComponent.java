package com.example.dagger2test.dagger.application;

import com.example.dagger2test.dagger.common.UtilsModule;
import com.example.dagger2test.dagger.first_screen.FirstComponent;
import com.example.dagger2test.dagger.second_screen.SecondComponent;
import com.example.dagger2test.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author e.matsyuk
 */
@Component(modules = {AppModule.class, UtilsModule.class})
@Singleton
public interface AppComponent {

    FirstComponent.Builder firstComponentBuilder();
    SecondComponent.Builder secondComponentBuilder();

}

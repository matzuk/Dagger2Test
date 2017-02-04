package com.example.dagger2test.dagger.first_screen;

import com.example.dagger2test.business.first.SpecialClass;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Евгений on 04.02.2017.
 */
@Module
public class SpecialModule {

    @FirstScope
    @Provides
    public SpecialClass provideSpecialClass() {
        return new SpecialClass();
    }

}

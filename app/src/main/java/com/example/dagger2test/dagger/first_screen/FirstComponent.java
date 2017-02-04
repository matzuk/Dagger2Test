package com.example.dagger2test.dagger.first_screen;

import com.example.dagger2test.dagger.second_screen.SecondModule;
import com.example.dagger2test.ui.MainActivity;

import dagger.Subcomponent;

/**
 * Created by Matsyuk on 03.02.2017.
 */
@FirstScope
@Subcomponent(modules = {FirstModule.class, SpecialModule.class})
public interface FirstComponent {

    @Subcomponent.Builder
    interface Builder {
        FirstComponent.Builder firstModule(FirstModule firstModule);
        FirstComponent.Builder specialModule(SpecialModule firstModule);
        FirstComponent build();
    }

    void inject(MainActivity mainActivity);

}

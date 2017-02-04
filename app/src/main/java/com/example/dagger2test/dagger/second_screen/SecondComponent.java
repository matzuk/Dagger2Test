package com.example.dagger2test.dagger.second_screen;

import com.example.dagger2test.dagger.common.UtilsModule;
import com.example.dagger2test.dagger.first_screen.FirstModule;
import com.example.dagger2test.dagger.first_screen.FirstScope;
import com.example.dagger2test.ui.MainActivity;
import com.example.dagger2test.ui.SecondActivity;
import com.example.dagger2test.ui.ThirdActivity;

import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by Matsyuk on 03.02.2017.
 */
@SecondScope
@Subcomponent(modules = {SecondModule.class})
public interface SecondComponent {

    @Subcomponent.Builder
    interface Builder {
        SecondComponent.Builder secondModule(SecondModule secondModule);
        SecondComponent build();
    }

    void inject(SecondActivity secondActivity);
    void inject(ThirdActivity thirdActivity);

}

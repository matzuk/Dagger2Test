package com.example.dagger2test.dagger.first_screen;

import com.example.dagger2test.business.first.FirstInteractor;
import com.example.dagger2test.business.first.FirstPresenter;
import com.example.dagger2test.business.first.IFirstInteractor;
import com.example.dagger2test.business.first.IFirstPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Matsyuk on 03.02.2017.
 */

@Module
public class FirstModule {

    @Provides
    @FirstScope
    public IFirstInteractor provideFirstInteractor() {
        return new FirstInteractor();
    }

    @Provides
    @FirstScope
    public IFirstPresenter provideFirstPresenter(IFirstInteractor firstInteractor) {
        return new FirstPresenter(firstInteractor);
    }

}

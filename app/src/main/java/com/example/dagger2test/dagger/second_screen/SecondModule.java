package com.example.dagger2test.dagger.second_screen;

import com.example.dagger2test.business.first.FirstInteractor;
import com.example.dagger2test.business.first.FirstPresenter;
import com.example.dagger2test.business.first.IFirstInteractor;
import com.example.dagger2test.business.first.IFirstPresenter;
import com.example.dagger2test.business.second.ISecondInteractor;
import com.example.dagger2test.business.second.ISecondPresenter;
import com.example.dagger2test.business.second.SecondInteractor;
import com.example.dagger2test.business.second.SecondPresenter;
import com.example.dagger2test.dagger.first_screen.FirstScope;
import com.example.dagger2test.utils.NumberUtils;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Matsyuk on 03.02.2017.
 */

@Module
public class SecondModule {

    @Provides
    @SecondScope
    public ISecondInteractor provideSecondInteractor() {
        return new SecondInteractor();
    }

    @Provides
    @SecondScope
    public ISecondPresenter provideSecondPresenter(ISecondInteractor secondInteractor, NumberUtils numberUtils) {
        return new SecondPresenter(secondInteractor, numberUtils);
    }

}

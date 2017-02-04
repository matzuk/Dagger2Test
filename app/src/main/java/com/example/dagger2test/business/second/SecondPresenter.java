package com.example.dagger2test.business.second;

import com.example.dagger2test.business.first.IFirstInteractor;
import com.example.dagger2test.utils.NumberUtils;

/**
 * Created by Matsyuk on 03.02.2017.
 */

public class SecondPresenter implements ISecondPresenter {

    private ISecondInteractor secondInteractor;
    private NumberUtils numberUtils;

    public SecondPresenter(ISecondInteractor secondInteractor, NumberUtils numberUtils) {
        this.secondInteractor = secondInteractor;
        this.numberUtils = numberUtils;
    }

}

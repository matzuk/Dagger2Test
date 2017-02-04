package com.example.dagger2test.business.first;

/**
 * Created by Matsyuk on 03.02.2017.
 */

public class FirstPresenter implements IFirstPresenter {

    private IFirstInteractor firstInteractor;

    public FirstPresenter(IFirstInteractor firstInteractor) {
        this.firstInteractor = firstInteractor;
    }

}

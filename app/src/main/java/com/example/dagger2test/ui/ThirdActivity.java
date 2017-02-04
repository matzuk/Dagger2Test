package com.example.dagger2test.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.dagger2test.MyApplication;
import com.example.dagger2test.R;
import com.example.dagger2test.business.second.ISecondPresenter;
import com.example.dagger2test.dagger.second_screen.SecondModule;
import com.example.dagger2test.utils.NumberUtils;
import com.example.dagger2test.utils.StringUtils;

import javax.inject.Inject;

/**
 * Created by Matsyuk on 03.02.2017.
 */

public class ThirdActivity extends AppCompatActivity {

    @Inject
    NumberUtils numberUtils;

    @Inject
    StringUtils stringUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        MyApplication.getInstance().getSecondComponent()
                .inject(this);

        numberUtils = null;
    }

}

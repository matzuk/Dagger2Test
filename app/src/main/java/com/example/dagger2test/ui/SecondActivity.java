package com.example.dagger2test.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.dagger2test.MyApplication;
import com.example.dagger2test.R;
import com.example.dagger2test.business.second.ISecondPresenter;
import com.example.dagger2test.business.second.SecondPresenter;
import com.example.dagger2test.dagger.second_screen.SecondModule;
import com.example.dagger2test.utils.NumberUtils;
import com.example.dagger2test.utils.StringUtils;

import javax.inject.Inject;

/**
 * Created by Matsyuk on 03.02.2017.
 */

public class SecondActivity extends AppCompatActivity {

//    @Inject
//    ISecondPresenter secondPresenter;

    @Inject
    NumberUtils numberUtils;

    @Inject
    StringUtils stringUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        MyApplication.getInstance().getSecondComponent()
                .inject(this);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this, ThirdActivity.class));
            }
        });

        numberUtils = null;
    }

}

package com.example.dagger2test.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dagger2test.MyApplication;
import com.example.dagger2test.R;
import com.example.dagger2test.business.first.FirstPresenter;
import com.example.dagger2test.business.first.IFirstPresenter;
import com.example.dagger2test.business.first.SpecialClass;
import com.example.dagger2test.dagger.first_screen.FirstModule;
import com.example.dagger2test.utils.NumberUtils;
import com.example.dagger2test.utils.StringUtils;

import java.util.concurrent.Executor;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

    @Inject
    @Named("SingleThread")
    Executor singleExecutorProvider;

    @Inject
    IFirstPresenter firstPresenter;

    @Inject
    NumberUtils numberUtils;

    @Inject
    StringUtils stringUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        MyApplication.getInstance().getFirstComponent()
                .inject(this);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });

        numberUtils = null;
    }

}

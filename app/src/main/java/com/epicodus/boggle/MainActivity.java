package com.epicodus.boggle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Arrays;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Bind(R.id.newGameButton) Button mNewGameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mNewGameButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == mNewGameButton) {
            Intent intent = new Intent(MainActivity.this, GameboardActivity.class);
            startActivity(intent);
        }
    }



}

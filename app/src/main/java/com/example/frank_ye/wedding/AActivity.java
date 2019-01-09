package com.example.frank_ye.wedding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class AActivity extends AppCompatActivity {

    private  static final int ReQUEST_CODE=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        Button btn_all = findViewById(R.id.btn_all);
        Button btn_vietnam = findViewById(R.id.btn_vietnam);
        Button btn_china = findViewById(R.id.btn_china);
        Button btn_philippines = findViewById(R.id.btn_philippines);
        Button btn_indonesia = findViewById(R.id.btn_indonesia);

        btn_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AActivity.this, BActivity.class);
                startActivity(intent);
            }
        });

        btn_vietnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AActivity.this, CActivity.class);
                startActivity(intent);
            }
        });

        btn_china.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AActivity.this, DActivity.class);
                startActivity(intent);
            }
        });

        btn_philippines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AActivity.this, EActivity.class);
                startActivity(intent);
            }
        });

        btn_indonesia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AActivity.this, FActivity.class);
                startActivity(intent);
            }
        });

    }

}

package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private ListView list1;
    private Button btn_move;
    private EditText et_test;
    private  String str;
    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_n;
    private Button btn_f;
    ImageView iamge1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // 흔적


        iamge1 = (ImageView)findViewById(R.id.image1);
        iamge1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "중앙고 앱입니다!",Toast.LENGTH_SHORT).show();

            }
        });

        btn_1 = findViewById(R.id.btn_1);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Jungang1. class);
                startActivity(intent);
            }
        });

        btn_2 = findViewById(R.id.btn_2);
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Jungang2. class);
                startActivity(intent);
            }
        });

        btn_3 = findViewById(R.id.btn_3);
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Jungang3. class);
                startActivity(intent);
            }
        });

        btn_n = findViewById(R.id.btn_n);
        btn_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Note.class);
                startActivity(intent);
            }
        });

        btn_f = findViewById(R.id.btn_f);
        btn_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Food.class);
                startActivity(intent);
            }
        });











    }
}
package com.example.mangement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import android. view. View;

public class scrollview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrollview);

    }
    public void onButton1Clicked(View view){
    Toast.makeText(getApplicationContext(), "버튼이 눌렸습니다!", Toast.LENGTH_SHORT).show();
    }
}
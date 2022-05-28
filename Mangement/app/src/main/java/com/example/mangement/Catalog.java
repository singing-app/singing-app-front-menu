package com.example.mangement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Catalog extends AppCompatActivity {

    private CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10, cb11, cb12, cb13, cb14, cb15;
    private TextView cb_title, cb_text;
    private Button cb_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);

        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);
        cb6 = findViewById(R.id.cb6);
        cb7 = findViewById(R.id.cb7);
        cb8 = findViewById(R.id.cb8);
        cb9 = findViewById(R.id.cb9);
        cb10 = findViewById(R.id.cb10);
        cb11 = findViewById(R.id.cb11);
        cb12 = findViewById(R.id.cb12);
        cb13 = findViewById(R.id.cb13);
        cb14 = findViewById(R.id.cb14);
        cb15 = findViewById(R.id.cb15);
        cb_title = findViewById(R.id.cb_title);
        cb_text = findViewById(R.id.cb_text);
        cb_button = findViewById(R.id.cb_button);

        cb_button.setOnClickListener(new View.OnClickListener() {//결과값 나오게~~~
            @Override
            public void onClick(View view) {

                String str_result = "";//결과값 초기화
                if(cb1.isChecked()){//체크 박스에 체크가 되어있다면...
                    str_result += cb1.getText().toString();
                }
                if(cb2.isChecked()){
                    str_result += cb2.getText().toString();
                }
                if(cb3.isChecked()){
                    str_result += cb3.getText().toString();
                }
                if(cb4.isChecked()){
                    str_result += cb4.getText().toString();
                }
                if(cb5.isChecked()){
                    str_result += cb5.getText().toString();
                }
                if(cb6.isChecked()){
                    str_result += cb6.getText().toString();
                }
                if(cb7.isChecked()){
                    str_result += cb7.getText().toString();
                }
                if(cb8.isChecked()){
                    str_result += cb8.getText().toString();
                }
                if(cb9.isChecked()){
                    str_result += cb9.getText().toString();
                }
                if(cb10.isChecked()){
                    str_result += cb10.getText().toString();
                }
                if(cb11.isChecked()){
                    str_result += cb11.getText().toString();
                }
                if(cb12.isChecked()){
                    str_result += cb12.getText().toString();
                }
                if(cb13.isChecked()){
                    str_result += cb13.getText().toString();
                }
                if(cb14.isChecked()){
                    str_result += cb14.getText().toString();
                }
                if(cb15.isChecked()){
                    str_result += cb15.getText().toString();
                }

                cb_text.setText(str_result);//체크 박스에 체크되어 있는 결과를 출력
            }
        });



    }
}
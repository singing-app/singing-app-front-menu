package com.example.test;

import static androidx.appcompat.widget.AppCompatDrawableManager.get;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.lang.annotation.Documented;

public class MainActivity extends AppCompatActivity {

    private Button getBtn;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result=(TextView) findViewByld(R.id.result);
        getBtn = (Button) findViewById(R.id.getBtn);
        getBtn.setOnClickListener((view) > {getwebsite()});

        private void hetWebsite(){
            new Thread((Runnable) () > {
                final StringBuilder builder = new StringBuilder();

                try{
                    Document doc = jsoup.connet(url:"https://www.naver.com").get();
                    String title = doc.title();
                    Elements links = doc.select(cssQuery:"a{href");

                    builder.append(title).append("\n");

                }catch (10Exception e){
                    builder.append("Error");
            }

                runOnUiThread() >{
                    result.setText(builder.toString());
                });
            });.start();
        }


    }
}
package com.example.wintowin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;

import org.jsoup.Jsoup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        thetext = findViewById(R.id.t1);
        setContentView(R.layout.activity_main);

        description_webscrape dw= new description_webscrape();
        dw.execute();

    }
    private class description_webscrape extends AsyncTask<Void, Void, Void>{
        @Override
        protected void onPreExecute(){
            super.onPreExecute();
        }
        @Override
        protected Void doInBakground(Void... voids){

org.jsoup.nodes.Document document = null;
try {
    document = Jsoup.connect(url:"https://www.google.com/search?q=mesozoic+era").get();

} catch (IOException e){
    e.printStackTrace();
}

org.jsoup.select.Elements elements = document.getElementsByClass(className:"hgKElc" )

            String thedescription = elements.text();

thetext.setText(thedescription);


return null;
        }

        @Override
        protected void onPostExecute(Void aVoid){



        }
    }

}

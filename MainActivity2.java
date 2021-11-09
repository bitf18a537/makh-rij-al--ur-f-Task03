package com.example.arabicwords;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView SHOWMARKS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        SHOWMARKS = (TextView) findViewById(R.id.marks);

        Intent intent = getIntent();
        String getresult = intent.getStringExtra("value");
        SHOWMARKS.setText(getresult);



    }



    public void ShareResult (View v)
    {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);

        String URL_TO_SHARE = "";
        //# change the type of data you need to share,
        //# for image use "image/*"
        intent.setType("text/plain");

        intent.putExtra(Intent.EXTRA_TEXT, URL_TO_SHARE);
        startActivity(Intent.createChooser(intent, "Share"));
    }


}
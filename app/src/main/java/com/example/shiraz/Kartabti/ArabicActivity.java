package com.example.shiraz.Madrassati;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by shiraz on 2/23/18.
 */

public class ArabicActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arabic_activity);

        //Create Arabic activity
        final TextView memorize = (TextView) findViewById(R.id.mem);
        memorize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent memIntent = new Intent(ArabicActivity.this, MemActivity.class);
                startActivity(memIntent);
            }
        });


        //Create Arabic activity
        final TextView exercice = (TextView) findViewById(R.id.ex);
        exercice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent exIntent = new Intent(ArabicActivity.this, Quiz_1.class);
                startActivity(exIntent);
            }
        });
    }
}
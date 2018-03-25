package com.example.shiraz.Madrassati;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        //Create Arabic activity
        final TextView arabic = (TextView) findViewById(R.id.ar);
        arabic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent arabicIntent = new Intent(MainActivity.this, ArabicActivity.class);
                startActivity(arabicIntent);
            }
        });






    }
}


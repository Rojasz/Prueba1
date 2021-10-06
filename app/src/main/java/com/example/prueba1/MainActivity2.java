package com.example.prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    String counter,unused;
    ImageButton IB;
    TextView Total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        IB = (ImageButton) findViewById(R.id.imageButton);
        Total = (TextView) findViewById(R.id.total);
        Total.setText(getIntent().getStringExtra("CONTADOR"));

        IB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(I);
            }
        });
    }
}
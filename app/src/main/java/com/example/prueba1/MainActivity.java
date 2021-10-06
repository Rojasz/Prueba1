package com.example.prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button CNT;
    EditText user, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CNT = (Button) findViewById(R.id.btn_connect);
        user = (EditText) findViewById(R.id.User);
        pass = (EditText) findViewById(R.id.pass);

        CNT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((user.getText().toString().equals("adm123")) && (pass.getText().toString().equals("adm123")))
                {
                    Intent I = new Intent(getApplicationContext(),MainActivity2.class);
                    startActivity(I);
                } else {
                    Toast.makeText(getApplicationContext(), "Usuario y/o contraseña incorrectos.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
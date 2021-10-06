package com.example.prueba1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    EditText name,age;
    Spinner SP;
    Button add;
    Integer counter = 0;
    String scounter = counter.toString();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        name = (EditText) findViewById(R.id.name);
        age = (EditText) findViewById(R.id.age);
        SP = (Spinner) findViewById(R.id.spinner);
        add = (Button) findViewById(R.id.btn_add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getText().toString().equals("")||age.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Rellene todos los campos.", Toast.LENGTH_LONG).show();
                }else{
                    showAlertDialog();
                }
            }
        });
    }
     public void showAlertDialog(){
         new AlertDialog.Builder(this)
                 .setTitle("Agregar")
                 .setMessage("Desea agregar estos datos?")
                 .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialogInterface, int i) {
                         Intent I = new Intent(getApplicationContext(),MainActivity2.class);
                         counter = 1;
                         I.putExtra("CONTADOR", scounter);
                         startActivity(I);
                     }
                 })
                 .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialogInterface, int i) {
                         Log.d("Mensaje","Cancelado.");
                     }
                 })
                 .show();
     }
}
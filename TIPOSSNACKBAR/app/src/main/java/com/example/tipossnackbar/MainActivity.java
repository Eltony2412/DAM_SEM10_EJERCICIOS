package com.example.tipossnackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnCorto, btnLargo, btnIndefi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //vinculacion de botonos
        btnCorto = findViewById(R.id.button_corto);
        btnLargo = findViewById(R.id.button_largo);
        btnIndefi = findViewById(R.id.button_indefinido);

        //eventos clicks:
        btnCorto.setOnClickListener(this);
        btnLargo.setOnClickListener(this);
        btnIndefi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button_corto){
            Snackbar.make(v, "SnackBar Corto", Snackbar.LENGTH_SHORT).show();
        }
        if(v.getId() == R.id.button_largo){
            Snackbar.make(v, "SnackBar Largo", Snackbar.LENGTH_LONG).show();
        }
        if(v.getId() == R.id.button_indefinido) {
            Snackbar.make(v, "SnackBar Indefinido", Snackbar.LENGTH_INDEFINITE).show();
        }
    }
}
package com.example.cursos_botonfinalizar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ListView lista;
    List<String> cursos;
    Button btnfinalizar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //se vincula lista
        lista = findViewById(R.id.listView);
        //se agregan los cursos
        cursos = new ArrayList<>();
        cursos.add("Matematica");
        cursos.add("Desarrollo de Aplicaciones Moviles");
        cursos.add("Gestion de Procesos de Negocios");
        cursos.add("Aquitectura de Compuradora");

        //se declara un adaptador
        ArrayAdapter adaptadorCursos = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1, cursos
        );
        //se conecta el adaptador con la lista
        lista.setAdapter(adaptadorCursos);
        //vinculamos boton
        btnfinalizar = findViewById(R.id.buttonFinalizar);
        //se crea el evento click
        btnfinalizar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.buttonFinalizar){
            Toast.makeText(this, "Matricula Completa", Toast.LENGTH_SHORT).show();
        }
    }
}
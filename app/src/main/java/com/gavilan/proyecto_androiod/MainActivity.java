package com.gavilan.proyecto_androiod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Creamos la variables que harán referencia a los widgets
    private TextView txtTitulo;
    private Button btnIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Realizar las referencias
        txtTitulo = findViewById(R.id.txtTitulo);
        btnIniciar = findViewById(R.id.btnIniciar);



    }

    public void Saludar(View view){
        Toast.makeText(this,"Hiciste click",Toast.LENGTH_LONG).show();
    }

    public void Despedir(View view){
        Toast.makeText(this,"Adios",Toast.LENGTH_LONG).show();
    }
}
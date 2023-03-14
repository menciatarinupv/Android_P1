package com.example.p_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    //se crea una variale por cada texto del tipo qeu sea el texto
    private TextView textoCharacters;
    private EditText textoEnterWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //log.d OBLIGATORIO
        Log.d("prueba", "estoy en oncreate()"); //debug
        //siempre que se crea la app:
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // pedir referencia al texto para escribir cosas
        //he cambiado el id de los textos previamente en activity_main.xml
        textoCharacters = (TextView) findViewById(R.id.textoCharacters);
        textoEnterWord = (EditText) findViewById(R.id.textoEnterWord);
    }
        //al pulsar el botón ir a otra actividad
    public void botonPulsado(View quien) {
        Log.d("Boton", "Botón pulsado");

    }







    }

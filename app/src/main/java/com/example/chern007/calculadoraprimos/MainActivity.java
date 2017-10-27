package com.example.chern007.calculadoraprimos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText mtxtResultado = (EditText) findViewById(R.id.mtxtResultado);

mtxtResultado.setText("mjbdfhjgdfkjbkjdvfakljbcdvf\njbvgfkjbh");
    }


//    public static int calculaNsimoPrimo(int nsimo) {
//        int resultado;
//
//
//        return resultado;
//    }


}

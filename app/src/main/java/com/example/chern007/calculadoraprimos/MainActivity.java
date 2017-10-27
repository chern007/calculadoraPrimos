package com.example.chern007.calculadoraprimos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText mtxtResultado = (EditText) findViewById(R.id.mtxtResultado);

        mtxtResultado.setText("mjbdfhjgdfkjbkjdvfakljbcdvf\njbvgfkjbh");
    }


    public static int calculaNsimoPrimo(int nsimo) {
        int resultado;


        List<Integer> primos = new ArrayList<Integer>();

        int numerito = 1;

        while (primos.size() < nsimo + 1) {


            for (int i = 2; i < numerito; i++) {

                if ((numerito % i) == 0) {


                    break;
                }


            }

            numerito++;
        }


        return resultado;
    }


}

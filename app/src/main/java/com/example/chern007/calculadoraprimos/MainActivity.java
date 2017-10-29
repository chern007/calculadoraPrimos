package com.example.chern007.calculadoraprimos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText mtxtResultado = (EditText) findViewById(R.id.mtxtResultado);

        final EditText mtxtNsimo = (EditText) findViewById(R.id.txtPosicion);

        final Button button = (Button) findViewById(R.id.btCalcular);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int primoBuscado = calculaNsimoPrimo(Integer.parseInt(mtxtNsimo.getText().toString()));

                mtxtResultado.setText(String.valueOf(primoBuscado));


            }
        });


    }


    public static int calculaNsimoPrimo(int nsimo) {


        List<Integer> primos = new ArrayList<>();

        int numerito = 1;

        boolean resto0 = false;

        while (primos.size() < nsimo + 1) {

            for (int i = 1; i < numerito; i++) {

                if ((numerito % i) == 0 && i != 1) {

                    resto0 = true;

                    break;
                }
            }


            if (resto0 == false) {

                primos.add(numerito);

            } else {

                resto0 = false;
            }

            numerito++;
        }

        if (nsimo == 1) {

            return 1;

        } else {

            return primos.get(nsimo - 1);
        }

    }


}

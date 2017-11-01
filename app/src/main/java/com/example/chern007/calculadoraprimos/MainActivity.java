package com.example.chern007.calculadoraprimos;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static List<Integer> primos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creo una ventana de alerta para avisar si no se ha introducido algun valor
        final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Vuelve a intentarlo");
        alertDialog.setMessage("No has introducido ningún valor.");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        //


        final EditText mtxtResultado = (EditText) findViewById(R.id.mtxtResultado);

        final EditText mtxtNsimo = (EditText) findViewById(R.id.txtPosicion);

        final Button button = (Button) findViewById(R.id.btCalcular);

        final calculaPrimo calculo1 = new calculaPrimo();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String entrada;
                if ((entrada = mtxtNsimo.getText().toString()).equals("")) {

                    alertDialog.show();
                    return;
                }

                //int primoBuscado = calculaNsimoPrimo(Integer.parseInt(entrada));
                int primoBuscado = calculo1.calculaNsimoPrimo(Integer.parseInt(entrada));

                mtxtResultado.setText("El primo número " + entrada + " es el " + String.valueOf(primoBuscado) + ".");

            }
        });


    }


}

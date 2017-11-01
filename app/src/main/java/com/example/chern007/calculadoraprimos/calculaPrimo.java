package com.example.chern007.calculadoraprimos;


/**
 * Clase para calcular numeros primos
 * Created by Carlos on 29/10/2017.
 */

public class calculaPrimo {

    int nsimo;
    int resultado;

    public int calculaNsimoPrimo(int nsimo) {


        if (nsimo > MainActivity.primos.size()) {

            int numerito = 1;

            boolean resto0 = false;

            while (MainActivity.primos.size() < nsimo) {


                if (!MainActivity.primos.contains(numerito)) {

                    for (int i = 1; i < numerito; i++) {

                        if ((numerito % i) == 0 && i != 1) {

                            resto0 = true;

                            break;
                        }
                    }

                    //si el numero no tiene ningun resto igual a 0 y no está contenido
                    if (!resto0 ) {

                        MainActivity.primos.add(numerito);

                    } else {

                        resto0 = false;
                    }


                }

                numerito++;
            }

        }

        if (nsimo == 1) {

            return 1;

        } else {

            return MainActivity.primos.get(nsimo - 1);
        }

    }


}

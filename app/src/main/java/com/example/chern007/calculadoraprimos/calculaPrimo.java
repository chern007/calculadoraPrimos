package com.example.chern007.calculadoraprimos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Carlos on 29/10/2017.
 */

public class calculaPrimo {

    int nsimo;
    int resultado;

    public int calculaNsimoPrimo(int nsimo) {

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


            if (!resto0) {

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

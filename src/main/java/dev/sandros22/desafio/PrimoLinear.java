package dev.sandros22.desafio;

import java.util.ArrayList;
import java.util.List;

public class PrimoLinear {
    public static List<Integer> calculaPrimos(int valor) {
        List<Integer> primos = new ArrayList<>();
        for (int i = 2; i < valor; i++) {
            boolean primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                primos.add(i);
            }
        }
        return primos;
    }
}

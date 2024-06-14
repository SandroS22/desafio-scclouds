package dev.sandros22.desafio;

import java.util.ArrayList;
import java.util.List;

public class PrimoRecursivo {
    public static List<Integer> calculaPrimos(int valorFinal, int num, int divisor) {
        if (valorFinal < 1) throw new IllegalArgumentException("O valor não pode ser inferior a 1");
        List<Integer> primos = new ArrayList<>();
        if (num > valorFinal) {
            return primos;
        }
        if (divisor < num) {
            if (num % divisor == 0) {
                primos.addAll(calculaPrimos(valorFinal, num + 1, 2));
                return primos;
            }
            primos.addAll(calculaPrimos(valorFinal, num, divisor + 1));
            return primos;
        }
        primos.add(num);
        primos.addAll(calculaPrimos(valorFinal, num + 1, 2));
        return primos;
    }
}

package dev.sandros22.desafio;

public class FibLinear {

    public static int fibonacci(int n) {
        int number = 1;
        if (n < 0) throw new IllegalArgumentException("O valor não pode ser inferior a 0");
        if (n <= 1) return n;
        int temp = 0;
        for (int i = 2; i <= n; i++) {
            number += temp;
            temp = number - temp;
        }
        return number;
    }

}

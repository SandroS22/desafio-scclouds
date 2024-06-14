package dev.sandros22.desafio;

public class FibRecursivo {

    public static int fibonacci(Integer n) {
        if (n < 0) throw new IllegalArgumentException("O valor não pode ser inferior a 0");
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

package dev.sandros22;

import dev.sandros22.desafio.FibLinear;
import dev.sandros22.desafio.FibRecursivo;
import dev.sandros22.desafio.PrimoRecursivo;
import dev.sandros22.desafio.PrimoLinear;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            while (true) {
                System.out.println("1 - Fibonacci\n2 - Primos\n0 - Encerrar");
                System.out.print("Escolha uma opção: ");
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        fib();
                        return;
                    case 2:
                        primos();
                        return;
                    case 0:
                        System.out.println("Encerrando...");
                        return;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida");
        }
    }

    public static void fib() {
        System.out.print("Insira o valor: ");
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        scanner.close();

        System.out.println("Recursivo:");
        System.out.println(FibRecursivo.fibonacci(valor));
        System.out.println("Linear:");
        System.out.println(FibLinear.fibonacci(valor));
    }

    public static void primos() {
        System.out.print("Insira o valor: ");
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        scanner.close();

        System.out.println("Recursivo:");
        System.out.println(PrimoRecursivo.calculaPrimos(valor, 2, 2));
        System.out.println("Linear:");
        System.out.println(PrimoLinear.calculaPrimos(valor));
    }
}
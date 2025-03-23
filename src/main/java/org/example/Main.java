package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== KALKULATOR ===");
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            System.out.println("5. Pierwiastek kwadratowy");
            System.out.println("6. Potęgowanie");
            System.out.println("7. Modulo");
            System.out.println("0. Wyjście");
            System.out.print("Wybierz opcję: ");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Zamykanie kalkulatora...");
                break;
            }

            double num1 = 0, num2 = 0;
            if (choice >= 1 && choice <= 4 || choice == 6 || choice == 7) {
                System.out.print("Podaj pierwszą liczbę: ");
                num1 = scanner.nextDouble();
                System.out.print("Podaj drugą liczbę: ");
                num2 = scanner.nextDouble();
            } else if (choice == 5) {
                System.out.print("Podaj liczbę: ");
                num1 = scanner.nextDouble();
            }

            try {
                double result = 0;
                switch (choice) {
                    case 1:
                        result = calculator.add(num1, num2);
                        break;
                    case 2:
                        result = calculator.substract(num1, num2);
                        break;
                    case 3:
                        result = calculator.multiply(num1, num2);
                        break;
                    case 4:
                        result = calculator.divide(num1, num2);
                        break;
                    case 5:
                        result = calculator.sqrt(num1);
                        break;
                    case 6:
                        result = calculator.power(num1, num2);
                        break;
                    case 7:
                        result = calculator.modulo(num1, num2);
                        break;
                    default:
                        System.out.println("Niepoprawny wybór!");
                        continue;
                }
                System.out.println("Wynik: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Błąd: " + e.getMessage());
            }
        }
        scanner.close();
    }
}

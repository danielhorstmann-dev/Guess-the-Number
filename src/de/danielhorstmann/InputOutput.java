package de.danielhorstmann;

import java.util.Scanner;

public class InputOutput {

    private final Scanner scanner = new Scanner(System.in);

    public void right() {
        System.out.println("That's right");
    }

    public void wrong() {
        System.out.println("That's wrong");
    }

    public Integer readInteger(Integer max) {
        int number = -1;
        while (true) {
            try {
                System.out.print("Your guess number: ");
                number = scanner.nextInt();
                if (number < 1 || number > max) {
                    System.out.println("Not in range! .. 1 - " + max);
                    continue;
                }
                break;
            } catch (RuntimeException e) {
                System.out.println("Your input is not a number -> " + e.getMessage());
            }
            scanner.nextLine();
        }
        return number;
    }

    public int readMaxInteger(Integer maxNumber) {
        int number;
        while (true) {
            try {
                System.out.print("Your positiv maximal number (at least 10): ");
                number = scanner.nextInt();
                if (number < 10) {
                    System.out.println("Your number are not positiv or to low..");
                    continue;
                }
                break;
            } catch (RuntimeException e) {
                System.out.println("Your input is not a number or is to big -> " + e.getMessage());
            }
            scanner.nextLine();
        }
        return number;
    }
}

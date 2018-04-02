package pl.waw.sgh.pl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give your name: ");
        String name = scanner.next();
        System.out.println("Hello " + name);

        System.out.println("Please give your age: ");
        int age = 0;
        //int age = scanner.nextInt();
        System.out.println("Age: " + age);


        boolean success = false;

        while (!success) {
            try {
                age = scanner.nextInt();
            } catch (InputMismatchException ie) {

            }
        }
    }
}
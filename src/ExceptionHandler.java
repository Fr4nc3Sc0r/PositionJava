/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author franc
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandler {

    // Metodo per gestire input numerici con retry
    public static int getValidValue(Scanner scanner, int min, int max, String fieldName) {
        while (true) {
            try {
                System.out.print("Inserisci " + fieldName + " (" + min + "-" + max + "): ");
                int value = scanner.nextInt();

                if (value < min || value > max) {
                    System.err.println("Valore fuori intervallo!");
                    continue;
                }
                return value; // Valore valido, esci dal loop

            } catch (InputMismatchException e) {
                System.err.println("Devi inserire un numero!");
                scanner.nextLine(); // Pulisci buffer
            }
        }
    }

}

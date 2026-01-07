/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Latitude extends Position {
    private static int grade;
    private static char orientament;
    private static int method = Position.getMethod();
    private static Scanner input = new Scanner(System.in);

    public Latitude(int grade, char orientament) {
        this.grade = grade;
        this.orientament = orientament;
    }

    public static int getGrade() {
        return grade;
    }

    public static void setGrade(int grade) {
        Latitude.grade = grade;
    }

    public static char getOrientament() {
        return orientament;
    }

    public static void setOrientament(char orientament) {
        Latitude.orientament = orientament;
    }

    public static int getMethod() {
        return method;
    }

    public static void setMethod(int method) {
        Latitude.method = method;
    }

    public static Latitude setLatitude() {
        if (method == 0) {
            do {
                System.out.println("Inserisci i gradi in base al metodo che hai scelto");

                grade = input.nextInt();

                orientament = input.next().toUpperCase().charAt(0);

            } while ((grade < 0 || grade > 180) && (orientament != 'E' && orientament != 'W'));
        } else if (method == 1) {
            do {
                System.out.println("Inserisci i gradi in base al metodo che hai scelto");

                grade = input.nextInt();

            } while (grade < -180 || grade > 180);
        }

        Latitude latitude = new Latitude(grade, orientament);

        return latitude;
    }

}

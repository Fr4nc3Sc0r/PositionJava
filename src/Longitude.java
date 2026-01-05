/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Longitude extends Position {

    private static int grade;
    private static char orientament;
    private static int method = Position.getMethod();
    private static Scanner input = new Scanner(System.in);

    public Longitude(int grade, char orientament) {
        this.grade = grade;
        this.orientament = orientament;
    }

    public int getGrade() {
        return grade;
    }

    public static Longitude setLongitude() {
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

        Longitude longitude = new Longitude(grade, orientament);

        return longitude;
    }

}// fine classe

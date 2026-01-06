/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author franc
 */

import java.util.Scanner;

public class Position {

    private Longitude longitude;
    private Latitude latitude;
    public static int method = 0;
    private Scanner input = new Scanner(System.in);

    public void selectMethod(int n) {
        switch (n) {
            case 0:
                method = 0; // method with 0-90/0-180 N-S-E-W notation
                break;
            case 1:
                method = 1;// method with -90+90/-180+180 notation
                break;
        }

    }

    public Position() {
        longitude = Longitude.setLongitude();
        latitude = Latitude.setLatitude();
    }

    public static int getMethod() {
        return method;
    }

}

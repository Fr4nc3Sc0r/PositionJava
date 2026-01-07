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
    private Position[] position = new Position[100];
    private int counter = 0;

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
        position[counter] = new Position(longitude, latitude);

    }

    public Position(Longitude longitude, Latitude latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public static int getMethod() {
        return method;
    }

    public static double calcDistance()
    {
        double distance;

        System.out.println("Inserire posizione 1");

        Position pos1 = new Position();
        Position pos2 = new Position();

        distance = 2*6371*Math.asin(double)(Math.sqrt(Math.pow(((double)pos2.getLatitude() - (double)pos1.getLatitude()) /(double)2, 2) + Math.cos(pos1.getLatitude())*Math.cos(pos2.getLatitude()*(Math.pow(Math.sin((double)pos2.getLongitude() - (double)pos1.getLongitude()) /(double)2, 2)))));



        return distance;


    }

    public int getLongitude() {
        return Longitude.getGrade();
    }

    public void setLongitude(Longitude longitude) {
        this.longitude = longitude;
    }

    public int getLatitude() {
        return Latitude.getGrade();
    }

    public void setLatitude(Latitude latitude) {
        this.latitude = latitude;
    }

    public static void setMethod(int method) {
        Position.method = method;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public Position[] getPosition() {
        return position;
    }

    public void setPosition(Position[] position) {
        this.position = position;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

}

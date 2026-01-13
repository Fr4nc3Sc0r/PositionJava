package posizione;

import java.util.Scanner;

public class Latitudine {
    private int gradi;
    private int primi;
    private int secondi;
    private Double latitudine;

    public Latitudine(int gradi, int primi, int secondi) {
        Scanner input = new Scanner(System.in);
        while (gradi < -90 || gradi > 90) {
            if (gradi < -90 || gradi > 90) {
                System.out.println("Valore dei gradi non valido! Inserisci un valore compreso tra -90 e +90 ");
                gradi = input.nextInt();
            }
        }
        this.gradi = gradi;

        while (primi < 0 || primi > 60) {
            if (primi < 0 || primi > 60) {
                System.out.println("Valore dei primi non valido! Inserisci un valore compreso tra 0 e 360 ");
                primi = input.nextInt();
            }
        }
        this.primi = primi;

        while (secondi < 0 || secondi > 60) {
            if (secondi < 0 || secondi > 60) {
                System.out.println("Valore dei secondi non valido! Inserisci un valore compreso tra 0 e 360 ");
                secondi = input.nextInt();
            }
        }
        this.secondi = secondi;
    }

    public Latitudine(Double latitudine) {
        Scanner input = new Scanner(System.in);
        while (latitudine < -180 || latitudine > 180) {
            if (latitudine < -180 || latitudine > 180) {
                System.out.println("Valore della longitudine non valido! Inserisci un valore compreso tra 0 e 90 ");
                latitudine = input.nextDouble();
            }
        }
        this.latitudine = latitudine;
    }

    public int getGradi() {
        return gradi;
    }

    public int getPrimi() {
        return primi;
    }

    public int getSecondi() {
        return secondi;
    }

    @Override
    public String toString() {
        if (gradi > 0)
            return gradi + "° " + primi + "' " + secondi + "\" N";
        else if (gradi < 0)
            return gradi + "° " + primi + "' " + secondi + "\" S";
        else
            return Double.toString(latitudine);
    }

    public Double getLatitudine() {
        return latitudine;
    }

}

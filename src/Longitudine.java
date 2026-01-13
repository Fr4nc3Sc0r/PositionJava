package posizione;

import java.util.Scanner;

public class Longitudine {
    private int gradi;
    private int primi;
    private int secondi;
    private Double longitudine;

    public Longitudine(int gradi, int primi, int secondi) {
        Scanner input = new Scanner(System.in);
        while (gradi < -180 || gradi > 180) {
            if (gradi < -180 || gradi > 180) {
                System.out.println("Valore dei gradi non valido! Inserisci un valore compreso tra 0 e 90 ");
                gradi = input.nextInt();
            }
        }
        this.gradi = gradi;

        while (primi < 0 || primi > 60) {
            if (primi < 0 || primi > 60) {
                System.out.println("Valore dei primi non valido! Inserisci un valore compreso tra 0 e 90 ");
                primi = input.nextInt();
            }
        }
        this.primi = primi;

        while (secondi < 0 || secondi > 60) {
            if (secondi < 0 || secondi > 60) {
                System.out.println("Valore dei secondi non valido! Inserisci un valore compreso tra 0 e 90 ");
                secondi = input.nextInt();
            }
        }
        this.secondi = secondi;
    }

    public Longitudine(Double longitudine) {
        this.longitudine = longitudine;
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
            return gradi + "° " + primi + "' " + secondi + "\" E";
        else if (gradi < 0)
            return gradi + "° " + primi + "' " + secondi + "\" O";
        else
            return Double.toString(longitudine);
    }

    public Double getLongitudine() {
        return "" + longitudine;
    }

}
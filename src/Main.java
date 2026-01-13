package posizione;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scelta;
        Posizione posizione = null;

        do {
            System.out.println("1 - Inserisci le coordinate nel sistema sessagesimale");
            System.out.println("2 - Inserisci le coordinate nel sistema decimale");
            System.out.println("3 - Passa da decimale a sessagesimale");
            System.out.println("4 - Passa da sessagesimale a decimale");
            System.out.println("5 - Esci");
            scelta = input.nextInt();
            switch (scelta) {
                case 1: {
                    System.out.print("Inserisci la latitudine in gradi, primi e secondi: ");
                    Latitudine latitudine = new Latitudine(input.nextInt(), input.nextInt(), input.nextInt());
                    System.out.print("Inserisci la longitudine in gradi, primi e secondi: ");
                    Longitudine longitudine = new Longitudine(input.nextInt(), input.nextInt(), input.nextInt());
                    posizione = new Posizione(latitudine, longitudine);
                    System.out.println(posizione);
                }
                    break;
                case 2: {
                    System.out.print("Inserisci la latitudine in decimale, prima la latitudine e poi la longitudine ");
                    Latitudine latitudine = new Latitudine(input.nextDouble());
                    Longitudine longitudine = new Longitudine(input.nextDouble());
                    posizione = new Posizione(latitudine, longitudine);
                }
                    break;
                case 3: {
                    if (posizione != null) // ho avuto molti errori prima di inserire l'if, poichè mi dava errore di
                                           // compilazione dato che
                        Posizione.getSessaDecimale(posizione); // lo rilevava non inizializzato
                    else
                        System.out.println("errore, valore nullo");
                }
                    break;
                case 4: {
                    if (posizione != null) // ho avuto molti errori prima di inserire l'if, poichè mi dava errore di
                                           // compilazione dato che
                        Posizione.getDecimale(posizione); // lo rilevava non inizializzato
                    else
                        System.out.println("errore, valore nullo");
                }

            }
        } while (scelta != 5);
    }
}

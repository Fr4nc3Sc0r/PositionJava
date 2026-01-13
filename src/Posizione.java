package posizione;

import java.time.LocalDateTime;

public class Posizione {
    private Latitudine latitudine;
    private Longitudine longitudine;
    private LocalDateTime dataOra;

    public Posizione(Latitudine latitudine, Longitudine longitudine) {
        this.latitudine = latitudine;
        this.longitudine = longitudine;
        dataOra = LocalDateTime.now();
    }

    public getDecimale()
    {

    }

    public static void getSessaDecimale(Posizione posizione) {
        Double latitudine = posizione.getLatitudine().getLatitudine(); // otteniamo i valori di tipo double
                                                                       // inizializzati dal costruttore
        Double longitudine = posizione.getLongitudine().getLongitudine();

        int gradi;
        int primi;
        int secondi;

        gradi = (int) latitudine; // ad ogni operazione eseguiamo il casting per evitare problemi
        primi = (int) ((latitudine - gradi) * 60);
        secondi = (int) ((((latitudine - primi) * 60) - primi) * 60);

        Latitudine latitude = new Latitudine(gradi, primi, secondi); // otteniamo la latitudine in sessadecimale

        gradi = (int) longitudine;
        primi = (int) ((longitudine - gradi) * 60);
        secondi = (int) ((((longitudine - gradi) * 60) - primi) * 60);

        Longitudine longitude = new Longitudine(gradi, primi, secondi); // stesso per la longitudine

        System.out.println(latitude + "\n" + longitude);
    }

    public static void getDecimale(Posizione posizione) // facciamo lo stesso ragionamento ma con la formula inversa,
                                                        // maq senza casting
    {
        int gradi; // dato che abbiamo già il tipo di variabile che ci serve (ce lo creiamo)
        int primi;
        int secondi;
        Double decimale;

        gradi = posizione.getLatitudine().getGradi();
        primi = posizione.getLatitudine().getPrimi();
        secondi = posizione.getLatitudine().getSecondi();

        decimale = (double) (gradi + (primi / 60) + (secondi / 3600));

        Latitudine latitude = new Latitudine(decimale);

        gradi = posizione.getLongitudine().getGradi();
        primi = posizione.getLongitudine().getPrimi();
        secondi = posizione.getLongitudine().getSecondi();

        decimale = (double) (gradi + (primi / 60) + (secondi / 3600));

        Longitudine longitude = new Longitudine(decimale);

        System.out.println("Latitudine: " + latitude + "\n longitudine: " + longitude);

    }

    public Latitudine getLatitudine() {
        return latitudine;
    }

    public LocalDateTime getDataOra() {
        return dataOra;
    }

    @Override
    public String toString() {
        return "Posizione geografica:\n" + latitudine + "\n" + longitudine + "\nData e ora di rilevamento " + dataOra;
    }

    public Longitudine getLongitudine() {
        return longitudine;
    }

}
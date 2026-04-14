package einheit03.zeichen;

import java.util.concurrent.ThreadLocalRandom;

public class CharacterDemo {

    static void main(String[] args) {

        // Ein Passwort in einer beliebigen Länge, d.h. 8-12 soll generiert werden mit druckbaren Zeichen
        // Am Ende wird das Passwort ausgegeben
        // die Länge des Passwort ist ebenso per Zufall in besagter Range zu definieren

        int zahl = ThreadLocalRandom.current().nextInt(98, 122 + 1);
        System.out.println((char) zahl);


    }
}

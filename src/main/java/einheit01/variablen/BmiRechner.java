package einheit01.variablen;

/**
 * Berechnet den Body-Mass-Index (BMI) basierend auf fest hinterlegten Werten für Größe und Gewicht.
 */
public class BmiRechner {
    static void main(String[] args) {
        System.out.println("BMI-Rechner");

        // Formel: Gewicht / (Größe * Größe)
        double koerperGroesseInMeter = 1.11;
        double koerperGewichtInKg = 11;

        double bmi = koerperGewichtInKg / (koerperGroesseInMeter * koerperGroesseInMeter);
        System.out.println("Ihr BMI ist: " + bmi);
    }
}

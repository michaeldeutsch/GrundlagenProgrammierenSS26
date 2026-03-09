package einheit01.variablen;

public class BMI_Rechner {

    static void main(String[] args) {
        System.out.println("BMI einheit01.variablen.Rechner");

        // Körpergewicht: Körpergröße ^ 2

        double koerperGroesseinMeter = 1.11;
        double korperGewichtinKG = 11;

        double bmi = korperGewichtinKG / (koerperGroesseinMeter * koerperGroesseinMeter);
        System.out.println("Ihr BMI ist: " + bmi);





    }


}

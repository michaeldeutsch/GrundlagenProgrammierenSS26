package einheit02;

public class SwitchNew {

    static void main() {

        int monat = 1;

        switch(monat){
            case 1,2,3 -> System.out.println("WInterr");
            case 4,5,6 -> System.out.println("Frühling");
            case 7,8,9 -> System.out.println("Sommer");
            case 10,11,12 -> System.out.println("Herbst");
            default -> System.out.println("Unbekannt");
        }


        String wert = "De";

        switch(wert.toUpperCase()){
            case "DE":
                System.out.println("Deutschland");
                break;
            default:
                System.out.println("Unbekannt");
        }
    }
}
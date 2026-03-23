package einheit02;

public class SwitchBeispiel {

    static void main() {

        // 1-3 = Jan, Feb, Mar --> Frühling
        // 4-6 = Apr, May, Jun --> Sommer
        // 7-9 = Jul, Aug, Sep --> Herbst
        // 10-12 = Oct, Nov, Dec --> Winter

        int monat = 1;

        switch(monat){
            case 1, 4, 7, 10:
                System.out.println("Jänner");
                break;
            case 2:
                System.out.println("Februar");
                break;
            case 3:
                System.out.println("März");
                break;
            default:
                System.out.println("Unbekannt");

        }






    }
}

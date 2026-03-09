package einheit01.einlesen;

import java.util.Scanner;

public class Einlesen {


    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Bitte geben Sie eine Zahl ein:");
        String input = scan.nextLine();


        int zahl = 10;
        System.out.println(input);

    }
}

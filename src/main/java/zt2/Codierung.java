package zt2;

import java.util.Scanner;

public class Codierung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib ein Wort ein: ");
        String inputText = scanner.nextLine();

        System.out.print("Gib eine Zahl zwischen 1 und 3 ein: ");
        int shift;
        try {
            shift = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Ungueltige Eingabe: bitte eine Zahl eingeben.");
            scanner.close();
            return;
        }

        if (shift >= 1 && shift <= 3) {
            String result = verschluesseln(inputText, shift);
            System.out.println("Verschlüsselt: " + result);
        } else {
            System.out.println("Ungueltige Zahl");
        }

        scanner.close();
    }

    public static String verschluesseln(String text, int shift) {
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) ('a' + (ch - 'a' + shift) % 26);
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ('A' + (ch - 'A' + shift) % 26);
            }

            encrypted.append(ch);
        }

        return encrypted.toString();
    }
}

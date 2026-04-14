package einheit03.zeit;

public class Uhrzeit {

    static void main() {
        // Uhrzeit simulieren, bestehend aus Stunden, Minuten und Sekunden, jeweils 1 sec deplay

        // 00:00:00
        // 00:00:01
        // 00:00:02
        // ...
        // 23:59:59

        for (int stunden = 0; stunden < 24; stunden++) {
            for (int minuten = 0; minuten < 60; minuten++) {
                for (int sekunden = 0; sekunden < 60; sekunden++) {

                    String hPrint = stunden < 10 ? "0" + stunden : "" + stunden;
                    System.out.println(hPrint + ":" + minuten + ":" + sekunden);
                }
            }
        }
    }
}

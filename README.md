# Grundlagen Programmieren – Kurs-Repository (SS26)

## Einführung

Dieses Repository enthält die **Beispiele und Materialien der Lehrveranstaltung _Grundlagen Programmieren_** im
Sommersemester 2026.  
Es dokumentiert den **Fortschritt der Vorlesung** und stellt den Studierenden den **während der Einheiten entwickelten
Code** zur Verfügung.

Das Repository wächst im Laufe des Semesters und spiegelt die **chronologische Entwicklung von Themen, Werkzeugen und
Programmierkonzepten** wider, die in der LV eingeführt werden.

Studierende können dieses Repository nutzen, um:

- auf LV-Beispiele zuzugreifen
- besprochene Technologien zu vertiefen
- den Kursfortschritt nachzuverfolgen
- den aktuellsten Code aus der Vorlesung abzurufen

---

## Repository-Struktur

Das Projekt folgt einer **standardmäßigen Maven-basierten Java-Struktur**.

```text
src
 └─ main
     ├─ java
     │   ├─ einheit01          # Grundlagen: Variablen, Input, Verzweigung
     │   │   ├─ einlesen       # Scanner-Nutzung
     │   │   ├─ variablen      # Datentypen, Berechnungen (BMI, Rechner)
     │   │   └─ verzweigung    # If/Else-Logik
     │   ├─ einheit02          # Kontrollstrukturen: Switch, Schleifen
     │   │   ├─ entscheidungen # If/Else-Kaskaden, Switch-Syntax
     │   │   ├─ mathematik     # Summenformeln, Berechnungen
     │   │   ├─ schleife       # For/While, Logik (Entenhausen, Login)
     │   │   └─ grundlagen     # Recap & Einführung
     │   ├─ einheit03          # Vertiefung: Datentypen, Algorithmen
     │   │   ├─ zeichen        # Arbeiten mit char & ASCII
     │   │   ├─ zeit           # Simulation von Zeitabläufen
     │   │   ├─ algorithmen    # Passwort-Gen, komplexe Rätsel
     │   │   └─ schleife       # Schleifen-Sonderheiten
     │   └─ loesung            # Musterlösungen zu den Übungen
     └─ resources
pom.xml                        # Maven Konfiguration
```

Jede Einheit (Einheit 01, 02, etc.) enthält die Beispiele und Experimente der jeweiligen Vorlesungseinheit.

---

## Aktuelle Inhalte & Beispiele

Die aktuellen Beispiele decken das Setup und die grundlegenden Konzepte der Programmierung ab:

- **Einheit 01: Die ersten Schritte**
    - Java Projekt-Setup & HelloWorld
    - Einlesen von Daten via `Scanner`
    - Einfache Berechnungen (z.B. BMI Rechner)
    - Erste bedingte Anweisungen (`if-else`)
- **Einheit 02: Logik & Wiederholungen**
    - Komplexe Verzweigungen & `switch` (inkl. moderne Switch-Syntax)
    - Schleifen-Konstrukte (`for`, `while`)
    - Praktische Anwendungen (Einmaleins, Summenformel, Login-Logik)
- **Einheit 03: Vertiefung & Datentypen**
    - Arbeiten mit `char` und ASCII-Werten
    - Generierung von Zufallszahlen (`ThreadLocalRandom`)
    - Verschachtelte Schleifen & Passwort-Generierung

---

## Technologien

Im Kurs werden aktuell folgende Technologien und Werkzeuge eingesetzt:

- **Java 25** (OpenJDK)
- **Maven** (Build-Management & Abhängigkeiten)
- **IntelliJ IDEA** (Entwicklungsumgebung)
- **Git** (Versionsverwaltung)

---

## Kenntnisfortschritt & Lernziele

Nach jeder Einheit sollten bestimmte Kompetenzen erworben worden sein:

| Einheit | Schwerpunkt         | Was man nun können sollte                                                                                    |
|:--------|:--------------------|:-------------------------------------------------------------------------------------------------------------|
| **01**  | Grundlagen & I/O    | Projekt anlegen, Variablen deklarieren, Benutzereingaben verarbeiten, einfache Fallunterscheidungen treffen. |
| **02**  | Kontrollstrukturen  | Abläufe mittels Schleifen automatisieren, komplexe Entscheidungslogik mit Switch und If-Kaskaden abbilden.   |
| **03**  | Datentypen & Zufall | Mit Zeichen (`char`) operieren, Zufallswerte generieren, algorithmische Probleme (z.B. Passwort-Gen) lösen.  |

---

## Einrichtung & Ausführung

### Repository klonen:

```bash
git clone <repository-url>
```

## Einheiten & Beispiele

Hier finden Sie eine detaillierte Übersicht der behandelten Beispiele, deren Nutzen und die vermittelten Konzepte.

### Einheit 01: Grundlagen & I/O

In dieser Einheit werden die Basiskonzepte von Java eingeführt, einschließlich Variablen, Datentypen und einfachem
Input/Output.

- **HelloWorld**:
    - **Nutzen**: Erstes Programm zur Überprüfung der Entwicklungsumgebung.
    - **Besonderheiten**: Verwendung von `String`-Variablen und Konsolenausgabe.
    - **Fähigkeiten**: Grundstruktur einer Java-Klasse, `main`-Methode, `System.out.println`.
- **Einlesen**:
    - **Nutzen**: Interaktion mit dem Benutzer über die Konsole.
    - **Besonderheiten**: Verwendung der `Scanner`-Klasse zum Einlesen von Text.
    - **Fähigkeiten**: Import von Klassen, Objektinstanziierung, Variablenzuweisung.
- **Rechner & BMI_Rechner**:
    - **Nutzen**: Durchführung einfacher mathematischer Berechnungen.
    - **Besonderheiten**: Umgang mit verschiedenen numerischen Datentypen (`int`, `double`) und mathematischen
      Operatoren.
    - **Fähigkeiten**: Deklaration von Variablen, Wertzuweisung, einfache Arithmetik.
- **Verzweigung**:
    - **Nutzen**: Logische Entscheidungen im Programm treffen.
    - **Besonderheiten**: Einsatz des Modulo-Operators (`%`) zur Prüfung auf gerade/ungerade Zahlen.
    - **Fähigkeiten**: `if-else` Struktur, Vergleichsoperatoren.

### Einheit 02: Kontrollstrukturen

Der Fokus liegt auf komplexerer Logik durch verschachtelte Entscheidungen und die Automatisierung von Abläufen mittels
Schleifen.

- **Notengebung**:
    - **Nutzen**: Abbildung eines Bewertungssystems basierend auf Punkten.
    - **Besonderheiten**: Verwendung von `if-else-if` Kaskaden.
    - **Fähigkeiten**: Logische Verknüpfungen, Bereichsprüfungen.
- **SwitchBeispiel & SwitchNew**:
    - **Nutzen**: Effiziente Fallunterscheidung bei vielen Möglichkeiten.
    - **Besonderheiten**: Vergleich zwischen klassischer `switch`-Syntax und der modernen Java "Arrow Syntax" (`->`).
    - **Fähigkeiten**: `switch`-Statements, Umgang mit `break` und `default`.
- **ForSchleife & EinMalEins**:
    - **Nutzen**: Wiederholung von Codeblöcken und Tabellengenerierung.
    - **Besonderheiten**: Verschachtelte Schleifen zur Darstellung von Matrix-Strukturen (1x1 Tabelle).
    - **Fähigkeiten**: `for`-Schleifen (Initialisierung, Bedingung, Inkrement), Schleifensteuerung.
- **Login**:
    - **Nutzen**: Einfache Authentifizierungslogik.
    - **Besonderheiten**: Verwendung von `JOptionPane` für grafische Dialogfenster und String-Vergleich (`equals`,
      `equalsIgnoreCase`).
    - **Fähigkeiten**: Umgang mit externen Bibliotheken (Swing), String-Methoden.
- **Entenhausen**:
    - **Nutzen**: Lösung komplexer Verteilungsprobleme durch Brute-Force.
    - **Besonderheiten**: Dreifach verschachtelte Schleifen zur Kombination von Werten.
    - **Fähigkeiten**: Logische Modellierung von Randbedingungen in Schleifen.

### Einheit 03: Vertiefung, Datentypen & Algorithmen

Vertiefung der Kenntnisse über Zeichensätze (`char`), Zufallszahlen und algorithmische Problemstellungen.

- **Abc & CharacterDemo**:
    - **Nutzen**: Verständnis der Beziehung zwischen Zahlenwerten (ASCII/Unicode) und Schriftzeichen.
    - **Besonderheiten**: Casting zwischen `int` und `char`, Iterieren über Buchstaben.
    - **Fähigkeiten**: Datentyp-Konvertierung, Arbeiten mit dem ASCII-Zeichensatz.
- **CountDown & Uhrzeit**:
    - **Nutzen**: Zeitbasierte Abläufe simulieren.
    - **Besonderheiten**: Verwendung von `Thread.sleep` für Pausen und ternärer Operator zur Formatierung.
    - **Fähigkeiten**: Exception Handling (Grundlagen), komplexe Schleifenlogik für Zeitformate.
- **Enthausen (Vertiefung)**:
    - **Nutzen**: Fortgeschrittene algorithmische Logik mit spezifischen Bedingungen.
    - **Besonderheiten**: Kombination von mathematischen Prüfungen (Summe, Gerade/Ungerade, Größenvergleiche).
    - **Fähigkeiten**: Komplexe `boolean`-Logik, Effizienzüberlegungen.
- **PasswordGen**:
    - **Nutzen**: Automatisierte Generierung sicherer Zeichenfolgen.
    - **Besonderheiten**: Einsatz von Zufallszahlen (`ThreadLocalRandom`).
    - **Fähigkeiten**: Generierung von Zufallswerten in bestimmten Bereichen, String-Konkatenation.
- **ForSonderheiten**:
    - **Nutzen**: Kontrolle des Schleifenflusses.
    - **Besonderheiten**: Vorzeitiger Abbruch von Schleifen.
    - **Fähigkeiten**: Einsatz von `break`.

---

## Zweck

Dieses Repository dient als **lebendige Dokumentation des Kurses** und wird sukzessive um weitere Beispiele, Experimente
und Projektkomponenten ergänzt, die im Laufe des Semesters entwickelt werden.

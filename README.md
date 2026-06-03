# Grundlagen Programmieren – Kurs-Repository (SS26)

## Einführung

Dieses Repository enthält die Beispiele und Materialien der Lehrveranstaltung "Grundlagen Programmieren" (Sommersemester 2026).
Es dokumentiert den Verlauf der Vorlesungen und stellt die während der Einheiten entwickelten Programme bereit.

Zielgruppe: Studierende, die Konzepte der imperativen Programmierung, Kontrollstrukturen, Datentypen und einfache Algorithmen erlernen.

---

## Projektstruktur (Kurz)

Konvention: Maven-Layout

- src/main/java/...
- pom.xml

Wichtige Paketgruppen:
- einheit01 – Grundlagen (Variablen, Ein- und Ausgabe, Verzweigungen)
- einheit02 – Kontrollstrukturen (Switch, Schleifen)
- einheit03 – Datentypen & Algorithmen (char, Zufall, Passwort-Gen)
- einheit04..07 – weitere Übungen und Beispiele
- zt1, zt2 – Zusatzbeispiele / Übungsaufgaben

---

## Technologien

- Java (OpenJDK)
- Maven
- Git
- Empfohlen: IntelliJ IDEA oder andere Java-IDE

---

## Schnellstart

1) Repository klonen:

   git clone <repository-url>

2) Kompilieren (Maven):

   mvn compile

3) Beispiel ausführen (Beispiel: zt2.Codierung):

   java -cp target/classes zt2.Codierung

(Hinweis: Klassen ohne Package-Pfad entsprechend anpassen.)

---

## Übersicht: enthaltene Beispiele (Auswahl)

Die vollständige Liste der Quellfiles liegt in src/main/java. Ausgewählte Beispiele:

- einheit01/variablen/HelloWorld.java
- einheit01/variablen/BmiRechner.java
- einheit01/einlesen/Einlesen.java
- einheit02/schleife/EinMalEins.java
- einheit02/schleife/Entenhausen.java
- einheit02/entscheidungen/SwitchBeispiel.java
- einheit03/algorithmen/PasswordGen.java
- einheit03/zeichen/Abc.java
- einheit03/zeit/CountDown.java
- einheit06/strings/WortZufall.java
- zt2/Codierung.java (Caesar-Verschlüsselung)
- zt2/Matrix.java (Matrix-Beispiel)

Für die vollständige Dateiliste siehe: src/main/java

---

## Automatisierung

Das Repository enthält ein Script (scripts/update_readme.sh) und einen Git pre-commit Hook (.git/hooks/pre-commit). Beim Commit werden geänderte Java-Dateien in der README-Sektion "Automatisch aktualisierte Beispiele" aufgenommen. Hinweis: Das Hook-Script benötigt eine sh-kompatible Umgebung (z.B. Git Bash unter Windows).

---

## Beitrag & Workflow

- Änderungen per Branch + Pull Request
- Vor jedem Commit wird die README-Sektion automatisch ergänzt (siehe oben)

---

## Kontakt

Bei Fragen zur Vorlesung: Kursleitung oder Tutorien kontaktieren.

---

(Die Datei wurde automatisch zusammengefasst und an das Projekt angepasst.)

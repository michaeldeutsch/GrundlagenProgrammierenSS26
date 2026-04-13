# Grundlagen Programmieren SS26

Repository for the course **Grundlagen Programmieren** (Foundations of Programming) for the Summer Semester 2026 at **FH
BFI Wien**. This project contains introductory Java programming exercises and examples covering various fundamental
concepts.

## 🚀 Overview

The project is structured into units (Einheiten) that follow the curriculum of the course:

- **Einheit 01**: Variables, Basic Input/Output, Branching.
- **Einheit 02**: Control Structures (Switch, Loops), Logic, and fundamental algorithms.
- **Lösungen**: Sample solutions for exercises.

## 🛠️ Stack

- **Language**: Java 25
- **Build Tool / Package Manager**: Maven
- **Organization**: `fhbfiwien`

## 📋 Requirements

- **Java Development Kit (JDK) 25** or higher.
- **Apache Maven** (for dependency management and building).

## ⚙️ Setup & Run

### Clone the Repository

```bash
git clone <repository-url>
cd GrundlagenProgrammierenSS26
```

### Build the Project

Use Maven to compile the source code:

```bash
mvn compile
```

### Run a Specific Class

Since this is a collection of standalone examples, you can run individual classes using your IDE (IntelliJ IDEA,
Eclipse, etc.) or via the command line.

To run a specific class from the command line:

```bash
mvn exec:java -Dexec.mainClass="einheit01.variablen.HelloWorld"
```

*(Replace `einheit01.variablen.HelloWorld` with the full package name of the class you wish to run.)*

## 📜 Scripts

Currently, the project uses standard Maven commands:

- `mvn compile`: Compiles the source code.
- `mvn clean`: Removes the `target` directory.

## 📁 Project Structure

```text
├── src/main/java/
│   ├── einheit01/             # Unit 01: Basics
│   │   ├── einlesen/          # Input handling
│   │   ├── variablen/         # Variable declarations and basic arithmetic
│   │   └── verzweigung/       # If/Else branching
│   ├── einheit02/             # Unit 02: Control Flow
│   │   ├── schleife/          # For and While loops
│   │   └── (various classes)  # Switch statements, logic exercises
│   └── loesung/               # Exercise solutions
├── pom.xml                    # Maven configuration
└── README.md                  # This file
```

## 🧪 Tests

- **TODO**: Automated tests (JUnit) are not yet implemented in this repository.

## 🔐 Environment Variables

- No specific environment variables are required for this project at this time.

## 📄 License

- **TODO**: Add license information (e.g., MIT, Apache 2.0).

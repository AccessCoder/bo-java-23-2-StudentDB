package de.neuefische;

public class Main {
    public static void main(String[] args) {

        StudentDB studentDB = new StudentDB(new Student[]{
                new Student("a", "a"),
                new Student("b", "b"),
                new Student("c", "c")
        }
        );
        for (int i = 0;i<100; i++){
            System.out.println(studentDB.randomStudent());
        }

        System.out.println(studentDB.toString());
    }

    /**
     * Aufgabe: Random Student
     *
     * Erstelle eine Klasse StudentDB mit folgenden Eigenschaften
     *
     *     Der Konstruktor nimmt ein Array von Studenten entgegen
     *     Jeder Student hat einen Namen und eine Id
     *     Die Methode getAllStudents gibt alle Studenten als Array zurück
     *     Die Methode toString() gibt alle Studenten formatiert als String zurück
     *     Die Methode randomStudent() gibt einen zufälligen Studenten zurück
     *     (Nutze für den Zufall Random.nextInt()
     *     ACHTUNG: Random erst als Objekt instanziieren)
     *
     * Schreibe für alle Methoden Tests (bis auf randomStudent() )
     */
}
package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {



    @Test
    void getAllStudents_shouldReturnAllStudents() {
        //GIVEN
        Student[] expected = new Student[]{
                new Student("a", "a"),
                new Student("b", "b"),
                new Student("c", "c")
        };
        StudentDB studentDB = new StudentDB(expected);
        //WHEN
        Student[] actual = studentDB.getAllStudents();
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void testToString() {
        //GIVEN
        Student[] students = new Student[]{
                new Student("a", "a")
        };
        StudentDB studentDB = new StudentDB(students);
        String expected = "StudentDB{students=[Student{name='a', id='a'}]}";
        //WHEN
        String actual = studentDB.toString();
        //THEN
        assertEquals(expected, actual);
    }
}
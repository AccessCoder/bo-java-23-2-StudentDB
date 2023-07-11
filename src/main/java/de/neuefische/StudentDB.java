package de.neuefische;

import java.util.Arrays;
import java.util.Random;

public class StudentDB {

    private Student[] students;



    public StudentDB(Student[] students) {
        this.students = students;
    }

    public Student randomStudent(){
        Random random = new Random();
        return students[random.nextInt(students.length)];
    }

    public Student[] getAllStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + Arrays.toString(students) +
                '}';
    }


}

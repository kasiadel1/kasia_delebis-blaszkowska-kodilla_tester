package com.kodilla.optional.homework;


import com.kodilla.stream.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", new Teacher("Prof.Smith")));
        students.add(new Student("Cristian", new Teacher(null)));
        students.add(new Student("Martha", new Teacher("Prof. Linken")));
        students.add(new Student("Adele", new Teacher(null)));
        students.add(new Student("Michael", new Teacher(null)));

        for(Student student : students){
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String teacherName = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            System.out.println("Student: " + student.getName() + ", teacher: " + teacherName);
        }
    }
}



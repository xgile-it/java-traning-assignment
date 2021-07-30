package com.collections;

import java.util.*;

public class StudentMain {

    public static void main(String[] args)
    {
        //create new student object
        Student student1 = new Student(1,214258200,"Khosi","Nkosi", "C");
        Student student2 = new Student(2,21586800,"Philela" ,"Ntlekana", "B");
        Student student3 = new Student(3,214865900," Zinhle", "Ngwenya", "A");

        //Add the student to the list(List collection)
        List<Student> studList = new ArrayList<>();
        studList.add(student1);
        studList.add(student2);
        studList.add(student3);

        System.out.println(studList);

        //Add the student (Using set)
        Set<Student> studSet = new HashSet<>();
        studSet.add(student1);
        studSet.add(student2);
        studSet.add(student3);

        System.out.println(studSet);

        //Remove student
        studList.remove(1);
        System.out.println(studList);

        //Get student by grade
        Student student = (Student) studList.get(0);
        System.out.println("Get the Student by Grade: " + student.getGrade());

        //Sort and print student by grade
        Set<Student> sortStudents = new TreeSet<>(Comparator.comparing(Student::getGrade));
        sortStudents.add(student1);
        sortStudents.add(student2);
        sortStudents.add(student3);

        System.out.println("Sort student by Grade: "+ sortStudents);


    }


}

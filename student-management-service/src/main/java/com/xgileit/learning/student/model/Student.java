package com.xgileit.learning.student.model;



/**
 * This is the class responsible for storing data for the student
 */

public class Student {

    private Long id;

    private int studentNumber;

    private String firstName;

    private String lastName;

    private String address;

    public Student() {

    }
    public Student(int studentNumber,String firstName, String lastName, String address) {
        super();
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}



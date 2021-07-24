package com.oop.polymophism;

public class Cleaner extends Employee{

    @Override
    public void cleaning(){
        System.out.println("vruuu");
    }
    public static void main(String args[]){
        Employee employee = new Cleaner();
        employee.cleaning();
    }
}

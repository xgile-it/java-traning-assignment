package com.multithreading.application;

//class implements Runnable interface

public class RunnableDemo implements Runnable {

    private String message;
    //class constructor
    public RunnableDemo(String message) {
        this.message = message;
    }
    //run method
    public void run() {
        while(true) {
            System.out.println(message);
        }
    }

}

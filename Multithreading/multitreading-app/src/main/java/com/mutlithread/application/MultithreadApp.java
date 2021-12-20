package com.mutlithread.application;

public class MultithreadApp {

    public static void main(String [] args) {

        System.out.println("Starting thread1...");

        //create a thread class instance
        Thread thread1 = new ThreadClassDemo(15);

        //start the thread thread_1
        thread1.start();
        try {

            //wait for thread_1 to die
            thread1.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("Starting thread_2...");
        Thread thread2 = new ThreadClassDemo(20);

        //start thread_2
        thread2.start();
        System.out.println("main() is ending...");
    }
}

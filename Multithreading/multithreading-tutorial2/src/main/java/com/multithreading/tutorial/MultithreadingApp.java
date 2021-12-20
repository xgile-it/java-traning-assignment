package com.multithreading.tutorial;


public class MultithreadingApp  {

        public static void main(String[] args) {

                for(int i=0; i<5;i++){

                        //create an object of multithreadThing class
                        MultithreadThing myThing = new MultithreadThing(i);

                        Thread myThread = new Thread(myThing);
                        myThread.start();

                }

        }


}

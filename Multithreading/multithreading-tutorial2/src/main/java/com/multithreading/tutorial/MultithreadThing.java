package com.multithreading.tutorial;

public class MultithreadThing implements Runnable {

    //assign a number to each thread,to see which thread is printing which number
    private int threadNumber;
    public MultithreadThing(int threadNumber){
        this.threadNumber = threadNumber;

    }

    //Override the thread class run method
    @Override
    public  void run(){
        //count the numbers from 1 to 5

        for(int i=1; i<=5; i++){
            System.out.println(i+"from thread"+threadNumber);

            //throw an exception if thread number==3
//            if(threadNumber == 3){
//                throw  new RuntimeException();
//            }

            try {
                //sleep for 1 second between each number printed
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }

    }

}

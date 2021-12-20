import com.multithreading.tutorials.MultithreadThing;

public class MultithreadingApp  {

        public static void main(String[] args) {

                for(int i=0; i<5;i++){

                        //create an object/instance of multithreadThing class
                        MultithreadThing myThing = new MultithreadThing(i);
                        //call the start method,create a new thread and run separate
                        myThing.start();

                }

        }


}

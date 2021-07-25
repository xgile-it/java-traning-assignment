package com.java.basic.element.assignment3.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MultipleException {


    public static void main(String args[])
    {
        try {
            //ArithmeticException
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("Result = " + c);

            //NullPointerException
            String e = null;
            System.out.println(e.charAt(0));

            //FileNotFoundException
            //  file does not exist
            File file = new File("C://javabasics.txt");
            FileReader fileReader = new FileReader(file);

            //NumberFormatException
            // "rider" is not a number
            int num = Integer.parseInt ("rider") ;
        }
        catch (ArithmeticException e) {
            System.out.println("Can't divide a number by 0");
        }
        catch (NullPointerException ex){
            System.out.println("NullPointerException");

        }
        catch (FileNotFoundException ef){
            System.out.println("File does not exist");
        }
        catch (NumberFormatException en){
            System.out.println("Number format exception");
        }


    }
}

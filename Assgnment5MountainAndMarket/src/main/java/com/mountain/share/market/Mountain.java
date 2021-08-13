package com.mountain.share.market;

import java.util.Arrays;
import java.util.Scanner;

public class Mountain {

    static int max;
    static int min;

    //find the highest peak and lowest valley
    public static void max_min(int graphArray[]){
        max = graphArray[0];
        min = graphArray[0];
        int length = graphArray.length;
        for (int i = 1; i < length - 1; i = i + 2) {
            if (i + 1 > length) {
                if (graphArray[i] > max) max = graphArray[i];
                if (graphArray[i] < min) min = graphArray[i];
            }
            if (graphArray[i] > graphArray[i + 1]) {
                if (graphArray[i] > max) max = graphArray[i];
                if (graphArray[i + 1] < min) min = graphArray[i + 1];
            }
            if (graphArray[i] < graphArray[i + 1]) {
                if (graphArray[i] < min) min = graphArray[i];
                if (graphArray[i + 1] > max) max = graphArray[i + 1];
            }
        }
    }

    public static void main(String args[]) {

        //Enter length of the list
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of list");
        int listOfNumbers = scanner.nextInt();

        // Get input from the list
        int arrayOfList[] = new int[listOfNumbers];

        System.out.println(listOfNumbers);


        //print the highest peak and lowest valley

        int[] graphArray = {5, 8, 3, -1, 0, 2, 4, 4};
        max_min(graphArray);
        System.out.println(" Original Array: "+Arrays.toString(graphArray));
        System.out.println(" The highest peak is = " + max);
        System.out.println(" The lowest valley = " + min);
    }



    }


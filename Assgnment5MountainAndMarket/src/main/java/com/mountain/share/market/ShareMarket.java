package com.mountain.share.market;

import java.util.Scanner;

public class ShareMarket {

    public static void main(String args[]) {

        //Enter length of the list
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of list");
        int listOfNumbers = scanner.nextInt();

        // Get input from the list
        int arrayOfList[] = new int[listOfNumbers];

        System.out.println(listOfNumbers);


      //Calculate the number of rise and fallen


    int rise = 0 ;
    int fallen = 0 ;
        for (int a = 1; a < listOfNumbers-1; a++){
        if (arrayOfList[a] > arrayOfList[a+1]){
            rise++;
        }
        else if (arrayOfList[a] < arrayOfList[a+1]){
            fallen++;
        }


    }


        int[] graphArray = {5, 8, 3, -1, 0, 2, 4, 4};

        System.out.println("The number of rise: "+ graphArray[rise]);
        System.out.println("The number of fallen: "+ graphArray[fallen]);

}
    }

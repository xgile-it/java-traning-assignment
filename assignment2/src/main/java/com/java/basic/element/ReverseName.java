package com.java.basic.element;

import java.util.Scanner;

public class ReverseName {

    public static void main(String args[]) {

        String name;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name");
        name =scanner.nextLine();
         System.out.println();

        for(int i=name.length();i>0;--i)
        {
            System.out.print(name.charAt(i-1));
        }
    }
}

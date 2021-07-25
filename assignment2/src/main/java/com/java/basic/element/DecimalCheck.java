package com.java.basic.element;

import java.util.Scanner;

public class DecimalCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int x = scanner.nextInt();
        System.out.print("Input second number: ");
        int y = scanner.nextInt();


        if (x==y){

            System.out.print("identical");

        }

    }
}

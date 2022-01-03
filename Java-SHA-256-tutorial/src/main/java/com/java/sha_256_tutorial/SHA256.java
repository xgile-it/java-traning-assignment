package com.java.sha_256_tutorial;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256 {


    public static String encryptThisString(String input) {

        try {
            //MessageDigest - To convert a given message to a message digest

            //Creating the MessageDigest object
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            //Compute the message digest to calculate the message digest input
            byte[] messageDigest = md.digest(input.getBytes());

            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);

            //Convert message digest into hex value
            String hashtext = no.toString(16);


            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }

            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String args[]) throws NoSuchAlgorithmException {

        System.out.println("HashCode Generated: ");
        String s1 = "java";
        System.out.println("\n" + s1 + " : " + encryptThisString(s1));

    }
}



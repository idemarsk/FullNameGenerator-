package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {

    //create the scanner to take in user input
    public static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        System.out.print("First name: ");
        String firstName = myScanner.nextLine();


        System.out.print("Middle name: ");
        String middleName = myScanner.nextLine();

        System.out.print("Last name: ");
        String lastName = myScanner.nextLine();

        System.out.print("Suffix: ");
        String suffix = myScanner.nextLine();

        //
        String fullName = firstName.trim();

        if (!middleName.trim().isEmpty()) {
            fullName += " " + middleName.trim();
        }

            fullName+= " " + lastName.trim();


            if (!suffix.trim().isEmpty()) {
                fullName += ", " + suffix.trim();
            }
            System.out.println("Full name: " + fullName);
        }
    }




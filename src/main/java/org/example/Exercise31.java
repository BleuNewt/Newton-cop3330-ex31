package org.example;
/*  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Newton*/
import java.util.Scanner;
public class Exercise31 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int age = 0;
        //run until age is valid
        while (age < 1){
            //prompt and read
            System.out.print("Enter age: ");
            age = scan.nextInt();

            //if age is invalid
            if (age < 1)
                System.out.println("Invalid input. \n");
        }

        int restingHR = 0;
        //runs until invalid
        while (restingHR < 55 || restingHR > 95){
            //prompt and read
            System.out.print("Enter resting hear rate (55 - 95): ");
            restingHR = scan.nextInt();

            //if resting heart rate is invalid
            if (restingHR < 55 || restingHR > 95)
                System.out.println("Invalid input. \n");
        }

        System.out.println("\nIntensity \tRate");
        //iterating from 55 to resting heart rate with step 5
        for (int intensity = 55; intensity <= restingHR; intensity += 5){
            //Karvonen formula
            double rate = (((220 - age) - restingHR) * (intensity/100.0)) + restingHR;

            //intensity and heat rate
            System.out.println(intensity + "%" + "\t\t" + (int)Math.ceil(rate) + " bpm");
        }
    }
}

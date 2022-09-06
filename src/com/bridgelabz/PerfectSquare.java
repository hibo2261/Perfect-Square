package com.bridgelabz;

import java.util.Scanner;

public class PerfectSquare {


    static boolean Perfectsq(int num) // created method for identifying perfect no.
    {
        if (num != 0)

        {
            int temp;
             temp = (int) Math.sqrt(num);

            return ((temp * temp) == num);
        }
        return false;
    }

    public static void main(String args[]) {
        System.out.println("********************************************");
        System.out.println(" Welcome to Perfect Square....");   //Printing Welcome Meassage
        System.out.println("********************************************");

        System.out.println("Enter A Number --->");
        Scanner sc = new Scanner(System.in); // creating a scanner object
        int num = sc.nextInt();
        int n1 = (int) Math.sqrt(num); // storing sqareroot of number in n1 variable

        if (Perfectsq(num)) {

            System.out.println(num+" Is A Perfect Square Number."); // printing the output
            System.out.println("And "+n1+" Is A Square Root Of A Given Number.");
        }

        else {
            System.out.print(num+ " Is Not A Perfect Square Number.");

        }
    }
}
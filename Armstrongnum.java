package com.homework;

import java.util.*;

public class Armstrongnum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int originalNumber = num;

        int result = 0;

        int remainder;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3); // It took me 10 minutes to look for the pow function :(
            originalNumber /= 10;
        }

        if (result == num) System.out.println(num + " is a armstrong number");
        else System.out.println(num + " is a armstrong number");
        scan.close();
    }
}
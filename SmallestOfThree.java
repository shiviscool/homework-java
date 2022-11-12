package com.homework;

import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int smallest;
        int coolvariable;

        coolvariable=(a<b)?a:b;

        smallest=(c<coolvariable)?c:coolvariable;

        System.out.println(smallest);

        scan.close();
    }
}

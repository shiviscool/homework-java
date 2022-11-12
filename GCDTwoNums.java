package com.homework;

import java.util.Scanner;

public class GCDTwoNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int max;
        int step;
        int lcm = 0;

        if(num1 > num2){
            max = step = num1;
        }
        else{
            max = step = num2;
        }

        while(num1!= 0) {
            if(max % num1 == 0 && max % num2 == 0) {
                lcm = max;
                break;
            }
            max += step;
        }

        System.out.println((num1*num2)/lcm);

        scan.close();
    }
}

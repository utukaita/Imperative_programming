package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int t = 0;
        boolean asking = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Give a number from 0 to 100.");
        while (asking) {
            t = input.nextInt();
            if (t < 0 || t > 100) {
                System.out.println("Please give a suitable number.");
                continue;
            } else {
                asking = false;
            }
        }
        System.out.println("The time where the decrease in the amount of bacteria is the biggest is " + time(t) + " h.");

        boolean counting = true;
        int num = 1;
        int response = 0;
        while (counting){
            if ((num*num*num+91) % 47 == 0){
                response = num;
                counting = false;
            }
            num += 1;
        }
        System.out.println(response);

        int a = 5;
        int b = 1;
        for (int i = 1; i <= a; i++) {
            b *= 3;
        }
        System.out.println(b);

        a = 5;
        b = 2;
        int c = 1;
        for (int i = 1; i <= a; i++) {
            c *= b;
        }
        System.out.println(c);


    }


    static double time(int t) {
        int amount = 0;
        int prev_amount = 0;
        int dif = 0;
        int r_time = 0;
        int counter = 0;
        int tem_dif = 0;
        while (counter <= t) {
            prev_amount = amount;
            amount = counter * (counter - 20) * (counter - 100) + 120000;
            tem_dif = prev_amount - amount;
            if (tem_dif > dif) {
                dif = tem_dif;
                r_time = counter;
            }
            //System.out.println(amount);
            //System.out.println(dif);
            counter += 1;
        }
        return r_time;
    }
}

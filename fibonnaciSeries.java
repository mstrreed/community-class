package com.company;

import java.util.Scanner;

public class fibonnaciSeries {
    static int a = 0, b = 1, c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        System.out.print(a + " " + b+" ");
        printfib(first);
    }

    public static void printfib(int num) {
        if (num >= 1) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;

            printfib(--num);
        }
    }
}

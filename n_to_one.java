package com.company;

import java.util.Scanner;

public class n_to_one {

    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int a =sc.nextInt();
        print(a);
        take();
    }
    public static int print(int num) {
        if (num == 1) {
            System.out.println(num);
            return 1;
        } else {
            System.out.println(num);
            return print(--num);
        }
    }
    public static  void take()
    {
        int b= sc.nextInt();
        System.out.println(b);
    }
}

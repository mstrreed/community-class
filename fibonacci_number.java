package com.company;

import java.util.Scanner;

public class fibonacci_number{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int g=fibonacci(a);
        System.out.println(g);
    }
    public static int fibonacci(int num)
    {
        if(num<=1)
        {
            return num;
        }

            return fibonacci(num - 1) + fibonacci(num - 2);

    }
}

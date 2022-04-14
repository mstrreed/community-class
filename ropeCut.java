package com.company;

import java.util.Scanner;

public class ropeCut {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        int num=sc.nextInt();
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        System.out.println( maxi(num,num1,num2,num3));
    }

    public static int maxi(int n, int a, int b, int c) {
        if (n == 0) {
            return 0;
        }
        int res;
        if (n < 0) {
            return -1;
        }

            res = Math.max(maxi(n - a, a, b, c), Math.max(maxi(n - b, a, b, c),(maxi(n - c, a, b, c))));

        if (res == -1)
        {
            return -1;
        }
        else{
            return res+1;
        }
    }
}

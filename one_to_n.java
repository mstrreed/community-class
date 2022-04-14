package com.company;

import java.util.Scanner;
//tail recursive by master
public class one_to_n {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        print(a,1);
    }
    public static  void print (int num, int b)
    {

        if(num>0)
        {
            System.out.println(b);
            print(--num,++b);
        }
        else
            return;

    }
}

package com.company;

import java.util.Scanner;

public class bin_to_dec
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        convert(a);
    }
    public static void convert(int num)
    {
        if(num==0)
        {
            return ;
        }
        else {
            convert(num / 2);
            System.out.print(num % 2);
        }
    }
}

package com.company;

import java.util.Scanner;

public class reverseAnum {
    static int y=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       int[] arr=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]= sc.nextInt();
        }
        print(arr,5);
        rev(arr,0,4);
        print(arr,5);
    }
    public static void rev(int[] arr1,int i,int j) {
        if(i<=j) {
            int temp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;

            rev(arr1, ++i, --j);
        }
        else
            return;


    }
    public static void print(int [] arr1,int size)
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
    }
   /* public static void print1ton(int n,int i)
    {
        if(i>n)
        {
            return;
        }
        else System.out.println(i);
        printnto1(n,++i);
    }*/

}

package com.company;

import java.util.Scanner;

 public class checkIFSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[]=new int[5];
        int length=4;
        for(int i=0;i<5;i++)
        {
            arr1[i]=sc.nextInt();
        }
        check(arr1,length);
    }
    public static void check(int[] arr,int len)
    {
        if(len==0)
        {
            System.out.println(true);
        }
        else if(arr[len-1]<=arr[len])
        {
            check(arr,len-1);
        }
        else
            System.out.println(false);;
    }
}

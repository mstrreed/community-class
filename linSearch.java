package com.company;

import java.util.Scanner;

public class linSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int tar=sc.nextInt();
        int arr1[]=new int[5];
        for(int i=0;i<5;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println(linear(arr1,tar,4));
        System.out.println(lin1(arr1,tar,4));
    }
    public static boolean linear(int[] arr,int target,int len)
    {
        if(len==0)
        {
            return false;
        }
        else
        {
            return (arr[len]==target)||linear(arr,target,--len);
        }
    }
    public static int lin1(int[]arr,int target,int len)
    {
        if(len==0)
        {
            return -1;
        }
        if(arr[len]==target)
        {
            return len;
        }
        else
        {
            return lin1(arr,target,--len);
        }
    }
}


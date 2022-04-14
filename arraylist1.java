package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arraylist1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[5];
        int t = sc.nextInt();
        System.out.println("enter number sof arrays");
        for (int i = 0; i < 5; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println(fun1(t,arr1,4));
    }
     public static ArrayList<Integer>  fun1(int target,int[] arr,int len)
        {
            ArrayList <Integer> list=new ArrayList<>();
            if(len==0)
            {
                return list;
            }
            if(target==arr[len])
            {
                list.add(len);
        }
            ArrayList <Integer> fromBelow=fun1(target, arr,--len);
            list.addAll(fromBelow);
            return list;

    }
}

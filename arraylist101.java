package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist101 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
      takeAlist();
    }
    public static void takeAlist()
    {
       int limit=sc.nextInt();
        ArrayList <Integer> list=new ArrayList<Integer>(limit);
        System.out.println(list.size());
        for(int i=0;i<limit;i++)
        {
            list.add(sc.nextInt());
        }
        System.out.println(list.size());
        for(int j=0;j<limit;j++)
        {
            System.out.println(list.get(j));
        }
    }
}

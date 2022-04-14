package com.company;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        System.out.println(pal(str1));
    }
    public static String pal(String str) {
        int length=str.length() ;
        if (length==1) {
            String h=" "+str.charAt(0);
            return h;
        }
           String st = " " + str.charAt(str.length()-1);
        return st + pal(str.substring(0, str.length() - 1));

    }
}

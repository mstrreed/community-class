package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(fun(16));
    }
    public static int fun(int num)
    {
        if(num==1)
        {
            return 0;
        }
        else
             return 1+fun(num/2);
    }
}

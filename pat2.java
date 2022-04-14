package com.company;

public class pat2 {
    public static void main(String[] args) {
        patt2(5);

    }
    public static void patt2(int n)
    {

        for(int i=1;i<=5;i++)
        {
            int spaces =(n-i);
            for(int y=0;y<spaces;y++)
            {
                System.out.print(' ');
            }
            for(int j=0;j<i;j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

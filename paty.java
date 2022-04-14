package com.company;

import java.util.Scanner;

public class paty {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int o=k+2;

        pat(k,o);
        pat1(k);

    }
    public static void pat(int z,int l)
    {
        if(z==0)
        {
            return;
        }
      for(int i=1;i<z;i++)
      {
          System.out.print(i);
      }
      for(int j=z-1;j>=1;j--)
      {
          System.out.print(j);
      }
        System.out.println();

      pat(--z,l);
    }
    public static void pat1(int y)
    {
        for(int i=1;i<y;i++)
        {
            for(int h=1;h<=i;h++)
            {
                System.out.print(h);

            }
            System.out.println();
        }

    }
}

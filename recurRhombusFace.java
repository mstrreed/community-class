package com.company;

public class recurRhombusFace {
    public static void main(String[] args) {
        pat1(5,3,0);
    }
    public static void pat1(int n,int r,int c)
    {
        int spaces=(n-r)*2;
        if(r==0)
        {
            return;
        }
        if(c<r)
        {
            System.out.print('*');
            pat1(n,r,c+1);
        }
        else
        {
            space(spaces);
            System.out.println();
            pat1(n,r-1,0);
        }
    }
    public static void space(int s)
    {
        if(s==0)
        {
            return;
        }
        else
            System.out.print('-');
        space(--s);
    }

}

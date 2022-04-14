package com.company;

import java.util.ArrayList;

public class binSer {
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();
        list.add(1);
        list.add(16);
        list.add(25);
        list.add(98);
        list.add(102);
        list.add(890);
        int l=0;
        int size=list.size()-1;
        System.out.println(bin(list,890,l,size));
    }
    public static int bin(ArrayList <Integer> arr1,int target,int left,int right)
    {
        int middle=(left+right)/2;
        if(left==right) {
            if (target == arr1.get(left)) {
                return left;
            } else {
                return -1;
            }
        }
        else if (target<arr1.get(middle))
        {
            right=middle-1;
            return bin(arr1,target,left,right);
        }
        else if(target>arr1.get(middle))
        {
            left=middle+1;
            return bin(arr1,target,left,right);
        }
        else
        {
            return middle;
        }
    }
}

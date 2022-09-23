package com.first.hashing;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        String str1="this is a string";
        String strCopy = String.copyValueOf(str1.toCharArray(), 0, str1.length()-3);
        System.out.println(strCopy);
        int a[]=new int[]{1,2,3,4,5,6};
        int b[]=Arrays.copyOf(a, 3);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
       
        
    }

}

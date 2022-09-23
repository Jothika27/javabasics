package com.mkyong.hashing;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random r=new Random();
        int[] a=new int[10];
        for(int i=0;i<10;i++){
            a[i]=r.nextInt(9);
        }
        for(int i=0;i<10;i++){
            System.out.println(a[i]);
        }
    }
}

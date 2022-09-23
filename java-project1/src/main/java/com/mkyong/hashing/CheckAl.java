package com.mkyong.hashing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckAl {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the list elements");
        for(int i=0;i<5;i++){
            l.add(sc.nextInt());
        }
        System.out.println("Enter the element to search");
        int n=sc.nextInt();
        System.out.println(l.contains(n));
        sc.close();
    }
}

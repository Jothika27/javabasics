package com.first.hashing;

public class Month {
    public static void main(String[] args) {
        int month[][]=new int[][]
        {{10,11,12,13,10},
        {10,13,14,12,12},
        {13,13,14,15,12},
        {16,17,17,17,16},
        {22,23,24,24,24},
        {26,25,24,25,26},
        {9,28,26,27,26},
        {29,28,27,28,28},
        {24,23,24,25,25},
        {20,21,22,23,24},
        {15,16,17,18,18},
        {12,11,13,11,11} };
        for(int i=0;i<12;i++){
            System.out.println((i+1)+" Month");
          for(int j=0;j<5;j++){
            System.out.println("City "+(j+1)+" -> "+month[i][j]);
          }
        }
    }
}

package com.mkyong.hashing;
import java.util.Scanner;

public class AscTest {
    public static void main(String[] args) {
        int[] arr=new int[5];
        System.out.println("Enter 5 numbers");
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<5;i++) {
            arr[i]=sc.nextInt();
        }
        int count=0,n=5,count1=0;
        for(int i=0;i<4;i++){
            if(arr[i]>=arr[i+1])
              count=count+1;
            else if(arr[i]<=arr[i+1])
              count1=count1+1;
            else if(count!=i-1){
                break;
            }
        }
        if(count1==n-1)
        System.out.println("the entered array is ascending order");
        else if(count==n-1)
            System.out.println("the entered array is descending order");
        else 
        System.out.println("Not in any order");
       sc.close(); 
    }
    
}

package com.first.hashing;
import java.util.Scanner;
public class Arr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value n");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i=0,j=0,x=0;
        if(n%2==0){
            System.out.println("   ");
        }
        else{
            System.out.println("enter the array values");
            for(int k=0;k<n;k++){
               arr[k]=sc.nextInt();
            }
            for(int k=0;k<n;k++){
                System.out.print(arr[k]+" ");
             }
            i=(n/2)-1;
            j=(n/2)+1;
            System.out.println();
            while(i>=0&&j<n){
                System.out.println(i+ " "+j);
                if(arr[i]==arr[j]){
                    x=x+1;
                }
                i=i-1;
                j=j+1;
            }
            System.out.println("count of array values "+x);
            if(x==(n-1)/2){
                System.out.println("The given array is symetric");
            }
            else{
                System.out.println("The given array is nonsymetric");
            }
        }
          sc.close(); 

    }
}

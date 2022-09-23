package com.first.hashing;

public class StuTest {
    public static void main(String[] args) {
       String names[] = { "may" , "Eri" , "Elen" , "Rit" , "Rato" , "More" , "Epi" , "Ent" , "Ronal" , "Bib"};
       float grades[] = {99,55,77,45,89,98,76,45,33,75};
       float max=grades[0],min=grades[0],sum=0;
       int p=0,pm=0;
       float avg=0;
       for(int i=0;i<names.length;i++)
       {
        System.out.println("No "+(i+1)+" -->Student "+names[i]+" -Mark "+grades[i]);
        if(max<grades[i]){
            max=grades[i];
            p=i;
        }
        if(min>grades[i]){
            min=grades[i];
            pm=i;
        }
        sum=sum+grades[i];
       }
       System.out.println("Three character names");
       for(int i=0;i<names.length;i++){
        if(names[i].length()==3){
            System.out.println(names[i]);
        }
       }
      System.out.println("Maximum mark is "+max+" Student "+names[p] ); 
      System.out.println("Minimum mark is "+min+" Student "+names[pm] ); 
      avg=sum/grades.length;
      System.out.println("Class average is "+avg);
    }
}
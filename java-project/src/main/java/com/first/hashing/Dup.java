package com.first.hashing;

public class Dup {
     public static void main(String[] args) {
        String names[]={"jo","anu","prakash","sozha","anu","jo","anu"};
        int k=0,p=0;
        String name[]=new String[names.length];
        for(int i=0;i<names.length;i++){
            k=1;
            for(int j=i+1;j<names.length;j++){
                if(names[i].equalsIgnoreCase(names[j])){
                   k=k+1;
                }
            }
            if(k==1){
                name[p]=names[i];
                p=p+1;
            }
        }
        for(int i=0;i<p;i++)
                System.out.println(name[i]);
     }
}


package com.first.hashing;
import java.util.Scanner;
import java.util.Arrays;

public class BayTest {
    //vacant 
    public void vacantBayNo(String input,Bay[] bays){
        for(int i=0;i<bays.length;i++){
            if(input.equalsIgnoreCase(bays[i].bayno)){
                bays[i].email=" ";
                System.out.println(bays[i]);
                break;
            }
        }
    }
    //Assign
    public void assignBayNo(String bayInput,Bay[] bays,String emailInput){
        for(int i=0;i<bays.length;i++){
            if(bayInput.equalsIgnoreCase(bays[i].bayno)&&bays[i].email==" "){
                bays[i].email=emailInput;
                System.out.println(bays[i]);
                break;
            }
        }
    }
    //reAssign 
    public void reAssignBayNo(String baynum,Bay[] bays,String baynum2){
        String val1=new String();
        String val2=new String();
        String temp=new String();
        int p=0,p1=0;
        for(int i=0;i<bays.length;i++){
            if(baynum.equalsIgnoreCase(bays[i].bayno)){
                val1=bays[i].email;
                bays[i].email="";
                p=i;
            }
            else if(baynum2.equalsIgnoreCase(bays[i].bayno)){
                val2=bays[i].email;
                bays[i].email="";
                p1=i;
            }
        }
        temp=val1;
        val1=val2;
        val2=temp;
        bays[p].email=val1;
        bays[p1].email=val2;
        System.out.println(Arrays.toString(bays));
    }
    //floorInformation
    public void getFloorInformations(Bay[] bays){
        int count=0,ca=0,cb=0,k=0;
        int[] tCount=new int[6];
        int[] tCa=new int[6];
        int[] tCb=new int[6];
        System.out.println(Arrays.toString(bays));
        for(int i=0;i<=5;i++){
             count=0;ca=0;cb=0;
            for(int j=0;j<3;j++){
                if(bays[j].floorno==i){
                   count=count+1;
                   if(bays[j].wing=='A'){
                        ca=ca+1;
                   }
                   else if(bays[j].wing=='B'){
                        cb=cb+1;
                   }
                }
            }
            tCount[k]=count;
            tCa[k]=ca;
            tCb[k]=cb;
            System.out.println("floor Count of "+i+" is "+count);
            System.out.println("A wing count is "+ca+" in floorno "+i);
            System.out.println("B wing count is "+cb+" in floorno "+i);
            k=k+1;
        }
        Arrays.sort(tCount);
        Arrays.sort(tCa);
        Arrays.sort(tCb);
        System.out.println("Maximum count is "+tCount[5]);
        System.out.println("Maximum Count of Wing A "+tCa[5]);
        System.out.println("Maximum Count of Wing B "+tCb[5]);
        System.out.println("Minimum count is "+tCount[0]);
        System.out.println("Minimum Count of Wing A "+tCa[0]);
        System.out.println("Minimum Count of Wing B "+tCb[0]);
    }
    //MainMethod
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Bay bays[]=new Bay[4];
        BayTest bayTest=new BayTest();
        bays[0]=new Bay(1, 'A', "GSS1FAWS068","jo@gmail.com");
        bays[1]=new Bay(2, 'B', "GSS2FBWS008","anu@gmail.com");
        bays[2]=new Bay(4, 'A', "GSS4FAWS018","ashok@gmail.com");
        bays[3]=new Bay(3, 'A', "GSS3FAWS010", "prakash@gmail.com");
        System.out.println("Enter 1 For vacant \nEnter 2 for Assign \nEnter 3 for Reasign \nEnter 4 for FloorInformation");
        int n=sc.nextInt();
        switch(n){
            case 1:
                    //vacant
                     System.out.println("Enter the bayno you want to vacant");
                     String input=sc.next();
                     bayTest.vacantBayNo(input, bays);
                     break;
            case 2:   
                    //assign
                     System.out.println("Enter the bayno you want to Assign");
                     String bayInput=sc.next();
                     System.out.println("Enter the mail id Assign ");
                     String emailInput=sc.next();
                     bayTest.assignBayNo(bayInput, bays,emailInput);
                     break;
            case 3:
                    //reasign
                     System.out.println("Enter the 1st bayno you want to ReAssign");
                     String baynum=sc.next();
                     System.out.println("Enter the 2nd bayno you want to Reassign");
                     String baynum2=sc.next();
                     bayTest.reAssignBayNo(baynum, bays,baynum2);
                    break;
            case 4:
                   //floorinformation
                    bayTest.getFloorInformations(bays);
            default:
                 System.out.println("Please Enter the valid no in 1 2 3 4");
        }
       
        sc.close();
    }
   
}

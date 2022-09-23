package com.first.hashing;

public class Test {
    public static void main(String[] args) {
        String bay[]={"GSS1FBWS068","GSS2FAWSO62","GSS2FAWS041","GSS3FAWS071","GSS3FAWS023","GSS5FBWS051","GSS5FAWS051","GSS5FBWS048","GSS5FBWS048"};
        //totall no of bays
        System.out.println("total no of bays "+bay.length);
        int count=0,ca=0,cb=0,max=0;
        int totalcount[]=new int[6];
        int totalca[]=new int[6];
        int totalcb[]=new int[6];
        //grount floor count
        for(int i=0;i<bay.length;i++){
            if(bay[i].contains("0F")){
                count=count+1;
                if(bay[i].contains("A")){
                    ca=ca+1;
                }
                 else if(bay[i].contains("B")){
                    cb=cb+1;
                 }
            }
        }
        System.out.println("Total count of ground floor "+count+" Wing A "+ca+" Wing B "+cb);
        totalcount[0]=count;
        totalca[0]=ca;
        totalcb[0]=cb;
        count=0;
        ca=0;
        cb=0;
        //first floor count
        for(int i=0;i<bay.length;i++){
            if(bay[i].contains("1F")){
                count=count+1;
                if(bay[i].contains("A")){
                    ca=ca+1;
                }
                 else if(bay[i].contains("B")){
                    cb=cb+1;
                 }
            }
        }
        System.out.println("Total count of 1st floor "+count+" Wing A "+ca+" Wing B "+cb);
        totalcount[1]=count;
        totalca[1]=ca;
        totalcb[1]=cb;
        count=0;
        ca=0;
        cb=0;
        //Second floor count
        for(int i=0;i<bay.length;i++){
            if(bay[i].contains("2F")){
                count=count+1;
                if(bay[i].contains("A")){
                    ca=ca+1;
                }
                 else if(bay[i].contains("B")){
                    cb=cb+1;
                 }
            }
        }
        System.out.println("Total count of 2nd floor "+count+" Wing A "+ca+" Wing B "+cb);
        totalcount[2]=count;
        totalca[2]=ca;
        totalcb[2]=cb;
        count=0;
        ca=0;
        cb=0;
         //third floor count
         for(int i=0;i<bay.length;i++){
            if(bay[i].contains("3F")){
                count=count+1;
                if(bay[i].contains("A")){
                    ca=ca+1;
                }
                 else if(bay[i].contains("B")){
                    cb=cb+1;
                 }
            }
        }
        System.out.println("Total count of 3rd floor "+count+" Wing A "+ca+" Wing B "+cb);
        totalcount[3]=count;
        totalca[3]=ca;
        totalcb[3]=cb;
        count=0;
        ca=0;
        cb=0;
         //fourth floor count
         for(int i=0;i<bay.length;i++){
            if(bay[i].contains("4F")){
                count=count+1;
                if(bay[i].contains("A")){
                    ca=ca+1;
                }
                 else if(bay[i].contains("B")){
                    cb=cb+1;
                 }
            }
        }
        System.out.println("Total count of 4th floor "+count+" Wing A "+ca+" Wing B "+cb);
        totalcount[4]=count;
        totalca[4]=ca;
        totalcb[4]=cb;
        count=0;
        ca=0;
        cb=0;
         //fifth floor count
         for(int i=0;i<bay.length;i++){
            if(bay[i].contains("5F")){
                count=count+1;
                if(bay[i].contains("A")){
                    ca=ca+1;
                }
                 else if(bay[i].contains("B")){
                    cb=cb+1;
                 }
            }
        }
        System.out.println("Total count of 5th floor "+count+" Wing A "+ca+" Wing B "+cb);
        totalcount[5]=count;
        totalca[5]=ca;
        totalcb[5]=cb;
        int p=0;
        //highest count 
        for(int i=0;i<6;i++){
            if(max<totalcount[i]){
                max=totalcount[i];
                p=i;
            }
              
        }
        System.out.println("Maximum count is "+max+" floor no "+p);
        max=0;
        p=0;
        //highest count of Wing A 
          for(int i=0;i<6;i++){
            if(max<totalca[i]){
                max=totalca[i];
                p=i;
            }
              
        }
        System.out.println("Maximum count of Wing A "+max+" floor no "+p);
        max=0;

        //highest count of Wing B
          for(int i=0;i<6;i++){
            if(max<totalcb[i])
              max=totalcb[i];
        }
        System.out.println("Maximum count of Wing B "+max);
        
    }
}

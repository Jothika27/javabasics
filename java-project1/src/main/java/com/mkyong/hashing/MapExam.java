package com.mkyong.hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExam {
    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap<Integer,String>();
        m.put(1, "Jothika");
        m.put(2, "Santhosh");
        m.put(3, "Ganesh");
        m.put(4, "Harish");
        m.put(5, "Madhan");
        m.remove(5);
       System.out.println(m.get(1)) ;
       System.out.println(m.containsKey(3));
       m.replace(1, "Madhan");
       System.out.println(m);
         for (Map.Entry<Integer, String> entry : m.entrySet()) {
          if(entry.getValue()=="Madhan"){
            System.out.println("Key of Madhan "+entry.getKey());
          }
        }
       Iterator<Integer> i=m.keySet().iterator();
       while(i.hasNext()){
        System.out.println(m.get(i.next()));
       }

    }
}

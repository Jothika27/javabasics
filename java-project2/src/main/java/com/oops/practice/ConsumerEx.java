package com.oops.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerEx {
    public static <T> void main(String[] args) {
        List<String> s=new ArrayList<String>();
        s.add("Jo");
        s.add("Jothi");
        s.add("Jothika");
        s.add("Jothika");
        System.out.println("Lambda Expresion");
        s.forEach((t) -> System.out.println(t));
        Consumer<String> c=new Consumer<String>() {

            @Override
            public void accept(String x) {
                System.out.println(x);
            } 
        };
        System.out.println("using consumer");
        s.forEach(c);
        System.out.println("Methode Reference");
        s.forEach(System.out::println);
        System.out.println("Stream Functions");
       Set<String> m = s.stream().collect(Collectors.toSet());
       m.forEach(System.out::println);   
      
    }
}

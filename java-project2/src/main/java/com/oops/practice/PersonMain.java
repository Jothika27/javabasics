package com.oops.practice;

// import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> p= Arrays.asList(new Person(12, "Jo", 45.3f),new Person(14, "Jothika", 48.3f),new Person(13, "Santhosh", 60.5f),new Person(15, "Jothika", 50));
        //Maximum 
       p.stream().max(Comparator.comparing(Person::getWeight))
       .ifPresent(s-> System.out.println("sort by alphabet order person max " + s.getWeight()));
       //minimum
       p.stream().min(Comparator.comparing(Person::getWeight))
       .ifPresent(s-> System.out.println("sort by alphabet order person min " + s.getWeight()));
       //Filter
       System.out.println("Endswith filter");
      List<Person> p1= p.stream().filter(s->s.getName().endsWith("o")).collect(Collectors.toList());
      p1.forEach(System.out::println);
      System.out.println("Startswith filter");
      List<Person> p3= p.stream().filter(s->s.getName().startsWith("J")).collect(Collectors.toList());
      p3.forEach(System.out::println);
      //count
      System.out.println(p.stream().filter(s->s.getWeight()>47).count());  
      //distinct
      System.out.println("Distinct Name");
      List<String> p2=p.stream().map(Person::getName).distinct().collect(Collectors.toList());
      p2.forEach(System.out::println);
      //skip
      System.out.println("Using Skip");
      p.stream().skip(1).forEach(System.out::println);
      //limit
      System.out.println("Using limit");
      p.stream().limit(3).forEach(System.out::println);
     //allmatch
     System.out.println(p.stream().allMatch(s->s.getWeight()>45.0&&s.getName().endsWith("o")));
      //anymatch
      System.out.println(p.stream().anyMatch(s->s.getWeight()>45.0&&s.getName().endsWith("o")));
      //nonmatch
      System.out.println(p.stream().noneMatch(s->s.getWeight()>45.0&&s.getName().endsWith("o")));
      // string reduce
     String[] arr = { "this", "is", "String", "reduce" };
     String result = Arrays.stream(arr).reduce("", (a, b) -> a + b);
     System.out.println(result);
     // number reduce
     int[] my = { 1, 78, 4, 23,1,4};
     int result1 = Arrays.stream(my).reduce(0, (a, b) -> a + b);
     System.out.println(result1);
     int r=Arrays.stream(my).sum();
     System.out.println(r);
     System.out.println("Maximum in Array "+Arrays.stream(my).max()); 
     System.out.println("Manimum in Array "+Arrays.stream(my).min()); 
     System.out.println(Arrays.stream(my).distinct().count());
     // sort
     List<Person> sl = p.stream().sorted(Comparator.comparing(Person::getWeight)).collect(Collectors.toList());
     sl.forEach(System.out::println);
     //sum, min, max
     List<Integer> A = Arrays.asList(1,2,3,4,5);
     System.out.println(A.stream().mapToInt(i->i).sum());
     System.out.println(A.stream().mapToInt(i->i).max().getAsInt());
     System.out.println(A.stream().mapToInt(i->i).min().getAsInt());
     System.out.println(Collections.max(A));
    }
}

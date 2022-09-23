package com.stream.hashing;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

public class Streamex {
    /**
     * @param args
     * @throws FileNotFoundException
     * @throws JsonIOException
     * @throws JsonSyntaxException
     */
    public static void main(String[] args) throws JsonIOException, JsonSyntaxException, FileNotFoundException {
      System.out.println("from GsonConversion");
      Gson gson = new Gson();
      List<Employee> l=new ArrayList<>();
       Object emp = gson.fromJson(new FileReader("D:\\jothika\\json\\employee.json"), new TypeToken<List<Employee>>(){}.getType());
       l=(List<Employee>)emp;
       System.out.println(l);

       System.out.println("\nto GsonConversion");
       System.out.println(gson.toJson(l.stream().limit(5).collect(Collectors.toList())));

       System.out.println("\ncount of object");
       System.out.println( l.stream().count());

       System.out.println("\ngroup by age");
       Map<Integer, List<Employee>> agegrouping = l.stream().collect(Collectors.groupingBy(Employee::getAge));
       System.out.println(agegrouping);

       System.out.println("\ncontains ");
       List<Employee> filtersh = l.stream().filter(x->x.getName().contains("sh")).collect(Collectors.toList());
       filtersh.forEach(System.out::println);

       System.out.println("\n && filter");
       List<Employee> filtersh1 = l.stream().filter(x->x.getName().contains("sh")&&x.getWeight()>80).collect(Collectors.toList());
       filtersh1.forEach(System.out::println);

       System.out.println("\nmap to int avg ");
       System.out.println(l.stream().mapToInt(x->x.getAge()).average().getAsDouble());

       System.out.println("\ncomparator");
       List<Employee> o = l.stream().filter(x->x.getName().contains("sh")).sorted(Comparator.comparing(Employee::getDob)).collect(Collectors.toList());
       System.out.println(o);

       System.out.println("\nmin compare");
      Optional<Employee> op = l.stream().min(Comparator.comparing(Employee::getWeight));
      System.out.println(op);

      System.out.println("\nequalsignorecase");
      List<Employee> ol = l.stream() .filter(p -> p.getName().equalsIgnoreCase("jo")) .filter(p -> p.getAge() > 20).collect(Collectors.toList());
      System.out.println(ol);   
    }
    
}

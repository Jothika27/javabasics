package com.oops.practice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;

public class CsvExample {
    public static void main(String[] args) throws CsvException, IOException {
        List<BayCsv> b=new CsvToBeanBuilder<BayCsv>(new FileReader("C:\\Users\\jothika.r\\Documents\\baydetails.csv")).
        withType(BayCsv.class).build().parse();
        CSVWriter c=new CSVWriter(new FileWriter("C:\\Users\\jothika.r\\Documents\\bay.csv"));
       // c.writeAll(b);
       //1.floor wise count using stream
        System.out.println("Floorwise Count");
       System.out.println( b.stream().collect(Collectors.groupingBy(BayCsv::getFloor, Collectors.counting())));
       //2.floor and baytype wise count using stream
       System.out.println("Floor and baytype count");
       System.out.println( b.stream().collect(Collectors.groupingBy(BayCsv::getFloor,Collectors.groupingBy(BayCsv::getBaytype,Collectors.counting()))));
       //3.assign a bay for an employee
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the bayNo to assign");
       String input1=sc.next();
       System.out.println("Enter the Associate Name to assign a bay");
       String input2=sc.next();
       List<BayCsv> output = b.stream().filter(x->x.getBayno().equals(input1)&&x.getStatus().equals("Vacant")).collect(Collectors.toList());
       output.forEach(x->x.setAssociate_name(input2));
       output.forEach(System.out::println);
       //4.vacant a seat 
       System.out.println("Enter the bayNo to assign");
       String vacantbay=sc.next();
       List<BayCsv> vacantbaylist = b.stream().filter(x->x.getBayno().equals(vacantbay)).collect(Collectors.toList());
        vacantbaylist.forEach(x->x.setAssociate_name(null));
       //5.list the baytype and floor which is vacant
       System.out.println("vacant bay types");
       List<BayCsv> output1 = b.stream().filter(x->x.getStatus().equals("Vacant")).collect(Collectors.toList());
       output1.forEach(x->System.out.println(x.getBaytype()+x.getBayno()));
       sc.close();
   }
}
 





// try (CSVReader reader = new CSVReader(new FileReader("C:\\Users\\jothika.r\\Documents\\baydetails.csv"))) {
        //     List<String[]> r = reader.readAll();
        //     r.forEach(x -> System.out.println(Arrays.toString(x)));
        // }
        // b.forEach(System.out::println);
          //Floorwise Count
    //   System.out.println( b.stream().collect(Collectors.groupingBy(BayCsv::getFloor, Collectors.counting())));
      //floorwise baytype count
    //   System.out.println( b.stream().collect(Collectors.groupingBy(BayCsv::getFloor,Collectors.groupingBy(BayCsv::getBaytype,Collectors.counting()))));
      //
    //   System.out.println(b.stream().filter(s->s.getStatus().contains("vacant")).collect(Collectors.toList()));
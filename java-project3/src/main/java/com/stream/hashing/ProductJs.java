package com.stream.hashing;

import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

public class ProductJs {
    public static void main(String[] args) throws JsonIOException, JsonSyntaxException, FileNotFoundException {
        Gson gson = new Gson();
        List<Product> li = new ArrayList<>();
        System.out.println("From Json");
        Object pro = gson.fromJson(new FileReader("D:\\jothika\\json\\product.json"), new TypeToken<List<Product>>(){}.getType());
        li=(List<Product>)pro;  //narrowing
        System.out.println(li);

        System.out.println("Process");
        System.out.println(li.stream().filter(x->x.getBrand().equalsIgnoreCase("Gucci")).collect(Collectors.toList()));
    }
}

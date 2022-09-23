package com.stream.hashing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcExample {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
      
      Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/baydb?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
      "root", "") ;

       Statement stm = con.createStatement();
       int executeUpdate = stm.executeUpdate("update books set author='J K Rowling' where id=1007");
       System.out.println(executeUpdate); 

       boolean r=stm.execute("insert into books values (1006, 'Games of Thrones ', 'Arya Stark', 18.11, 13)");
       System.out.println(r);

      // int executeUpdate = stm.executeUpdate("delete from books where id=1006");
      // System.out.println(executeUpdate);  

      Statement s = con.createStatement();
      ResultSet r1=s.executeQuery("select count(id) as total from books");
      while(r1.next())
        System.out.println(r1.getString("total"));

      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery("Select * from books");
      List<Book> l= new ArrayList<Book>();
      while(rs.next()){
        l.add(new Book(rs.getInt("id"), rs.getString("title"), rs.getString("author"),rs.getFloat("price") ,rs.getInt("qty") ));
      }
      System.out.println(l);
    
      con.close();
    }
}

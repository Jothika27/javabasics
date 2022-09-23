package com.oops.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class BayTest {
    public static void main(String[] args) {
      List<Bay> l=Arrays.asList(new Bay("GSS","Third Floor","West","WS","GSS3FBWS076","Occupied",28957,"abinanth.s@kgisl.com","S ABINANTH"  ,"2022-06-17","3FB"),
      new Bay("GSS","Third Floor","West","WS","GSS3FBWS056","Occupied",28333,"palanivel.c@kgisl.com","PALANIVEL C" ,"2022-06-17","3FB"),
      new Bay("GSS","Third Floor","East","WS","GSS3FAWS058","Occupied",26263,"kishore.kumar@kgisl.com","KISHORE KUMAR" ,"2022-06-17","3FA"),
      new Bay("GSS","Ground Floor","East","Room","GSSGFAWS016","Occupied",26426,"hari.rao@kgisl.com","HARI VENKATA PRASADA RAO GOPISETTI" ,"2022-06-22","GFA"),
      new Bay("GSS","Ground Floor","East","Room","GSSGFAWS040","Vacant",0,null,null,null,"GFA"	),
      new Bay("GSS","First Floor","West","WS","GSS1FBWS001","Vacant",0,null,null,null,"1FA"	),
      new Bay("GSS","Fourth Floor","East","PM Cabin","GSS4FAWS076","Occupied",19228,"alexvinoraj@kgisl.com","ALEX VINO RAJ T",null,"4FA"));
      //Floorwise Count
      System.out.println( l.stream().collect(Collectors.groupingBy(Bay::getFloor, Collectors.counting())));
      //floorwise baytype count
      System.out.println( l.stream().collect(Collectors.groupingBy(Bay::getFloor,Collectors.groupingBy(Bay::getBaytype,Collectors.counting()))));
      //
     
  }  
}
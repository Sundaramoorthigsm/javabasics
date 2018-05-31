package com.basic;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
public class CurrentDateTime1 {    
  public static void main(String[] args) {    
   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/yyy/dd HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();  
   System.out.println(dtf.format(now));  
  }    
}        




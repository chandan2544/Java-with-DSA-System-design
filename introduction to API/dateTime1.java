// data and time API in java
//  we  can call date and Api in  java using two class 
// 1. java.util - argument is not required 
//  2.java.Sql - argument is compulsory

import java.util.Date;
import java.sql.*;

public class dateTime1 {

     public static void main(String[] args) {

        // java.util.Date;
        Date d=new Date();
        long timeInMs=d.getTime();

        Time t=new Time(timeInMs);
        
        System.out.println(d);      
        System.out.println(t);
    }
}
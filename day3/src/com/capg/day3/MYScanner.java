package com.capg.day3;

import java.io.PrintStream;
import java.util.Scanner;

public class MYScanner {


    public static void main(String[] args) {
  
        Scanner sc= new Scanner(System.in);    
        PrintStream output=new PrintStream(System.out);
        System.out.println("enter value other than int");
        int num5=sc.nextInt();
        System.out.println(num5);
              
          System.out.println("Enter Number 1"); 
          int num1=sc.nextInt();
          System.out.println("entered number is "+num1);
         
          float f=sc.nextFloat(); System.out.println("float number "+f);
          
          double d=sc.nextDouble(); System.out.println("Print double "+d);
          
         
          System.out.println("enter boolean value"); boolean b=sc.nextBoolean();
          System.out.println("Print boolean "+b);
       
          byte bt=sc.nextByte(); 
          System.out.println("Print byte "+bt);
      
          System.out.println("enter  String"); 
          String str=sc.next(); 
          System.out.println("Print String "+str);
    
        
          System.out.println("enter  Line"); String str1=sc.nextLine();
          System.out.println("Print Line "+str1);
    
        System.out.println("Enter the char");
        char c= sc.next().charAt(0);
        System.out.println(c);
    }
}



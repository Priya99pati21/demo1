package com.capg.day3;

public class EmployeeMain {

	    public static  void main(String[] args) throws InterruptedException {
	         
	        
	        
	        
	        Employee employee=new Employee(1001, "Umesh", 50000);
	        Employee employee1=new Employee(1002, "komal", 30000);
	        Employee employee2=new Employee(1003, "priya", 20000);
	        //  wait(100000);
	        //whenever you print the object of any class it call the toString method
	        System.out.println(employee);
	        System.out.println(employee1);
	        System.out.println(employee2);
	      //Returns a hash code value for the object. 
	        System.out.println(employee.hashCode());
	        System.out.println(employee1.hashCode());
	        System.out.println(employee2.hashCode());
	        
	        System.out.println(employee.equals(employee1));
	        
	         
	        //hashCode --it is unique number .whenever any object in memory then it takes some memeory location
	        //address of that memory location
	        //wait -- it will stop the execution for few time'
	        //Notify--ask thread the start the execution 
	        //NotifyALl-- ask all the thread to start the execution
	        
	    }
	}



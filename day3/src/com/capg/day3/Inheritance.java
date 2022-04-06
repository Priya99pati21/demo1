package com.capg.day3;


	class A {

		 

	    int a=10;
	    public void print() {
	        System.out.println("Class A");
	    }

	 

	}

	 

	//extends :it is keyword in java
	// it is used to extends the another
	//extends className

	 

	//child or sub class
	class B extends A {

	 

	}

	 

	public class Inheritance {
	    
	    public static void main(String[] args) {
	        B b=new B();
	        //Accessing the A class Method
	        b.print();
	        //Accessing the A class variable
	        System.out.println(b.a);
	    }

	 

	}



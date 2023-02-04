package com.upskill.java_4;

public class Polymorphism {
	
	
	public static void main(String[] args) {
		car();
		car(10);
		car("Moon");
	}
	
	public static void car(){
		System.out.println("My car is Audi !");
	}

	public static void car(int hp){
		System.out.println("My car is Hummer ! " + "It has engine " + hp);
	}
	
	public static void car(String roof){
		System.out.println("My car is BMW ! " + "It has roof : " + roof);
	}
	
	public static void car(int battery, String motor){
		System.out.println("My car is Tesla ! " + "It has battery : " + battery + "It has Motor : " + motor);

	}
}

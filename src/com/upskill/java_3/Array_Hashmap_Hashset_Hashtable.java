package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_Hashtable {

	public static void main(String[] args) {
		
		//Array store multiple date using index
		
		int age = 30;											//Variable
																//Array
		int[] ageDeadpool = new int[]{25, 21, 35, 30, 40};
		
		//Array index     			[0]  [1]  [2]  [3]  [4]
		
		System.out.println("Student age : " + ageDeadpool[1]);
		System.out.println("Total Student : " + ageDeadpool.length);
		
		
		String[] nameDeadpool = new String[]{"Tahin", "Masud", "Shishir", "Zaman"};
		
		System.out.println("Student name : " + nameDeadpool[1]);
		System.out.println("Total Student name : " + nameDeadpool.length);
		
		//nameCity
		String[] nameCity = new String[]{"NYC", "Bronx", "Ozone", "Queens"};
		
		System.out.println("City Name : " + nameCity[3]);
		System.out.println("Total City : " + nameCity.length);
		
		
		//Multi-Diementional Array
		int[][] ageUpSkill2D = {{25, 21, 35, 30, 40},			
						{24, 28, 22, 26}};
		
		System.out.println("Student Age 2D : " + ageUpSkill2D[0][3]);
		
		// Hashmap store multipul data using key-value pair, Implementation of map interface
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Tanzu", 22);
		Student.put("Tahin", 21);
		Student.put("Masud", 25);
		
		System.out.println("HashMap Student Age : " + Student.get("Masud"));
		
		
		HashMap<String, String> Capital = new HashMap<String, String>();
		
		Capital.put("BD", "Dhaka");
		Capital.put("USA", "Washington DC");
		
		//Hashset store unordered collection contacting unique value, Implementation of Set interface
		
		HashSet<String> car = new HashSet<String>();
		
		car.add("BMW");
		car.add("Toyoyta");
		car.add("Camrey");
		
		System.out.println("Car : " + car);
		
		HashSet<String> Capital1 = new HashSet<String>();
		
		Capital1.add("Dhaka");
		Capital1.add("Sylhet");
		Capital1.add("Argentina");
		
		System.out.println("Capital : " + Capital1);
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		
		Region.put("BD", "Asia");
		Region.put("USA", "America");
		
		System.out.println("Region : " + Region.get("BD"));
		
		}
}
		
		
	


	
				
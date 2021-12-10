package com.javapractice.ArrayLists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		
		
		
		/**
		 * If you want to do some action repeatedly for n no of times we use for loop
		 * 
		 * A teacher have to give 100 marks for 50 students on their answer sheet
		 *
		 * Action -> Marking the answer sheets with 100 marks
		 * 
		 * No of times -> 60 times
		 */
		
		ArrayList<Integer> numberlist =new ArrayList<>();
		numberlist.add(10);
		numberlist.add(20);
		numberlist.add(30);
		numberlist.add(40);
		numberlist.add(50);
		numberlist.set(2, 50);
		numberlist.remove(2);
	    //numberlist.clear();
		System.out.println(numberlist);
		System.out.println(numberlist.size());
		System.out.println(numberlist.get(2));
		System.out.println(numberlist);
		for(int i=0; i<numberlist.size(); i++) {
			//System.out.println(numberlist);
			System.out.println(numberlist.get(i));
		}
		
		List<String> names = new ArrayList<>();
		names.add("Delhi");
		names.add("Mumbai");
		names.add("Kerla");
		names.add("chennai");
		names.add("AndhraPradesh");
		names.add("Goa");
		Collections.sort(names);
		for(String str:names) {
			System.out.println(str);
		}
		//Use an ArrayList sorting and accessing data and LinkedList Manipulating data
		
		LinkedList<String> animals = new LinkedList<>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cow");
		animals.add("Rat");
		animals.add("Lion");
		animals.addFirst("Tiger");
		Collections.sort(animals);
		System.out.println(animals.getFirst());
		for(String string:animals) {
		System.out.println(string);
		}
	
		//How to convert ArrayList to String Array in Java
	    ArrayList<String> arraylist = new ArrayList<>();
	    arraylist.add("Mango");
	    arraylist.add("Apple");
	    arraylist.add("Orange");
	    arraylist.add("Gova");
	    arraylist.add("Papaya");
	    
	    String array[] = new String[arraylist.size()];
	    for(int i=0; i<arraylist.size(); i++) {
	    	array[i] = arraylist.get(i);	
	    }
	    for(String k:arraylist) {
	    System.out.println(k);
}
	    
	   List<Integer> number = new ArrayList<>();
	   number.add(10);
	   number.add(20);
	   number.add(30);
	   number.add(40);
	   number.add(50);
	   
	   Integer array[]= new Integer[number.size()];
	   for(int i=0; i<number.size(); i++) {
		   array[i] = number.get(i);
		   
	   }
	   for(Integer k : number) {
		   System.out.println(k);  
	   }
	   LinkedList<String> name = new LinkedList<>();
	   name.add("prasanna");
	   name.add("kamalika");
	   name.add("deepthi");
	   name.add("kohi");
	   
	   String array[] = new String[name.size()];
	   for(int i =0; i<name.size(); i++) {
		   array[i] = name.get(i);
		   
	   }
	   for(String k :name) {
		   System.out.println(k);
	   }
	   LinkedList<Integer> number = new LinkedList<>();
	   number.add(10);
	   number.add(20);
	   number.add(30);
	   number.add(40);
	   number.add(50);
	   Integer array[] = new Integer[number.size()];
	   for(int j=0; j<number.size(); j++) {
		   array[j] = number.get(j);
	   }
	   for(Integer k: number) {
		   System.out.println(k);
	   }
	   //How to convert Array to Arraylist in java
	   String fruitnames[] = {"Apple","Mango","Papaya","Grape"};
	   ArrayList<String> Fruit= new ArrayList<String>(Arrays.asList(fruitnames));
	   Fruit.add("Gova");
	   Fruit.add("Orange");
	   for(String Testy:Fruit) {
		   System.out.println(Testy);
	   }
	   
	   Integer numbers[] = {10,20,40,60,50};
	   ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(numbers));
	   num.add(80);
	   num.add(90);
	   Collections.sort(num);
	   for(Integer k:num) {
		   System.out.println(k);
	   }
	   
	}
}
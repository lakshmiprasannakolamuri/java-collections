package com.javapractice.ArrayLists;

import java.util.ArrayList;
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
		
		for(int i = 0; i < 60; i++)
		{
			//System.out.println("Marks is 100/100");
		}
		
		List<String> names = new ArrayList<>();
		
		names.add("Vamsi");
		names.add("Prasanna");
		
		for(String name  : names) 
		{
			if(name != null)
			{
				//System.out.println(" name is not null");
			}
			
		}

		ArrayList<Integer> numberlist = new ArrayList<>();
		
		numberlist.add(10);
		numberlist.add(20);
		numberlist.add(30);
		numberlist.add(40);
		
		ArrayList<Integer> resultlist = new ArrayList<>();
		
		
		
		
		
		System.out.println("NumberList: " + numberlist);
		for(int i=0; i<numberlist.size(); i++) 
		{
			Integer addTwo = numberlist.get(i) + 2 ;
			//System.out.println("From ist loop: " + addTwo);
			resultlist.add(addTwo);
		}
		
		System.out.println("ResultList: " + resultlist);

		//Advanced for loops
		
		//for every number in the list of numbers
          for(Integer number :numberlist) {
        	  
        	  System.out.println("From second loop: " + number + 2);
          }

	}

}

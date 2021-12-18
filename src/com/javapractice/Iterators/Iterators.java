package com.javapractice.Iterators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Iterators
{

	public static void main(String[] args)
	{
		// public static iterators();

	/*	LinkedList<String> subject = new LinkedList<>();
		subject.add("physics");
		subject.add("maths");
		subject.add("chemistry");
		subject.add("java");
		subject.add("sql");

		Iterator<String> subjects = subject.iterator();

		while (subjects.hasNext())
		{
			String name = subjects.next();
			System.out.println(name);

			System.out.println();

		}
		for (String sb : subject)
		{
			System.out.println(sb);

		}

		// public static void iterators() {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);

		Iterator<Integer> num = numbers.iterator();
		while (num.hasNext())
		{
			Integer i = num.next();
			if (i > 6)
			{
				num.remove();
				System.out.println(i);
			}
		}
		for (int i = 0; i < 10; i++)
		{

			System.out.println(i);
		}

		HashMap<String, String> brandNames = new HashMap<>();
		brandNames.put("nike", "shoes");
		brandNames.put("gucci", "glass");
		brandNames.put("titan", "watchs");
		brandNames.put("aavasa", "dress");
		brandNames.put("levis", "jeans");*/

		// Set<String> it = HashMap.it();
		/*
		 * Iterator<String> it =((List<String>) brandNames).iterator(); String name =
		 * it.next(); System.out.println(name);
		 */

		ArrayList<String> letters = new ArrayList<>();
		letters.add("A");
		letters.add("B");
		letters.add("C");
		letters.add("D");

		System.out.println();

		Iterator<String> itr = letters.iterator();
		while (itr.hasNext())
		{
			String elements = itr.next();

			System.out.print(elements + " ");
		}

		System.out.println();

		ListIterator<String> it = letters.listIterator();
		while (it.hasNext())
		{
			String elements = it.next();

			System.out.print(elements  +  "+");

		}
		System.out.println("Modified elements of letters");

		itr = letters.iterator();
		while (itr.hasNext())
		{
			String elements = itr.next();
			System.out.print(elements + " ");
		}
		System.out.println();
		System.out.println("Modified list backwards: ");

		while (it.hasPrevious())
		{
			String elements = it.previous();
			System.out.print(elements + " ");
		}
		System.out.println();
		
		ArrayList<Integer> values = new ArrayList<>();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		
		System.out.println("Contents of values :");
		
		for(int V : values) 
			System.out.println(V +" ");
			
			int sum = 0;
			for(int V : values) 
				sum +=V;
				System.out.println("Sum of values :"+sum);
			}
		}
	

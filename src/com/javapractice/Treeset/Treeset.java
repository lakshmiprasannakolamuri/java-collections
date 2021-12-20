package com.javapractice.Treeset;

import java.util.TreeMap;
import java.util.TreeSet;

public class Treeset
{

	public static void main(String[] args)
	{
    TreeSet<Integer> treeset = new TreeSet<>();
    treeset.add(5);
    treeset.add(6);
    treeset.add(10);
    treeset.add(8);
    treeset.add(9);
    
    System.out.println(treeset);
    
    TreeSet<String> treeset1 = new TreeSet<>();
    treeset1.add("A");
    treeset1.add("B");
    treeset1.add("P");
    treeset1.add("D");
    treeset1.add("V");
    
    System.out.println(treeset1);
    System.out.println(treeset1.subSet("P", "V"));
    
    
    TreeMap<String, Double> treemap = new TreeMap<>();
    treemap.put("Apple", 30.0);
    treemap.put("Orange", 45.2);
    treemap.put("Papaya", 154.3);
    treemap.put("kiwi", 22.9);
    treemap.put("Banana", 55.7);
    
    System.out.println(treemap);
    
    
    
	}

}

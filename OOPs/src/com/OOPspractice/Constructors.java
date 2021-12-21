package com.OOPspractice;
import java.util.Scanner;

public class Constructors
{

	String name = "";
	int marks = 0;
	
	public Constructors(String n, int m) {
		name = n;
		marks = m;
		
	}
	public void show_details() {
		System.out.println("Name of the student:"+ name);
		System.out.println("Marks of the student:"+marks);
	}

	

}

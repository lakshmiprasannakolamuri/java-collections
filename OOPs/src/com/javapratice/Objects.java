package com.javapratice;

import java.util.Scanner;

public class Objects
{

	Scanner scan = new Scanner(System.in);

	String name = "";
	int marks = 0;

	public void get_details()
	{
		System.out.println("Enter the name:");
		name = scan.nextLine();

		System.out.println("Enter the marks:");
		marks = scan.nextInt();

	}

	public void show_details()
	{
		System.out.println("Name of the student" + name);
		System.out.println("Marks of the student" + marks);
	}
}

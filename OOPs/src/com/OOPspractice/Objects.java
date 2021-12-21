package com.OOPspractice;

import java.util.Scanner;

public class Objects
{
	Scanner scan =new Scanner(System.in);
	
	String name = "";
	int marks = 0;
	
	public void get_deatils() {
		System.out.println("Enter the name: ");
		name = scan.nextLine();
		System.out.println("Enter the marks: ");
		marks = scan.nextInt();
	}
	public void show_details() {
		System.out.println("name of the student:"+ name);
		System.out.println("marks of the students:"+marks);
	}
}
package com.OOPspractice;

import java.util.Scanner;

public class Student
{

	public static void main(String[] args)
	{
     
     Scanner scan = new Scanner(System.in);
     
     System.out.println("Enter the name:");
     String my_name =scan.nextLine();
     
     System.out.println("Enter the marks");
     int my_marks = scan.nextInt();
     
     Constructors obj = new Constructors(my_name, my_marks);
     
     
     
     obj.show_details();
	}

}

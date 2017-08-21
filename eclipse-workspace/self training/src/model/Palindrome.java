package model;

import java.util.Scanner;

public class Palindrome {
	
	 
	
	
	   public static void main(String args[])
	   {
	      String name, reverse = "";
	      Scanner sc= new Scanner(System.in);
	 
	      System.out.println("Enter a string ");
	      name = sc.nextLine();
	 
	      int length = name.length();
	      
	    for ( int i = length - 1 ; i >= 0 ; i-- )
	         reverse = reverse + name.charAt(i);
	 
	    
	      System.out.println("Reverse of entered string is: "+reverse);
	if(name.equals(reverse))

	System.out.println("entered string is a palindrome number");
	else
	System.out.println("entered string is not a palindrome number");
	sc.close();
	   }
	}


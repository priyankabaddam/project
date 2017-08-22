package model;

import java.util.Scanner;

class Inheritance{
int z;

public void addition(int x, int y) {
	 z=x+y;
	 System.out.println("addition of given numbers:"+z);
	 
}
 

    }



public class Inheritance1 extends Inheritance{
	
	public static void main(String args[]) {
		
		int a,b;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a and b values:");
	    a = sc.nextInt();
		b = sc.nextInt();
		Inheritance1 obj = new Inheritance1();
		obj.addition(a, b);
		
		sc.close();
	}
	
	
}      
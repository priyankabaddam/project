package model;

import java.util.Scanner;

class SwapNumbers
{
   public static void main(String args[])
   {
      int a, b, ab;
      System.out.println("Enter a and b values");
      Scanner sc = new Scanner(System.in);
 
      a = sc.nextInt();
      b = sc.nextInt();
 
      System.out.println("Before Swapping\na = "+a+"\nb = "+b);
 
     ab = a;
      a = b;
      b = ab;
 
      System.out.println("After Swapping\na = "+a+"\nb = "+b);
      sc.close();
   }
}
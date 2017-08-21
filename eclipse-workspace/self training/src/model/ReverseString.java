package model;

import java.util.*;

class ReverseString
{
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
   sc.close();
   }
   
}
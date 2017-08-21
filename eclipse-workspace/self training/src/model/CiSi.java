package model;

import java.util.Scanner;

class CiSi
{
   public static void main(String args[])
   {
      double p,r,n;
      double ci,si;
      System.out.println("Enter the values of p,r,n");
      
	Scanner sc = new Scanner(System.in);
 
      p = sc.nextDouble();
      r = sc.nextDouble();
      n = sc.nextDouble();

      ci = p*Math.pow(1.0+r/100.0,n)-p;
      si = (p*n*r)/100;


            System.out. println(" The value of p:="+p );
            System. out. println("The value of n:="+n);
            System. out. println("The value of r:="+r);
            System.out.println("Simple Interest value is:="+si);
            System.out. println("Compound Interest value is:="+ci);

 sc.close();
   }
 
}  






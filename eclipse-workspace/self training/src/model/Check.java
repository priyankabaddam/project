package model;

import java.util.Scanner;

public class Check {
	

	   public static void main(String args[])
	   {
	      int n;
	      System.out.println("Enter the value of n:");
	      Scanner sc = new Scanner(System.in);
	 
	      n = sc.nextInt();
	        int[][] a = new int[n][n];
	          int[][] b = new int[n][n];
	           int[][] c = new int[n][n];

	 
	      System.out.println("enter the elements of matrix:");
	 
	      for(int i=0;i<n;i++)
	{
	 for(int j=0;j<n;j++)
	{
	a[i][j]=sc.nextInt();
	}
	}     
	System.out.println("enter the elements of matrix:");

	  for(int i=0;i<n;i++)
	{
	 for(int j=0;j<n;j++)
	{
	b[i][j]=sc.nextInt();
	}
	}     
	System.out.println("addition of the matrices are:");
	for(int i=0;i<n;i++)
	{
	for(int j=0;j<n;j++)
	{
	 c[i][j] = a[i][j]+b[i][j];
	}
	}
	System.out.println("addition of the matrices are:");
	for(int i=0;i<n;i++)
	{
	for(int j=0;j<n;j++)
	{
	System.out.print(c[i][j] + " ");
	            }
	            System.out.println();
	        }
	        sc.close();
	    }
	}

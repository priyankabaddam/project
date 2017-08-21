package model;

import java.util.Scanner;



public class Matrix{

public static void main(String args[]){

int n;
System.out.println("enter the value of n\n");
 Scanner sc=new Scanner(System.in);
  n=sc.nextInt();

 int[][] a=new int[n][n];
 int[][] b=new int[n][n];
 int[][] c=new int[n][n];
 int[][] d=new int[n][n];
int[][] t=new int[n][n];

System.out.println("enter the first matrix\n");
 for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
a[i][j]=sc.nextInt();
}
}


System.out.println("enter the second matrix\n");
 for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
b[i][j]=sc.nextInt();
}
}

System.out.println("The addition of two matrices are as follows:");
 for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
}
System.out.println("The addition of two matrices ");
 for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
    System.out.println(c[i][j]  + " ");
}
System.out.println();
}

System.out.println("The subtraction of two matrices are as follows:");
 for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
d[i][j]=a[i][j]-b[i][j];
}
}
System.out.println("The subtraction of two matrices ");
 for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
    System.out.println(d[i][j]  +" ");
}
System.out.println();
}
System.out.println("The tranpose of a matrix ");
 for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
    t[j][i]=a[i][j];
}
}
System.out.println("The transpose of a matrix is: ");
 for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
    System.out.println(t[i][j]  + " ");
    }
      System.out.println();
   }
           sc.close();
     }
}

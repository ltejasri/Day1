package project;

import java.util.Scanner;
public class Multidimen {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the no. of columns");
		int cols = sc.nextInt();
		System.out.println("Enter the elements of the array");
		int md[][] = new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				md[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the element to be searched");
		int ele = sc.nextInt();
		sc.close();
		for(int i=0;i<rows;i++)
		{
		for(int j=0;j<cols;j++)
		{
			if(ele==md[i][j])
			{
				System.out.println("Element is found");
			}
			
		}

	}System.out.println("Element not found");
	}
}

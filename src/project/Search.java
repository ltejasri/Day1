package project;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int ar[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		System.out.println("Enter the element to be searched");
		int vals = sc.nextInt();
		for(int i=0;i<=14;i++)
		{
			if(vals==ar[i])
			{
				System.out.println("Element found");
				break;
			}
			if(i==14)
			{
				System.out.println("element not found");
			}
		}


	}

}

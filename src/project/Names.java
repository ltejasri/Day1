package project;

import java.io.*;

public class Names {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name");
		String arr[]= {"Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dey", "Kity", "Meery", "Smith", "Johnson", 
					"Bill", "Williams", "Jones","Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson" };
	
		String str = br.readLine();
		int i,count=0;
		for(i=0;i<arr.length;i++)
		{
			
			if(arr[i].compareTo(str)==0)
				count++;
		}
		System.out.println(count);
	}

}

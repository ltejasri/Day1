package project;

import java.util.Scanner;
public class Sentence {

	public static void main(String[] args)
	{
		Scanner v=new Scanner(System.in);
		System.out.println("Enter the sentence.");
		String input=v.nextLine();
		String fin="";
		int i;
		for(i=0;i<input.length()-1;i++)
		{
			if(input.charAt(i) == input.charAt(i+1) && input.charAt(i) == ' ')
			{
			}
			else
			{
				fin+=input.charAt(i);
			}
		}
		fin=fin+input.charAt(i);
		input=fin;
		fin="";
		System.out.println("enter the word to be deleted");;
		String word=v.nextLine();
		System.out.println("Enter the position");;
		int position=v.nextInt();
		int count=0;
		for(i=0;i<input.length();i++)
		{
			if(input.charAt(i)==' ')
			{
				count++;
				if(count == (position-1))
				{
					fin = input.substring(0,  i+1)+input.substring(i+2+word.length());
				}
			}
		}
		System.out.println(fin);
		v.close();
	}

}

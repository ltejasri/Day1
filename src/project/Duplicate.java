package project;
import java.util.*;
public class Duplicate {

	public static void main(String[] args)
	{
		Scanner v=new Scanner(System.in);
		String str=v.nextLine();
		int len=str.length();
		String str2="";
		int count = 0;
		
		for(int i=0;i<len;i++)
		{
			char x=str.charAt(i);
			count=0;
			for(int j=0;j<str2.length();j++)
			{
				if(x==str2.charAt(j))
					count++;
			}
			if(count==0)
				str2+=x;
		}
		System.out.println(str2);;
		v.close();
	}

}

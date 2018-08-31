package project;
import java.util.*;
public class reverse {

	public static void main(String[] args) 
	{
		String str="",ans="";
		Scanner v=new Scanner(System.in);
		str=v.nextLine();
		v.close();
		String str2[]=str.split(" ");
		for(int i=0;i<str2.length;i++)
		{
			String rev="";
			for(int j=str2[i].length()-1;j>=0;j--)
			{
				rev=rev+str2[i].charAt(j);
			}
			ans=ans+rev+" ";
		}
		System.out.println(ans);

	}

}

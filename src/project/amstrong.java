package project;
public class amstrong
{
	public static void main(String[] args) 
	{
		for(int k=100;k<1000;k++)
		{
			int n=k;
			int s=0;
			int d=0;
			while(n>0)
			{
				d = n % 10;
				s = s + (d * d * d);
				n = n / 10;
			}
			if(k==s)
			{
				System.out.println(k+" is armstrong number");
			}
		}
	}

}

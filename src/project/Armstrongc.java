package project;

public class Armstrongc {

	public static void main(String[] args)
	{
		int n=153,n1,rem,res=0;
		n1=n;
		while(n1!=0)
		{
			rem=n1%10;
			res+=Math.pow(rem, 3);
			n1/=10;
		}
		if(res==n)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not an Armstrong Number");
		}

	}

}

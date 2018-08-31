package project;
import java.io.*;

public class square 
{
	void sqr(int n)
	{
		int sq=n*n;
		System.out.println(n + " * 1 = " + n +", Square: " + sq);
	}

	public static void main(String[] args) throws  IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value");
		int n=Integer.parseInt(br.readLine());
		square obj = new square();
		obj.sqr(n);
		
	}

}

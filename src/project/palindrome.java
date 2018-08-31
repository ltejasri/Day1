package project;
import java.io.*;
public class palindrome {

	public static void main(String[] args) 
	{
		int num=121, ri=0, r, oi;
		oi = num;
		while( num != 0)
		{
			r = num % 10;
			ri = ri * 10 + r;
			num /= 10;
		}
		if(oi == ri)
			System.out.println(oi + " is a palindrome");
		else
			System.out.println(oi + " is not a palindrome");

	}

}

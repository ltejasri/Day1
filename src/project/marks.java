package project;
import java.util.Scanner;
public class marks {

	public static void main(String[] args)
	{
	Scanner read = new Scanner(System.in);
	int m1 = read.nextInt();
	int m2 = read.nextInt();
	int m3 = read.nextInt();
	read.close();
	if(m1 > 60 && m2 > 60 && m3 > 60)
	{
		System.out.println("Passed");
	}
	else if(m1>60 && m2>60 || m2>60 && m3>60 || m3>60 && m1>60)
	{
		System.out.println("Promoted");
	}
	else 
	{
		System.out.println("Failed");
	}

}
}
package project;
import java.util.*;
public class CUI {

	public static void main(String[] args) 
	{
		String userid="Tejasri",password="12345";
		Scanner v=new Scanner(System.in);
		int n;
		for(int i=0;i<3;i++)
		{
			System.out.println("username:");
			String user=v.nextLine();
			System.out.println("Password:");
			String pass=v.nextLine();
			if(user.equals(userid) && pass.equals(password))
			{
				System.out.println("Welcome");
				break;
			}
			if(i==2)
			{
				System.out.println("Contact admin");
				break;
			}
			n=i;
			System.out.println("Sorry, try again.No of tries"+ ++n);
		}
		v.close();

	}

}

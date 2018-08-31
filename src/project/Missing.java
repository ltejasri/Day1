package project;
import java.util.Scanner;
public class Missing {

	public static void main(String[] args) 
	{
		Scanner v=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=v.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size-1;i++)
		{
			System.out.println("enter the number");
			arr[i]=v.nextInt();
		}
		int temp;
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-2-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int i=0;
		while(i<size-1) {
			if(i!=arr[i]) {
				System.out.println("missing number is "+i);
				break;
			}
			i++;
		}
		v.close();

	}

}

package project;

public class Bubble {

	public static void main(String[] args) 
	{
		int ar[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47},tp;
		for(int i=0;i<=14;i++)
		{
			for(int j=i+1;j<=14;j++)
			{
				if(ar[i]>ar[j])
				{
					tp=ar[i];
					ar[i]=ar[j];
					ar[j]=tp;
				}
			}
		}
		for(int i=0;i<=14;i++)
		{
			System.out.println(ar[i]+" ");
		}

	}

}

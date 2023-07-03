package Programms;

public class StrongNo {

	public static void main(String args[])
	{
		int n=145;
		int temp=n;
		
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			int mul=1;
			for(int i=1;i<=r;i++)
			{
				
				mul=mul*i;
				
			}
			sum=sum+mul;
			n=n/10;
		//	System.out.println(sum);
		}
		if(sum==temp)
		{
			System.out.print("strong number");
		}
		else
		{
			System.out.print("not a strong number");
		}
	}
}

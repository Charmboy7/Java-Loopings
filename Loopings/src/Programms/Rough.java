package Programms;
//import java.util.Scanner;

public class Rough {

	public static void main(String args[])
	{
		//program to find palindrome number
		
	//	Scanner s=new Scanner(System.in);
	//	System.out.println("Enter a number:");
	//	int n=s.nextInt();
	/*	int n=989;
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int z=n%10;
			sum=(sum*10)+z;
			n=n/10;
			
		}
		if(temp==sum)
		{
			System.out.println("The given number is Palindrome!");
			
		}
		else
		{
			System.out.println("The given number is not Palindrome!");
		}
		
		*/
		
		//program to print fibinoccy series
		
	/*	int a=1,b=2;
		System.out.println(a);
		System.out.println(b);
		int n=10;
		for(int i=3;i<=n;i++)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}          */
		
		//program to find amstrong number
/*		int n=371,r,sum=0;
		int temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("AmStrong Number");
		}else
		{
			System.out.println("not a Amstrong number");
		}             */
		
		//program to find Strong Number
		
		int n=145,r,sum=0;
		int temp=n;
		
		while(n>0)
		{
			int mul=1;
			r=n%10;
			for(int i=1;i<=r;i++)
			{
				mul=mul*i;
			}
			sum=sum+mul;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("Strong Number");
		}else
		{
			System.out.println("not a Strong Number");
		}
	}
}

package Programms;

public class Palindrome {

	public static void main(String args[])
	{
		int n=686;
		int temp=n,sum=0;
		
		while(n>0)
		{
			int r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Given number is Palindrome!");
		}
		else
		{
			System.out.println("Given number is not a Palindrome!");
		}
	}
}

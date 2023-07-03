package Programms;

// >for findingn prime number

// 1.natural number >1
// 2.prime has only two divisors i.e., 1 and itself

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=17;
		int count=0;
		
		for(int i=2;i<=num;i++)
		{
			if(num %i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime number");
			
		}else {
			System.out.println("not a prime number");
		}
	}
}
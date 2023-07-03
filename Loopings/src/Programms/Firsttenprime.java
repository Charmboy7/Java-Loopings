package Programms;

public class Firsttenprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum,n=100;
		for(int i=2;i<=n;i++)
		{
			sum=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
				sum=1;
				break;
				}
			}
			if(sum==0)
			{
				System.out.println(i);
			}
		}
	}
}


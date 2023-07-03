package DoWhileloop;

public class FactorialofN {
	
	void fact()
	{
		int i=1,mul=1,n=9;
		do
		{
			mul=i*mul;
		i++;	
		}while(i<=n);
		System.out.println(mul);
	}

	public static void main(String args[])
	{
		FactorialofN n=new FactorialofN();
		n.fact();
		
	}
}

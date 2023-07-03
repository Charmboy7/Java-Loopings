package WhileLoop;

public class FactorialofN {

	void fact()
	{
		int i=1,n=10,mul=1;
		while(i<=n)
		{
			mul=mul*i;
			i++;
		}
		System.out.println(mul);
	}
	
	public static void main(String args[])
	{
		FactorialofN n=new FactorialofN();
		n.fact();
	}
}

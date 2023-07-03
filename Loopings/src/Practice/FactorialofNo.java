package Practice;

public class FactorialofNo {

	int i,mul=1,n=10;
	void fact()
	{
		for(i=1;i<=n;i++)
		{
			mul=mul*i;
		}
		System.out.println(mul);
		
	}
	public static void main(String args[])
	{
		FactorialofNo f=new FactorialofNo();
		f.fact();
	}
}

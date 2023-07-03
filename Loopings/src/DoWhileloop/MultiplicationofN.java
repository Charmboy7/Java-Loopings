package DoWhileloop;

public class MultiplicationofN {
	
	public static void main(String args[])
	{
		int i=1,mul=1,n=6;
		do {
			
			mul=i*n;
			System.out.println(n+"*"+i+"="+mul);
			i++;
		}while(i<=10);
	}

}

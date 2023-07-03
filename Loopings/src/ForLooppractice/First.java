package ForLooppractice;

//write the program to find value of one number raised to the power of another
//use for loop



public class First {

	
	public static void main(String args[])
	{
		
		
		int i,base=2,power=8;
		int val=1;
		for(i=1;i<=power;i++)
		{
			val=val*base;
		}
		System.out.println(val);
	}
}

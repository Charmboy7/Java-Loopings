package StarPrograms;

public class Rough {

	public static void main(String args[])
	{
		//program to print 5 x 5 stars
		
	/*	int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}     */
		
		
		// program to print right triangele 5 rows
		
	/*	int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
		}    */
		
		//program to print the above program reverse
		
	/*	int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}      */
		
		//program to print the incrasing stars
		
	/*	int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");		
			}
			System.out.println();
		}            */
		
	/*	//program to print decreasing stars
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}       */
		
		//program to print increasing space with decreasing triangle
		
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

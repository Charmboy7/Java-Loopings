package Programms;

public class AmstrongNo {

	    public static void main(String args[])
	    {
	    	int n=371,temp,sum=0;
	    	temp=n;
	    	while(n>0)
	    	{
	    		int r=n%10;
	    		sum=sum+(r*r*r);
	    		n=n/10;
	    	}
	    	if(sum==temp)
	    	{
	    		System.out.println("Given number is Amstrong Number!");
	    	}
	    	else
	    	{
	    		System.out.println("Given number is not Amstrong Number!");
	    	}
	    }
}

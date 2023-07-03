package Programms;
import java.util.Scanner;
import java.lang.*;

//today is friday what will be the of the week after 100 days?
public class Day {

	public static void main(String args[])
	{
	     String day="friday";
	     int number=100;
	     int dayno=0;
	     int remainder=number%7;
	     int rem=remainder+dayno;
	     dayno=rem%7;
	     
	//     System.out.println(number);
	     
	     if(day=="sunday")
	     {
	    	
	    	 System.out.println("sunday");
	    	
	     }
	     else if(day=="sunday")
	     {
	   
	    	 System.out.println("monday");
	     }
	     else if(dayno==3)
	     {
	    	 System.out.println("Tuesday");
	     }
	     else if(dayno==4)
	     {
	    	 System.out.println("wednesday");
	     }
	     else if(dayno==5)
	     {
	    	 System.out.println("Thursdayday");
	     }
	     else if(dayno==6)
	     {
	    	 System.out.println("The day after 100 days will be: Friday");
	     }
	     else if(dayno==7)
	     {
	    	 System.out.println("The day after 100 days will be: saturday");
	     } 
	    	 
	    	 
	}
}

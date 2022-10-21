import java.util.Scanner;
public class CountWords {
	public static void main(String arg[])	
	{
	      int i,count=1;
        String name = "Hi Hello Welcome to my World!!";

	    for(i=0;i<name.length();i++)
	    {
	       if(name.charAt(i)==' '&&name.charAt(i+1)!=' ')
               {
                 count++;
               }	
        }    	
	    System.out.print("Word count: "+count);	  
	}
}

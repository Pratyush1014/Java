import java.util.*;

// Compiler version JDK 11.0
public class Dcoder
{
    void toYears (int obj)
    {
      int toYear = obj/(60*24);
      System.out.print(toYear/365+" years and ");
      System.out.println(toYear%365+" days");
    } 
   	public static void main(String args[])
	{   
	    Dcoder obj = new Dcoder();
	    Scanner sc= new Scanner(System.in);
	    int a = sc.nextInt();
	    obj.toYears(a);
	}
}

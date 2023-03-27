package PatternPractice;

import java.util.Scanner;

public class ZohoSet1March24 {
 
	public static void main(String[] args) {
		
	
	Scanner scanner = new Scanner(System.in);
	{System.out.println("Enter the input");}
	String input = scanner.nextLine();
	int length = input.length();
	int mid = length/2;
	System.out.println(mid);
	
  for(int i=0;i<length;i++)
  {
	  for(int j =0;j<length;j++)
	  {
		  if(i==j)
		  {
			  System.out.print(input.charAt(i));
		  }
		  else if(i+j==length-1)
		  {
			  System.out.print(input.charAt(j));
		  }
		  else if(i==mid||j==mid)
		  {
			  System.out.print("  ");
		  }
		  else
		  {
			  System.out.print("   ");
		  }
		  
	  }
	  System.out.println();
  }
	
}
}
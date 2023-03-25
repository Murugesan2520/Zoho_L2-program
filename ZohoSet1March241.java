package PatternPractice;

import java.util.Scanner;

public class ZohoSet1March241 {
  
	static Scanner scanner = new Scanner(System.in);
	
	static {System.out.println("Enter the input");}
	 static int input = scanner.nextInt();
	
	public static void main(String[] args) {
		
		for(int i=1;i<=input;i++)
		{
			for(int j=i;j<=input;j++)
			{
				System.out.print(j+" ");
			}
			for(int k=1;k<i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}

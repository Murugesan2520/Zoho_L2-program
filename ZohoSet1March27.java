package PatternPractice;

import java.util.Scanner;

public class ZohoSet1March27 {

	
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Input");
	int input = scanner.nextInt();
	
	int value=1;
	for(int row=1;row<=input;row++)
	{
		int temp = value;
		for(int col=row;col<=input;col++)
		{
			
			System.out.print(value+" ");
			value=value+col+1;
		}
		int var=5;
		value=value-6+var;
		for(int  k=1;k<row;k++)	
		{
			System.out.print(value+" ");
			var--;
			value=value+var;
		}
		value = temp+row;
		System.out.println();
		
	}
}
}

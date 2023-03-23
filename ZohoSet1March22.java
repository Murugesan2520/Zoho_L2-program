package PatternPractice;

import java.util.Scanner;

public class ZohoSet1March22 {
	
	Scanner input = new Scanner(System.in);
	{System.out.println("Enter the input");}
	int inputs = input.nextInt();
	public static void main(String[] args)
	{
		ZohoSet1March22 zobj = new ZohoSet1March22();
		zobj.Pattern2();
	}
	private void Pattern2() {
		// TODO Auto-generated method stub
		for(int r=1;r<=inputs;r++)
		{
			for(int col=1;col<=inputs-r;col++)
			{
				System.out.print(" "+" ");
			}
			for(int k=r;k>=1;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
	

}

package PatternPractice;

import java.util.Scanner;

public class ZohoSet1March23 {
	Scanner scobj = new Scanner(System.in);
	{System.out.println("Enter the Input");} 
	int input = scobj.nextInt();
	public static void main(String[] args) {
		ZohoSet1March23 zobj = new ZohoSet1March23();
		zobj.pattern();
	}
	private void pattern() {
		// TODO Auto-generated method stub
		int odd=1;
		int even=2;
		for(int r=1;r<=input;r++)
		{
			if(r%2!=0)
			{
				for(int col=1;col<=r;col++)
				{
					System.out.print(odd+" ");
					odd+=2;
					}
				System.out.println();
			}
			else if(r%2==0)
			{
				for(int col=1;col<=r;col++)
				{
					System.out.print(even+" " );
					even+=2;
				}
				System.out.println();
			}
		}
	}


}

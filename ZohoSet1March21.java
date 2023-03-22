package PatternPractice;

import java.util.Scanner;

public class ZohoSet1March21 {
	 
	Scanner scinput = new Scanner(System.in);
	{
		System.out.println("Enter the Number");
	}
	int input1 =scinput.nextInt();
	
public static void main(String[] args)
{
	ZohoSet1March21 tPattern = new ZohoSet1March21();
	//tPattern.pattern1();
	tPattern.pattern2();
	



}
 void pattern1() {
	// TODO Auto-generated method stub
	
	 
	 for(int r=1;r<=input1;r++)
	 {
		 for(int c=1;c<=r;c++)
		 {
			 System.out.print("*"+" ");
		 }
		 System.out.println();
	 }
}


private void pattern2() {
	// TODO Auto-generated method stub
	for(int r=1;r<=input1;r++)
	{
		int value=r;
		for(int col=1;col<=r;col++)
		{
			System.out.print(value+" ");
			value=value+input1-col;
			}
		
		System.out.println();
	}
	}

}

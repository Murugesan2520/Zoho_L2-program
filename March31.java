package PatternPractice;

import java.util.Scanner;

public class March31 {
  Scanner scanner = new Scanner(System.in);
  {System.out.println("Enter input");}
  int input = scanner.nextInt();
  public static void main(String[] args) {
	March31 march = new March31();
	march.pattern();
  }
  
  private void pattern() {
	// TODO Auto-generated method stub
	for(int row=1;row<=input;row++)
	{
		int value =row;
		for(int col=input;col>=row;col--)
		{
			System.out.print(value+" ");
			value=value+col;
		}
		System.out.println();
	}
  }
}


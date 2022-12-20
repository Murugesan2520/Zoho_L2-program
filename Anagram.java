package interview.Preparation;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scobj=new Scanner(System.in);
      System.out.println("Enter the first Anagram word");
      String w1=scobj.nextLine();
      System.out.println("Enter the Second  Anagram word");
      String w2=scobj.nextLine();
	if(w1.length()!=w2.length())
	{
		System.out.println("Please Enter The Same Length word ");
	}
	else
	{
	w1=w1.toLowerCase();
	w2=w2.toLowerCase();
	String w3=w1;
	for(int i=0;i<w1.length();i++)
	{
		for(int j=0;j<w2.length();j++)
		{
			if(w1.charAt(i)==w2.charAt(j))
			{
				//w3=w3.replaceFirst(""+w2.charAt(i), "");
				w3=w3.replaceFirst(Character.toString(w1.charAt(i)), "");
				
			}
		}
		
	}
	
	if(w3.length()==0)
	{
		System.out.println("This word Is Anagram");
	}
	else {
		System.out.println("This Word Is not Anagram");
	}
	}
	}
	

}

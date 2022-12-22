package task.interview;

import java.util.Arrays;
import java.util.Scanner;

public class String_Anagram_inbuilt {
public static void main(String[] args) {
	Scanner scobj=new Scanner(System.in);
	System.out.println("Enter Your First String ");
	String s1=scobj.nextLine();
	System.out.println("Enter Your Second  String ");
	String s2=scobj.nextLine();
	s1=s1.toLowerCase();
	s2=s2.toLowerCase();
	char[] String1=s1.toCharArray();
	char[] String2=s2.toCharArray();
	Arrays.sort(String1);
	Arrays.sort(String2);
	boolean Result=Arrays.equals(String1, String2);
	if(Result==true)
	{
		System.out.println("Given String  is anagram");
	}
	else
	{
		System.out.println("Given String is Not Anagram");
	}
}
}

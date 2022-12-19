package task.interview;

import java.util.Scanner;

public class Day_Tasks {
public static void main(String[] args)
{
	Day_Tasks obj=new Day_Tasks();
	obj.greaterthanleftright();
}

private void greaterthanleftright() {
	// TODO Auto-generated method stub
	Scanner scobj=new Scanner(System.in);
	System.out.println("Enter Array Size");
	int number=scobj.nextInt();
	if(number%2==0)
	{
		System.out.println("You are entered invalid input");
		System.out.println("you must enter odd number in size");
	}
	
	else
	{
		int[] array=new int[number];
	System.out.println("Enter the array element");
	for(int i=0;i<array.length;i++)
	{
		array[i]=scobj.nextInt();
	}
	
	
	for(int variable:array)
	{
		System.out.println(variable);
	}

	int i=0;int temp=0;
	for(i=0;i<array.length;i++)
	{
		for(int j=i+1;j<array.length;j++)
		{
			if(array[i]>array[j])
			{
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		
	}
	int j=2;
	for(i=1;i<array.length;i=i+2)
	{
		temp=array[i];
		array[i]=array[j];
		array[j]=temp;
		j=j+2;
	
	}
	for(int variable:array)
	{
		System.out.print(variable+" ");
	}
}
}
}

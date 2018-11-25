import java.util.Scanner;  /*used for input*/

public class calc
{

	public static void main(String[] args)
	{
	int num1, num2;

	Scanner input = new Scanner (System.in);
	System.out.println("enter num 1: ");
	num1 = input.nextInt();
	System.out.println("enter num 2: ");
 	num2 = input.nextInt();
	
	System.out.println("answer " + (num1 + num2));
	}

}

//This is a test commmen to the file 

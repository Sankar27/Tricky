package interviewQue;

import java.util.Scanner;

public class Reverse_Or_Not {

	public static void main(String[] args) {
		
		int rev = 0;
		int rem = 0;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Numbers :");
		
		int n = sc.nextInt();
		int array[] = new int[n];
		int originalNum = n;
		
		while (n != 0)
		{
			rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}
		System.out.println("Reverse Number :" + rev);
		
		if (originalNum == rev)
		{
			System.out.println("Array Elements are Same from Front to Back");
		}
		else
		{
			System.out.println("Array Elements are Not same from Front to Back");
		}

	}
}

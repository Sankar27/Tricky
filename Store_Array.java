package interviewQue;

import java.util.Scanner;

public class Store_Array {

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Your Elements Vlaue :");
		n = sc.nextInt();
		
		int array[] = new int[n];
		
		if (n <= 0)
		{
			System.out.println("Enter Valid Number");
		}
		else
		{
			System.out.println("Enter Your Element :");
			
			for (int i = 0; i < n; i++){
				array[i] = sc.nextInt();
			}
			System.out.println("Array Element are");
			
			for (int i = 0; i < n; i++){
				System.out.println(array[i]);
			}
		}
		
	}
}


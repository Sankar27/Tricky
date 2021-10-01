package interviewQue;

import java.util.Scanner;

public class Reverse_Array {

	public static void main(String[] args) {
		
		int  n, temp, res, i, j=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Elements :");
		n = s.nextInt();
		
		int array [] = new int[n]; 
		
		if (n <= 0){
			System.out.println("Enter Valid Number");
		}
		else
		{
			System.out.println("Enter "+ n +" Element");
			
			for(i = 0; i < n; i++){
				array[i] = s.nextInt();
			}
			for(i = 0; i < n; i++,n--)
			{
				temp = array[i];
				array[i] = array[n-1];
				array[n-1]=temp;
			}
			
			System.out.println("Reverse Array :");
			
			for(i = 0; i < array.length; i++)
			{
				System.out.println(array[i]);
			}
		}

	}

}

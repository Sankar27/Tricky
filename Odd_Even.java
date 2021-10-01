package interviewQue;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		
		int i,x,a[] = new int[10];
		int countn=0, countp=0, countz=0, odd=0, even=0;
		
		int arr[] = new int[10];
		
		Scanner input = new Scanner (System.in);
		
		for(i = 0; i < 10; i++){
			System.out.println("Enter The Elements Value :");
			a[i] = input.nextInt(); 
		}
		
		for (i = 0; i < 10; i++)
		{
			if(a[i] < 0)
			{
				countn++;
				
			}
			else
			{
				countp++;
				
			}
			x = a[i]%2;
			if(x==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("Negative Numbers :" + countn);
		System.out.println("Positive Numbers :" + countp);
		System.out.println("odd :" + odd);
		System.out.println("even :"+ even);

}
}


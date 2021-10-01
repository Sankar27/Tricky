package interviewQue;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Amount :");
		System.out.println();
		int a = sc.nextInt();
		
		int dis = a/10;
		
		if((a>0)&&(a<999)){
			System.out.println("You Get 0% Discount");
		}else if(1000 <= a) {
			System.out.println("You Get 10% Discount, And Your Discount Amount Is :" + dis );
		}else{
			System.out.println("Enter Valid Amount");
		}

	}

}

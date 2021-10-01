package interviewQue;

import java.util.Scanner;

public class Attendence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Class held :");
		int held = sc.nextInt();
		System.out.print("Enter class Attended :");
		int attend = sc.nextInt();
		
		int per = held * attend / 100;
		if (held < attend){
			System.out.println("Enter Valid Number");
		}
		else if (per < 75){
			System.out.println("Not Allow Examination");
		}else{
			System.out.println(" Allow Examination");
		}
	}

}

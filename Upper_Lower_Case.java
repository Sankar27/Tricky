package interviewQue;

import java.util.Scanner;

public class Upper_Lower_Case {

	public static void main(String[] args) {
		
		char c;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a Character :");
		
		c = sc.next().charAt(0);
				
		if(c >='A' && c <='Z'){
			System.out.println("Charecter is UpperCase");
		}else if(c >='a' && c <='z'){
			System.out.println("Charecter is LowerCase");
		}else{
			System.out.println("Is Not Alphabet");
		}
}

}

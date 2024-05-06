package preparation_questions;

import java.util.Scanner;

public class palindrome13 {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    int a=scan.nextInt();
		int org=a;
		int temp=0;
		while(a>0) {
			int rem=a%10;
			temp=(temp*10)+rem;
			a=a/10;
		}
		if(temp==org) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}

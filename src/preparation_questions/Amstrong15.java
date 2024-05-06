package preparation_questions;

import java.util.Scanner;

public class Amstrong15 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int org=a;
		int temp=0;
		while(a>0) {
			int rem=a%10;
			temp=temp+rem*rem*rem;
			a=a/10;
		}
		if(temp==org) {
			System.out.println("Amstrong");
		} else {
			System.out.println("Not Amstrong");
		}
	}

}

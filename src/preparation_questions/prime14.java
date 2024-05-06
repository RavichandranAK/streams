package preparation_questions;

import java.util.Scanner;

public class prime14 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	boolean flag=true;
	for( int i=2;i<a;i++) {
		if(a%i==0) {
			flag=false;
		}
	}
	if(flag==true) {
		System.out.println("Prime");
	} else {
        System.out.println("Not Prime");
	}
}
}

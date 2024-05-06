package preparation;

import java.util.Scanner;

public class Sundar2 {
	
	public static void printnum(int a,int b) {
		if(b<=a) {
			System.out.println(b);
			b++;
			printnum(a,b);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		Sundar2.printnum(a,1);
			
		}
	}



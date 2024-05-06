package preparation_questions;
import java.util.Arrays;
public class Anagram20 {
	public static void main(String[] args) {
		
	
	String a="hema";
	char a1[]=a.toCharArray();
	String b="mahe";
	char b1[]=b.toCharArray();
	
	Arrays.sort(a1);
	Arrays.sort(b1);
	if(Arrays.equals(a1, b1)) {
		System.out.println("Anagram");
	} else {
		System.out.println("Not Anagram");
	}
	
	}
}

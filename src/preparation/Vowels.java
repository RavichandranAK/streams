package preparation;

import java.util.Map;
import java.util.stream.Collectors;

public class Vowels {

	public static void main(String[] args) {
		String str = "RavichandranDhevayani";
		Map<Character,Long> temp=str.chars().mapToObj(x -> (char) x).filter(x -> String.valueOf(x).matches("[aeiou]"))
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		Long count=str.chars().mapToObj(x->(char)x).filter(x->String.valueOf(x).matches("[aeiou]")).count();
		
		
		System.out.println(temp);
		System.out.println(count);
	}

}

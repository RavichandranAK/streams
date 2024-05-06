package preparation_questions;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacterOccurrence1 {

    public static void main(String[] args) {
       String str="onesofts";
		/*
		 * char[] arr=str.toCharArray();
		 *  for(int i=0;i<arr.length;i++) {
		 *   int count =1;
		 * for(int j=i+1;j<arr.length;j++) {
		 *  if(arr[i]==arr[j]) {
		 *   count++; 
		 *   arr[j]='$';
		 *    }
		 * } if(count>=1 && arr[i]!='$') { 
		 * System.out.println(arr[i]+"-"+count); 
		 * }
		 *  }
		 */
       //to print occurance of all characters
      Map<Character, Long> result = str.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(x->x,Collectors.counting()));
      System.out.println(result);
      
      //toUppercase
      List<Character> nn=str.chars().mapToObj(x->(char)x).map(Character :: toUpperCase).collect(Collectors.toList());
      System.out.println(nn);
      
     
    }
}
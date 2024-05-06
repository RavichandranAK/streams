package preparation_questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question9 {
	public static void main(String[] args) {
//		String[] str= {"a","b","c","d","e","f","g","h"};
//		int[] arr= {0,1,1,0,1,2,2,0};
//		String temp="";
//		int inttemp;
//		 for(int i=0;i<arr.length;i++) {
//			 for(int j=i+1;j<arr.length;j++) {
//				 if(arr[i]>arr[j]) {
//					 inttemp=arr[i];
//					 arr[i]=arr[j];
//					 arr[j]=inttemp;
//					 
//					 temp=str[i];
//					 str[i]=str[j];
//					 str[j]=temp;	 
//				 }
//			 }	 
//		 }
//		 System.out.println(Arrays.toString(str));
		List<Character> charList=Arrays.asList('a','b','c','d','e','f','g','h');
		List<Integer> intList=Arrays.asList(0,1,1,0,1,2,2,0);

		
		List<Character> res=charList.stream().sorted(Comparator.comparing(x->intList.get(charList.indexOf(x)))).toList();
		System.out.println(res);
//		List<Character> out=charList.stream().sorted(Comparator.comparing(charList :: indexOf).thenComparing(intList :: get)).collect(Collectors.toList());
//		System.out.println(out);
		
		
		
	}

}

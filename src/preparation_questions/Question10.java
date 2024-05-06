package preparation_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question10 {
	public static void main(String[] args) {
//		int[] a= {1,2,3,4,5,6,7,8};
//		  for(int i=0;i<a.length;i++){
//			  for(int j=i+1;j<a.length;j++) {
//				  if(a[i]+a[j]==5) {
//					  System.out.println(a[i]+" "+a[j]);
//					  System.out.println(a[j]+" "+a[i]);
//					  
//				  }
//				  
//			  }

//	  }

		List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
		arr.stream().flatMap(x -> arr.stream().filter(y -> x + y == 5).map(y -> new int[] { x, y }))
				.forEach(z -> System.out.println(z[0] + " " + z[1]));

		List<List<Integer>> temp = arr.stream()
				.flatMap(x -> arr.stream().filter(y -> x + y == 5).map(y -> Arrays.asList(x, y)))
				.collect(Collectors.toList());

		System.out.println(temp);

		System.out.println(arr);

	}
}
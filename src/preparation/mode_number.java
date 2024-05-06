package preparation;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class mode_number {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,3,2,3,7,3,4,2,4,4,2};
        int max=0;
        for(int i=0;i<arr.length;i++) {
        	int count=1;
        	for(int j=i+1;j<arr.length;j++) {
        		if(arr[i]==arr[j]) {
        			count++;
        		}
        		
        	}
        	if(count>max) {
        		max=count;
        	}
        	
        }
       for(int i=0;i<arr.length;i++) {
    	   int count =1;
    	   for(int j=i+1;j<arr.length;j++) {
    		   if(arr[i]==arr[j]) {
    			   count++;
    		   }   
    	   }
    	   if(count==max) {
    		   System.out.println(arr[i]);
    	   }
    	   
       }
       //USING STREAMS
       
       List<Integer> arr1=Arrays.asList(1,2,3,4,3,2,3,7,3,4,2,4,4,2);
      Map<Integer,Long> res= arr1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
      System.out.println(res);
     Long kk= res.values().stream().reduce((x,y)->Math.max(x, y)).get();// to find max count of values
     // Long kk= res.values().stream().max(Comparator.comparing(Long::valueOf)).get(); // another way to find max
      //System.out.println(Collections.max(res.values())); // another way to find max
     res.keySet().stream().filter(x->res.get(x)==kk).forEach(x->System.out.println(x));
    }
}

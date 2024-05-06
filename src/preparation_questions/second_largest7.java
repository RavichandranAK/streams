package preparation_questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class second_largest7 {
	public static void main(String[] args) {
	
		// USING STREAMS
		List<Integer> list=Arrays.asList(43,65,54,23,67);
		
		//SECOND MAX
		Integer secMax=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow(()-> new NoSuchElementException("no Second maximum element"));
		System.out.println("The Second Max is = "+secMax);
		
		//SECOND MIN
		Integer secMin=list.stream().sorted().skip(1).findFirst().orElseThrow(()-> new NoSuchElementException());
		System.out.println("The Second Min is = "+secMin);
		
		
		//MAX
		Integer max=list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("The Max Value is = "+max);
		//ANOTHER WAY TO FIND MAX 
		System.out.println("The Max Value is = "+Collections.max(list));
		
		//MIN
	    Integer min=list.stream().min(Integer :: compare).get();
	    System.out.println("The Min Value is = "+min);	    

	    
	    
	    //ANOTHER WAY TO FIND MIN
	    System.out.println("The Min Value is = "+Collections.min(list));
//	    int sec=list.stream().mapToInt(Integer::intValue).min().getAsInt();
//		System.out.println(sec+"hvgi");
	    
	    Long a=list.stream().count();
	    System.out.println(a);
	    
	    Integer maax=list.stream().sorted(Comparator.<Integer>naturalOrder().reversed()).findFirst().get();
	    System.out.println(maax);
	    
		
		
	}

}

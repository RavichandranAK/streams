package preparation_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Addition_Of_DiagonalValue8 {
	public static void main(String[] args) {
		List<Integer> a=Arrays.asList(1,2,3,4);
		List<Integer> b=Arrays.asList(5,6,7,8);
		List<Integer> c=Arrays.asList(1,2,3,4);
		List<Integer> d=Arrays.asList(5,6,7,8);
		
		List<List<Integer>> arr=Arrays.asList(a,b,c,d);
		        int PrimaryDiagonal=0;
		        int SecondaryDiagonal=0;
		    for(int i=0;i<arr.size();i++) {
		    	//to print addition of primary diagonal values
		    	PrimaryDiagonal=PrimaryDiagonal+arr.get(i).get(i);
		    	//to print addition of Secondary diagonal values
		    	SecondaryDiagonal=SecondaryDiagonal+arr.get(i).get((arr.get(i).size())-i-1);
		    }
	   System.out.println(PrimaryDiagonal);
	   System.out.println(SecondaryDiagonal);
	   //USING STREAMS
	  Integer val = IntStream.range(0, arr.size()).map(x->arr.get(x).get(x)).sum();
	  System.out.println(val);
	  
	List<Integer> var=IntStream.range(0, arr.size()).map(x->arr.get(x).get(x)).boxed().toList();
	System.out.println(var);
	System.out.println(var.stream().reduce(1,(x,y)->x*y));
	
	//FACTORIAL
	int fact=IntStream.rangeClosed(1, 5).reduce(1,(x,y)->x*y);
	System.out.println(fact);
	
	
	
	 
	}

}

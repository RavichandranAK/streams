package preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sundar {
	public static void main(String[] args) {
		String a="Bangalore is a beautiful city. I love Bangalore";
		String[] b=a.split(" ");
		List<String> temp= new ArrayList<>();
		
		for(String x:b) {
			if(x.matches("Bangalore")) {
				x="Chennai";
				temp.add(x);
			}
			else {
				temp.add(x);
			}
		}		
//		temp.stream().forEach(x->System.out.print(x+" "));
	
	
	List<Integer> li=Arrays.asList(1,2,3,4);
	List<Integer> sec=Arrays.asList(1,5,6,2);
//	li.stream().flatMap(x->sec.stream().filter(y->x==y).map(y->new int[] {x,y})).forEach(z->System.out.println(z[0]+""+z[1]));

	
	Stream.concat(li.stream(),sec.stream()).collect(Collectors.groupingBy(x->x,Collectors.counting())).entrySet().stream().filter(x->x.getValue()==1).forEach(x->System.out.println(x.getKey()));
	
	 String res1=li.stream().filter(sec::contains).map(Object::toString).collect(Collectors.joining());
	
	System.out.println(res1);

	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}

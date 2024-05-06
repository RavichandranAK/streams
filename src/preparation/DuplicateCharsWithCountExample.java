package preparation;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

	public class DuplicateCharsWithCountExample {
	    public static void main(String[] args) {
	        String str= "onesoft";

	         List<Character> tochar=str.chars().mapToObj(x->(char)x).toList();
             Map<Character,Long> res=tochar.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	       System.out.println(tochar);
	       System.out.println(res);
	       
	       //DUBLICATE WITH COUNT 
	       Map<Character,Long> dub=res.keySet().stream().filter(x->res.get(x)>1).collect(Collectors.toMap(x->x,y->res.get(y)));
	       dub.forEach((x,y)->System.out.println("Duplicates = "+x+"-"+y));
	       
	       //NON-DUB WITH COUNT
	       Map<Character,Long> non_dub=res.keySet().stream().filter(x->res.get(x)==1).collect(Collectors.toMap(x->x, y->res.get(y)));
	       non_dub.forEach((x,y)->System.out.println("Non Duplicates = "+x+"-"+y));
	       
	       //DUBLICATE characters only 
	       res.keySet().stream().filter(x->res.get(x)>1).forEach(x->System.out.println("Duplicate Character = "+x));
	       
	       //NON-DUBLICATE characters only
	       res.keySet().stream().filter(x->res.get(x)==1).forEach(x->System.out.println("Non-Duplicate Character = "+x));
	    }
	}



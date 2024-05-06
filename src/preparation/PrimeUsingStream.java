package preparation;

import java.util.stream.IntStream;

public class PrimeUsingStream {
	public static void main(String[] args) {
		int num=100;
		IntStream.range(1,num).filter(PrimeUsingStream::isPrime).boxed().forEach(x->System.out.println(x));
	} 
    public static boolean isPrime(int a) {
    	int count=0;
    	if(a==1) {
    		return true;
    	} else {
    	for(int i=2;i<a;i++) {
    		if(a%i==0) {
    		count++;
    		} 
    	}
    	if(count==0) {
    		return true;
    	}
    	return false;
    	}
    }

}

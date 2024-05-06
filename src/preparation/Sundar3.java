package preparation;

public class Sundar3 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int temp=0;
		int count=1;
	for(int i=a.length-1;i>=0;i--) {
		
		temp=temp+count*a[i];
	     count=count*10;
		}
	
System.out.println(temp);
}
}

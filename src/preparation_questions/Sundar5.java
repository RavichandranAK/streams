package preparation_questions;

public class Sundar5 {
	public static void main(String[] args) {
		String[] a = { "t", "e", "e", "s", "s", "s", "h" };
		String res="";
		
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				count++;
				a[j]="$";
			}
		}
		if (count > 1 && a[i] != "$") {
				res=res+a[i]+count;
			}
			else if(count==1 && a[i]!="$") {
				res=res+a[i];
			}
		}
		System.out.println(res);
	}

}

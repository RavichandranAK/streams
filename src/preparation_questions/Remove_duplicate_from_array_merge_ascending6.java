package preparation_questions;

import java.util.Arrays;

public class Remove_duplicate_from_array_merge_ascending6 {
	public static void main(String[] args) {
		int[] a= {1,2,2,4};
		int[] b= {6,2,3,5};
		int[] c=new int[5];
		int k=0;
		 for(int i=0;i<a.length;i++) {
			 int count =0;
			 for(int j=0;j<b.length;j++) {
				 if(a[i]==b[j]) {
					 int m1=a[i];
					 int m2=b[j];
					 count++;
					 for(int k1=0;k1<a.length;k1++) {
						 if(a[k1]==m1) {
							 a[k1]='$';
						 }
						 
						 for(int k2=0;k2<b.length;k2++) {
							 if(b[k2]==m2) {
								 b[k2]='$';
							 }
						 }
					 }
					 //b[j]='$';
					 //a[i]='$';
				 }
			 }
			 if(count==0 && a[i]!='$') {
				 c[k]=a[i];
				 k++;
			 }
		 }
		 for(int i=0;i<b.length;i++) {
			 if(b[i]!='$') {
				 c[k]=b[i];
				 k++;
			 }
		 }
		 for(int i=0;i<c.length;i++) {
			 for(int j=i+1;j<c.length;j++) {
			       if(c[i]>c[j]) {
					 int temp=c[i];
					     c[i]=c[j];
					     c[j]=temp;					 
				 }
			 }
		 }
		 System.out.println(Arrays.toString(c));
	}

}

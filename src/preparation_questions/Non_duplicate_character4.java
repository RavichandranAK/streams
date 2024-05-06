package preparation_questions;

public class Non_duplicate_character4 {
	public static void main(String[] args) {
		String str="onesoft";
		char[] arr=str.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			  int count=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]='$';
				}
			}
			if(count==0 && arr[i]!='$') {
				System.out.println(arr[i]);
			}
		}
	}

}

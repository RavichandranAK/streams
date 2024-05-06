package preparation;

public class selftask1 {
	public static void main(String[] args) {
		int[] arr= {10,15,43,65,43,32,76,55};
		
		for(int i=1;i<arr.length-1;i++) {
			
				if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
					System.out.println(arr[i]);
				
			}
		}
	}

}

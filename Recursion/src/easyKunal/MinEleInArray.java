package easyKunal;

public class MinEleInArray {

	public static void main(String[] args) {
		int[] arr = {1, 4, 3, -5, -4, 8, 6};
		int n = arr.length;
		int min = arr[0];
		int max = arr[0];
		System.out.println(findMin(arr,min,0));
		System.out.println(findMax(arr,max,0));
		System.out.println(minValue(arr,n));
	}

	private static int findMin(int[] arr, int min, int i) {
		
		//base condition
		if(i == arr.length) return min ;
		
		if(arr[i]<min) min = arr[i];
		
		return findMin(arr, min, i+1);
	}
	
	private static int findMax(int[] arr, int max, int i) {
			
			//base condition
			if(i == arr.length) return max ;
			
			if(arr[i]>max) max = arr[i];
			
			return findMax(arr, max, i+1);
	}
	//-----------------------------------------------
	// one more way
	static int minValue(int[] arr, int  n) {
		//base condition
		
		//When every element is traversed 
		if(n==1) return arr[0];
		
		return Math.min(arr[n-1],minValue(arr,n-1));
	}
}

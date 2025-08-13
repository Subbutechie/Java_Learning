package medium;

public class MostWater {
	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}
	


	public static int maxArea(int[] height) {
	
	   
	    int n = height.length;
	    
	    int left = 0;
	    int right = n-1;
	    int area = 0;
	    int maxArea = 0;
	    while(left<right) {
	    	
	    	area = Math.min(height[left], height[right]) * (right-left);
	    	maxArea = Math.max(area, maxArea);
	    	
	    	if(height[left]<height[right]) {
	    		left++;
	    	}else {
	    		right--;
	    	}
	    	
	    }
	    return maxArea;
	}    
}
package medium;

public class RemoveDuplicates2 {
	
	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,3};
		
		int  k =removeDuplicates(nums);
		
		for(int i =0; i<k;i++) {
			System.out.print(nums[i]+" ");
		}
	}


public static int removeDuplicates(int[] nums) {

    int i =1;
    int d = 1;
    int count =1;
   while(i<nums.length) {
	   if(nums[i] == nums[i-1]) {
		   count++;
	   }
	   else {
		   count =1;
	   }
	   
	   if(count <= 2) {
		   nums[d] = nums[i];
		   d++;
	   }
	   
	   i++;
		   
   }
    return d;
}

}
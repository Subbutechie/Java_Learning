package easy;

public class LeetCode_14 {

	public static void main(String[] args) {
		
		String[] strs = {"aac","acab","aa","abba","aa"};
		
		LeetCode_14 obj = new LeetCode_14();
		System.out.println(obj.longestCommonPrefix(strs));
	}
	
	 public String longestCommonPrefix(String[] strs) {
	        
		 //Find the smallest string in the array
		 int index = -1;
		 int minLen = Integer.MAX_VALUE;
		 for(int i =0; i<strs.length; i++) {
			 int len = strs[i].length();
			 if(len < minLen) {
				 minLen = len;
				 index = i;
			 }
		 }
		 int resIndex = 0; 
		 String check = strs[index];
		 int count = 0;
		 for(int i =0; i<strs.length; i++) {
			 if(check == strs[i]) {
				 continue;
			 }
			 for(int j = check.length(); j>0; j--) {
				 if(strs[i].contains(check.substring(0,j))) {
					 if(strs[i].startsWith(check.substring(0, j))) {
						 count++;
						 resIndex = j;
						 break;
					 }
					 
				 }
			 }
		 }
		 System.out.println(check.substring(0, resIndex));
		 boolean flag = false;
            for(int i = 0; i<strs.length; i++){
                if(!strs[i].startsWith(check.substring(0, resIndex))){
                    return "empty";
                }else{
                    flag = true;
                }

            }
		 

         if(flag){
             return check.substring(0, resIndex);
         }
		 return "empty";
	        
	 }

}

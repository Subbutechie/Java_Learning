package medium;

public class RepetitiveAdd {

	public static void main(String[] args) {

		System.out.println(singleDigit(307));
	}
	public static int singleDigit(int n) {
	// code here
	int res = n;
	while(res>=1){
		if (countDigits(res) == 1) {
			return res;
		} else {
			res = sum(res);
		}
	}

	return-1;

}

static int sum(int n){
    int sum = 0;
    while(n>0){
        sum += n%10;
        n = n/10;
    }
    return sum;
}

static int countDigits(int n){
    int count = (int)Math.log10(n)+1;
    return count;
}

///////////////////////-----------------------------------------//////////////////
//simpler
private static int singleDigit1(int n) {
	int sum = 0;
	while(n>0 || sum >9) {
	
		//start fresh for every new sum
		if(n == 0) {
			n = sum;
			sum = 0;
		}
		
		sum += n%10;
        n = n/10;
	}
	return sum;
}
}

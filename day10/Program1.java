// Perfect number

class Program1 {
	public static boolean isPerfect(int num) {
		if(num<0)
			return false;

		int fSum = 0;

		for(int i=1; i<=num/2; i++){
			if(num%i==0)
				fSum+=i;
		}

		return fSum == num;
	    
	}
    public static void main(String[] args) {
     	System.out.println(isPerfect(6));   
    }
}
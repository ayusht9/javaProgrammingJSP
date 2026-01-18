// Perfect number and Perfect range

class PerfectNumber {
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

	public static void pefectRange(int low, int high) {
		for(int i=low; i<=high; i++)
			if(isPerfect(i))
				System.out.print(i+" ");
		System.out.println();
	}

    public static void main(String[] args) {
     	System.out.println(isPerfect(6)); 
     	pefectRange(1,100);  
    }
}
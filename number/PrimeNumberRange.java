// Prime number range

class PrimeNumberRange {

	public static void primeRange(int low, int high) {
		for(int i=low; i<=high; i++)
			if(PrimeNumber.isPrime(i))
				System.out.print(i+" ");
		System.out.println();
	}


    public static void main(String[] args) {
    	primeRange(1,10);
    	primeRange(1,100);
    	primeRange(100,200);

    }
}
// count primes in range

class CountPrimeNumber {

	public static boolean isPrime(int num){
		int factor = 0;
		for(int i=1;i<=num;i++){
			if(num%i==0)
				factor++;
		}
		return factor==2;
	}

	public static int countPrime(int low, int high) {
	    int count=0;
        for(int i=low; i<=high; i++)
        	if(isPrime(i)){
        		count++;
        	}
        return count;
	}

    public static void main(String[] args) {
        System.out.println(countPrime(1,100));
    }
}
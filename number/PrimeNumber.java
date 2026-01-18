class PrimeNumber {
	public static boolean isPrime(int num){
		if(num<2)
			return false;

		for(int i=2;i<=num/2;i++)
			if(num%i==0)
				return false;

		return true;
	}

    public static void main(String[] args) {
		System.out.println(isPrime(10));
		System.out.println(isPrime(3));
		System.out.println(isPrime(9));
		System.out.println(isPrime(1));
		System.out.println(isPrime(0));
		System.out.println(isPrime(-5));

    }
}
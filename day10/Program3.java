// Prime number range

class Program3 {

	public static boolean isPrime(int num){
		int factor = 0;
		for(int i=1;i<=num;i++){
			if(num%i==0)
				factor++;
		}
		return factor==2;
	}

	public static void primeRange(int low, int high) {
		for(int i=low; i<=high; i++)
			if(isPrime(i))
				System.out.print(i+" ");
		System.out.println();
	}


    public static void main(String[] args) {
    	primeRange(1,10);
    	primeRange(1,100);
    	primeRange(100,200);

    }
}
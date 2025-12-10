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

	public static int countPrime(int num) {
	    int count=0;
        for(int i=1; i<=num; i++)
        	if(isPrime(i)){
        		count++;
        	}
        return count;
	}


    public static void main(String[] args) {
    	int count=0;
        for(int i=1; i<=100; i++)
        	if(isPrime(i))
        		System.out.print(i+" ");

        System.out.println(countPrime(100));
    }
}
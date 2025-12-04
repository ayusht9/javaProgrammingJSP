// prime number

class Program3 {
	public static boolean isPrime(int num){
		int factor = 0;
		for(int i=1;i<=num;i++){
			if(num%i==0)
				factor++;
		}
		return factor==2;
	}
    public static void main(String[] args) {
    	System.out.println(isPrime(5));
    	System.out.println(isPrime(7));
    	System.out.println(isPrime(2));
    	System.out.println(isPrime(9));
    	System.out.println(isPrime(1));
    }
}
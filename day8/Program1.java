// prime number and composite number

class Program1 {
	public static String isPrime(int num){
		if(num<0){
			return "Negative Number";
		}
		int factor = 0;
		for(int i=1;i<=num;i++){
			if(num%i==0)
				factor++;
		}
		if(factor==2)
			return "Prime";
		else
			return "Composite";
	}
    public static void main(String[] args) {
    	System.out.println(isPrime(5));
    	System.out.println(isPrime(-7));
    	System.out.println(isPrime(2));
    	System.out.println(isPrime(9));
    	System.out.println(isPrime(1));
    }
}
// Factorial Range

class Program2 {
	public static void factorialRange(int low, int high) {
    	for(int i=low;i<=high;i++){
    		long fact = 1;
    		for(int j=1;j<=i;j++)
    			fact=fact*j;
    		System.out.print(fact+" ");
    	}
    	System.out.println();
	}
	// method overloading
	public static void factorialRange(int high) {
    	for(int i=1;i<=high;i++){
    		long fact = 1;
    		for(int j=1;j<=i;j++)
    			fact=fact*j;
    		System.out.print(fact+" ");
    	}
    	System.out.println();
	}
    public static void main(String[] args) {
    	factorialRange(1,5);
    	factorialRange(5,10);
    	factorialRange(2,6);
    	factorialRange(6);
    }
}
// Factorial Range

class FactorialRange {
	public static void factorialRange(int low, int high) {
    	for(int i=low;i<=high;i++){
			System.out.print(Factorial.factorial(i)+" ");
    	}
    	System.out.println();
	}
	
	// method overloading
	public static void factorialRange2(int high) {
    	for(int i=1;i<=high;i++){
			System.out.print(Factorial.factorial(i)+" ");
    	}
    	System.out.println();
	}
    public static void main(String[] args) {
    	factorialRange(1,5);
    	factorialRange(5,10);
    	factorialRange(2,6);
    	factorialRange2(6);
    }
}
class StrongNumber {
	public static long factorial(int num) {
		long fact=1;
		for(int i=1;i<=num;i++)
			fact*=i;
		return fact;   
	}
	public static boolean isStrong(int num) {
	    int temp = num;
	    int sum=0;
	    while(temp>0){
	    	sum+= factorial(temp%10);
	    	temp/=10;
	    }

	    return sum==num;
	}

	public static void strongRange(int low, int high) {
		for(int i=low; i<=high; i++)
			if(isStrong(i))
				System.out.print(i+" ");
	}

    public static void main(String[] args) {
        System.out.println(isStrong(145));
        System.out.println(isStrong(153));
		strongRange(100,200);
    }
}
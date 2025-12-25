class Program2 {
	public static int sum10(int num) {
		if(num<=1)
			return 1;
		else
			return num+sum10(num-1);
	}

	public static long fact(int num) {
		if(num<=1)
			return 1;
		else
			return num*fact(num-1);
	}


    public static void main(String[] args) {
        int sum = sum10(10);
        System.out.println(sum);

        long fact = fact(5);
        System.out.println(fact);
    }
}
class Program1 {
	public static int countDigit(int num){
		int count=0;
		while(num>0){			
			count++;
			num/=10;
		}
		return count;
	}

	public static boolean isArmstrong(int num) {
	    int sum = 0;
	    int power = countDigit(num);
	    int temp = num;

	    while(temp>0){
	    	int digit = temp%10;
	    	sum+= (int) Math.pow(digit, power);
	    	temp/=10;
	    }
	    return sum == num;
	}
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(143));
    }
}
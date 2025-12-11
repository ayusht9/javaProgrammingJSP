class Program3 {
	public static boolean isArmstrong(int num) {
	    int sum = 0;
	    int temp = num;
		int power=0;
		while(num>0){			
			power++;
			num/=10;
		}
		num = temp;
	    while(temp>0){
	    	int digit = temp%10;
	    	sum+= (int) Math.pow(digit, power);
	    	temp/=10;
	    }
	    return sum == num;
	}

	public static void armstrongRange(int high) {
		for(int i=0; i<=high; i++){
			if(isArmstrong(i))
				System.out.print(i+" ");
		}
	    
	}

    public static void main(String[] args) {
        armstrongRange(1000);
    }
}
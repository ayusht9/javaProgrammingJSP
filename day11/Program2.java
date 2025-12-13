class Program2 {
	public static boolean isHappy(int num){
		if(num<1){
			return false;
		}
		int sum = 0;
		int temp = num;
		while(num!=4){
			sum=0;
			while(num>0){				
				int digit = num%10;
				sum+= (digit*digit);
				num/=10;
			}
			num=sum;
			if(num==1){
				return true;
			}
		}
		return false;
	}

	public static void happyRange(int low, int high) {
		for(int i=Math.abs(low); i<=Math.abs(high); i++){
			if(isHappy(i))
				System.out.println(i);
		}
	}

    public static void main(String[] args) {
        System.out.println(isHappy(12));
        System.out.println(isHappy(10));
        System.out.println(isHappy(1));
        System.out.println(isHappy(0));

        happyRange(10,20);
    }
}
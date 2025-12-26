class Program3 {
	public static boolean Strong(int num){
		int sum=0;
		int temp = num;
		while(temp>0){
			int fact = 1;
			int rem = temp%10;
			for(int i=1; i<=rem; i++)
				fact=fact*i;
			sum+=fact;
			temp/=10;
		}
		return sum==num;
	}

	public static int lcm(int a, int b){
		int lcm = a>b?a:b;
		while(true){
			if(lcm%a==0 && lcm%b==0)
				return lcm;
			else
				lcm++;
		}
	}
    public static void main(String[] args) {
        System.out.println(Strong(145));
        System.out.println(Strong(153));
        System.out.println(lcm(3,4));
    }
}
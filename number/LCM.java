class LCM {
	public static int findLCM(int num1, int num2) {
		int lcm = num1>num2?num1:num2;
		while(true){
			if(lcm%num1==0&&lcm%num2==0)
				break;
			lcm++;
		}
		return lcm;
	}

    public static void main(String[] args) {
		int num1 = 3;
		int num2 = 4;
    	System.out.println(findLCM(num1,num2));
    }
}
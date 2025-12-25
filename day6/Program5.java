// neo number
class Program5 {
	public static int sumDigit(int num){
		int sum = 0;
		while(num>0){
			sum+= num%10;
			num/=10;
		}
		return sum;
	}
	public static boolean isNeoNumber(int num){
		return sumDigit(num)==num;
	}

	public static void neoRange(int high){
		for(int i=1; i<=high; i++){
			if(isNeoNumber(i))
				System.out.print(i+" ");
		}
	}
    public static void main(String[] args) {
    	neoRange(100);
    }
}
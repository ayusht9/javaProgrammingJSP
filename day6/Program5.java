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
    public static void main(String[] args) {
        System.out.println(isNeoNumber(9));
        System.out.println(isNeoNumber(1));
        System.out.println(isNeoNumber(0));
    }
}
class Program1 {
	public static int lastDigit(int num) {
        return num%10;
	}
	public static int removeLastDigit(int num) {
        return num/10;
	}

    public static int reverseNumber(int num){
        int reverse = 0;
        while(num>0){
            reverse= reverse*10 + lastDigit(num);
            num = removeLastDigit(num);
        }
        return reverse;
    }

	public static void main(String[] args) {
        int number = 1234;
        System.out.println(reverseNumber(number));

    }
}
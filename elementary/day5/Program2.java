class Program2 {
	public static int lastDigit(int num) {
        return num%10;
	}
	public static int removeLastDigit(int num) {
        return num/10;
	}

    public static int sumDigit(int num){
        int sum = 0;
        while(num>0){
            sum+= lastDigit(num);
            num = removeLastDigit(num);
        }
        return sum;
    }
    public static int productDigit(int num){
        int sum = 1;
        while(num>0){
            sum*= lastDigit(num);
            num = removeLastDigit(num);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigit(1));
        System.out.println(sumDigit(12));
        System.out.println(sumDigit(123));
        System.out.println(sumDigit(1234));
        System.out.println(sumDigit(12345));
        System.out.println(productDigit(12345));
        // ways of calling methods/static methods
    }
}
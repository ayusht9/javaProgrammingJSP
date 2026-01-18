// xylem phloem

class XylemPhloem {
	public static int lastDigit(int num) {
        return num%10;
	}
	public static int firstDigit(int num) {
		while(num>10){
			num/=10;
		}
		return num;
	}
	public static int sumDigit(int num){
		int sum = 0;
		while(num>0){
			sum+= num%10;
			num/=10;
		}
		return sum;
	}
	public static String xylemPhloem(int num){
		int extreme=firstDigit(num)+lastDigit(num);
		int center=sumDigit(num)-extreme;

		return extreme==center?"xylem":"phloem";
	}
    public static void main(String[] args) {
        System.out.println(xylemPhloem(1234));
        System.out.println(xylemPhloem(1212));
        System.out.println(xylemPhloem(1205));
    }
}
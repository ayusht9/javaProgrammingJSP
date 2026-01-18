package day5;
class NumberStartsWith {
	public static boolean startsWithEven(int num) {
		while(num>10){
			num/=10;
		}
		return num%2==0;
	}

    public static void main(String[] args) {
        System.out.println(startsWithEven(1234));
        System.out.println(startsWithEven(2234));
        System.out.println(startsWithEven(3234));
        System.out.println(startsWithEven(2));
    }
}
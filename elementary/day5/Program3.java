import java.lang.Math;

class Program3 {
	public static int lastDigit(int num) {
        return num%10;
	}
	public static int removeLastDigit(int num) {
        return num/10;
	}

    public static int binaryDecimal1(int num){
        int sum = 0;
        int i = 1;
        while(num>0){
            sum+= lastDigit(num)*i;
            num = removeLastDigit(num);
            i*=2;
        }
        return sum;
    }

    public static int binaryDecimal2(int num){
        int sum = 0;
        int i = 0;
        while(num>0){
            sum+= lastDigit(num)*Math.pow(2,i);
            num = removeLastDigit(num);
            i++;
        }
        return sum;
    }

	public static void main(String[] args) {
        int number = 1010;
        System.out.println(binaryDecimal1(number));
        System.out.println(binaryDecimal2(number));

        System.out.println(binaryDecimal1(1000));
        System.out.println(binaryDecimal2(1001));

        System.out.println(binaryDecimal1(1111));
        System.out.println(binaryDecimal2(11111));

        System.out.println(binaryDecimal1(10000));
        System.out.println(binaryDecimal2(10));
    }
}
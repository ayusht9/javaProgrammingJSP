import java.lang.Math;
class PartReverse {
	public static int getSize(int num) {
		int size=0;
		while(num>0){
			size++;
			num/=10;
		}
		return size;
	}

	public static int revNum(int num){
		int rev = 0;
		while(num>0){
			rev = rev*10 + num%10;
			num/=10;
		}
		return rev;
	}

	public static int partRev(int num){
		int size = getSize(num);
		int tens = (int) Math.pow(10,size/2);
		int num1 = revNum(num/tens);
		int num2 = revNum(num%tens);
		int res = num1*tens + num2;
		return res;
	}

    public static void main(String[] args) {
        int num = 123456;
        System.out.println(partRev(num));
        System.out.println(partRev(1234));
        System.out.println(partRev(112233));
    }
}

class DecimalBinaryConversion {
	// decimal to binary
	public static int toBinary(int num) {
		int sum = 0;
		int pow = 1;
		while (num > 0) {
			int digit = num % 2;
			sum += digit * pow;
			num = num / 2;
			pow = pow * 10;
		}
		return sum;
	}

	// binary to decimal
	public static int toDecimal(int binary) {
		int decimal = 0;
		int pow = 1;

		while (binary > 0) {
			int digit = binary % 10;
			decimal += digit * pow;
			binary /= 10;
			pow *= 2;
		}
		return decimal;
	}

	public static void main(String[] args) {
		int num = 220;
		int binary = toBinary(num);
		int decimal = toDecimal(binary);
		
		System.out.println(binary);
		System.out.println(decimal);
	}
}
import java.util.Scanner;

class Program4 {
	public static int lastDigit(int num) {
        return num%10;
	}
	public static int removeLastDigit(int num) {
        return num/10;
	}
	public static int countDigit(int num) {
        int count = 0;
        while(num>0){
        	num = removeLastDigit(num);
        	count++;
        }
        return count;
	}

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int number = sc.nextInt();
        
		System.out.println(lastDigit(number));
        System.out.println(removeLastDigit(number));
        System.out.println(countDigit(number));
    }
}
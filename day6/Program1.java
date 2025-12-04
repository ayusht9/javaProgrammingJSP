import java.util.Scanner;
class Program1 {
	public static int findLCM(int num1, int num2) {
		int lcm = num1>num2?num1:num2;
		while(true){
			if(lcm%num1==0&&lcm%num2==0)
				break;
			lcm++;
		}
		return lcm;
	}

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter num1: ");
    	int num1 = sc.nextIrnt();
    	System.out.print("Enter num2: ");
    	int num2 = sc.nextInt();
    	System.out.println(findLCM(num1,num2));
    }
}
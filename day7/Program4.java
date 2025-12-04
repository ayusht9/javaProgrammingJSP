import java.util.Scanner;

class Program4 {
	public static boolean isPrime2(int num){
		if(num==1)
			return false;
		
		int factor = 2;
		for(int i=2;i<=num/2;i++){
			if(num%i==0)
				factor++;
		}
		return factor==2;
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
    	System.out.println(isPrime(num));
    }
}
// prime number and composite number
import java.util.Scanner;

class Program2 {
	public static boolean isPrime(int num){
		if(num<0)
			return false;

		int factor = 2;
		for(int i=2;i<=num/2;i++)
			if(num%i==0)
				return false;

		return true;
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = 0;
        try{
	        num = sc.nextInt();
			if(isPrime(num))
    			System.out.println("prime");
	    	else
	    		System.out.println("composite");
        }
        catch(Exception e){
        	System.out.println("Invalid input");
        }

    }
}
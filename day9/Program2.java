// decimal to binary

class Program2{
	public static int toBinary(int num) {
	    int sum=0;
	    int pow=1;
	    while(num>0){
	    	int digit=num%2;
	    	sum+=digit*pow;
	    	num=num/2;
	    	pow=pow*10;
	    }
	    return sum;
	}
	public static void main(String[] args) {
		int num = 20;
	    System.out.println(toBinary(num));
	}
}
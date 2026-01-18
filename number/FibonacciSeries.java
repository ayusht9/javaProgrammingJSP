// fibonacci series
import java.util.Scanner;

class FibonacciSeries {
	public static void fibonacciSeries(int terms){
		int prev = 0, curr = 1, next = 0;

    	for(int i=0;i<terms;i++){
    		System.out.print(prev+" ");
    		next=prev+curr;
    		prev=curr;
    		curr=next;
    	}
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of terms: ");
        int terms = sc.nextInt();
		sc.close();
		
    	fibonacciSeries(terms);
    }
}
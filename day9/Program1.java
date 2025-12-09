// nth fibonacci term
import java.util.Scanner;

class Program1 {
	public static int fibonacciTerm(int terms){
		int prev = 0, curr = 1, next = 0;
		terms = terms-1;
    	for(int i=0;i<terms;i++){
    		next=prev+curr;
    		prev=curr;
    		curr=next;
    	}
    	return prev;
	}

    public static void main(String[] args) {
        int term=5;

        for(int i=1;i<=5;i++)
    	System.out.println(fibonacciTerm(i));
    }
}
// perfect square
import java.util.Scanner;

class PerfectSquare {
	public static boolean perfectSq(int num){
        boolean res = false;
        int half = num/2;
        for(int i = 2; i<=half; i++){
            if(i*i==num){
                res=true;
                break;
            }
        }
        return res;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        sc.close();
        System.out.println(perfectSq(num));
        
    }
}
// perfect square
import java.util.Scanner;

class Program4 {
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
        System.out.println(perfectSq(num));
        
    }
}
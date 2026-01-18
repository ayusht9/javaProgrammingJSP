import java.util.Scanner;

class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
        
        if(sum%8==0)
            System.out.println(sum+" is divisible by 8");
            
        
    }
}

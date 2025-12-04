import java.util.Scanner;

class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter num1: ");
        double a = sc.nextDouble();

        System.out.print("Enter num2: ");
        double b = sc.nextDouble();

        switch (operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}

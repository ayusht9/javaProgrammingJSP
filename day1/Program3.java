import java.util.Scanner;

class Program3 {
    public static void isMultipleEight(int num){
        if(num%8==0)
            System.out.println(num+" multiple of eight");
        else
            System.out.println(num+" not a multiple of eight");
    }

    public static void isEvenOdd(int num){
        if(num%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    public static void isPositiveNegative(int num){
        if(num>=0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        isEvenOdd(num);
        isPositiveNegative(num);
        isMultipleEight(num);
//        isMultipleEight(16);
//        isMultipleEight(80);
//        isMultipleEight(10);


    }
}

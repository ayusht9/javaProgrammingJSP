import java.util.Scanner;

class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Grade: ");
        char ch = sc.next().toUpperCase().charAt(0);

        switch (ch){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("Passing grade");
                break;
            case 'D':
                System.out.println("Needs improvement");
                break;
            case 'E':
                System.out.println("Failed");
                break;
            default:
                System.out.println("I'm not sure");
        }
    }
}

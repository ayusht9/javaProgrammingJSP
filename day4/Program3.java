import java.util.Scanner;

class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter signal (red, yellow, green): ");
        String sign = sc.next().toLowerCase();
        
        switch (sign){
            case "red":
                if(sign.equals("red"))
                    System.out.println("Stop");
                if(sign.equals("green"))
                    System.out.println("Go");
                if(sign.equals("yellow")) 
                    System.out.println("Go Slow");
                break;
            case "green":
                if(sign.equals("red"))
                    System.out.println("Stop");
                if(sign.equals("green"))
                    System.out.println("Go");
                if(sign.equals("yellow")) 
                    System.out.println("Go Slow");
                break;
            case "yellow":
                if(sign.equals("red"))
                    System.out.println("Stop");
                if(sign.equals("green"))
                    System.out.println("Go");
                if(sign.equals("yellow")) 
                    System.out.println("Go Slow");
                break;
            default:
                System.out.println("invalid string");
        }
        
    }
}

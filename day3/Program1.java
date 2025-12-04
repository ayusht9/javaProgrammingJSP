import java.util.Scanner;

class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Direction: ");
        String direction = sc.next().toLowerCase();

        switch (direction){
            case "north":
                System.out.println("You are heading North");
                break;
            case "south":
                System.out.println("You are heading South");
                break;
            case "east":
                System.out.println("You are heading East");
                break;
            case "west":
                System.out.println("You are heading West");
                break;
            default:
                System.out.println("Invalid direction");
        }

    }
}

class Basics {

    // Prints "java is easy" a times
    public static void print(int a) {
        if (a <= 0) {
            return;
        }

        System.out.println("java is easy");
        print(a - 1);
    }

    // Prints numbers from i to 10
    public static void print10(int i) {
        if (i > 10) {
            return;
        }

        System.out.print(i + " ");
        print10(i + 1);
    }

    // Prints even numbers from i to 10
    public static void printEven10(int i) {
        if (i > 10) {
            return;
        }

        if (i % 2 == 0) {
            System.out.print(i + " ");
        }

        printEven10(i + 1);
    }

    public static void main(String[] args) {
        print(3);
        print10(1);
        System.out.println();
        printEven10(1);
    }
}

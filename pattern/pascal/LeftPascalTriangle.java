class LeftPascalTriangle {
    public static void leftPascalTriangle(int num) {
        for (int row = 1; row <= num * 2 - 1; row++) {
            for (int col = 1; col <= num; col++) {
                if (row + col >= (num + 1) && row-col <= (num - 1))
                    System.out.print("*");
                else
                    System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void hollowLeftPascalTriangle(int num) {
        for (int row = 1; row <= num * 2 - 1; row++) {
            for (int col = 1; col <= num; col++) {
                if (row+col == num+1 || row-col==num-1 || col==num)
                    System.out.print("*");
                else
                    System.out.print("-");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        leftPascalTriangle(3);
        hollowLeftPascalTriangle(3);
    }
}

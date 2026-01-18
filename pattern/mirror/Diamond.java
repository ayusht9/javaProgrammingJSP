class Diamond {
    public static void diamond(int num) {
        for (int row = 1; row <= num * 2 - 1; row++) {
            for (int col = 1; col <= num * 2 - 1; col++) {
                if (row + col >= num + 1 && col - row <= num - 1 && row - col <= num - 1 && row + col <= num * 3 - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        diamond(3);
    }

}

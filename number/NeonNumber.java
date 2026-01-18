class NeonNumber {

    public static boolean isNeoNumber(int num) {
        int sum = 0;
        int temp = num * num;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum == num;
    }

    public static void neoRange(int high) {
        for (int i = 1; i <= high; i++) {
            if (isNeoNumber(i))
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        neoRange(100);
    }
}

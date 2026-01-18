class MissingNumber {
    public static int getMissing(int[] a) {
        int n = a[a.length - 1];

        int expectedSum = n * (n+1) / 2;

        int actualSum = 0;

        for (int num : a) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5};
        System.out.println(getMissing(a));
    }
}
class ArmstrongNumber {

    public static boolean isArmstrong(int num) {
        int temp = num;
        int count = 0;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;

            int power = 1;
            for (int i = 0; i < count; i++) {
                power *= digit;
            }

            sum += power;
            temp /= 10;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(143));
    }
}

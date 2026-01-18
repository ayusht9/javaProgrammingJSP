class SunnyNumber {

    public static boolean isSunny(int n) {
        if(n<1)
            return false;
        int sqrt = (int) Math.sqrt(n + 1);
        return sqrt * sqrt == n + 1;
    }

    public static void sunnyRange(int high){
        for (int i = 1; i <= high; i++) {
            if(isSunny(i))
                System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        System.out.println(isSunny(8));

        sunnyRange(100);
    }
}

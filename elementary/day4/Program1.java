class Program1 {
	public static boolean isEven(int num) {
		return (num&1)==0;
	}
    public static void main(String[] args) {
        System.out.println(isEven(3));
        System.out.println(isEven(2));
    }
}
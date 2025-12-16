class Program1 {
	public static void one(int num) {
		int num1 = 1;
		int num2 = num*2;
		int num3=num2+1;
		for(int row = 1; row <= num; row++){
			for(int col = 1; col <= num; col++){
					if(col==1)
						System.out.print(num1++);
					else if(col==2)
						System.out.print(num2--);
					else if(col==3)
						System.out.print(num3++);
			}
			System.out.println();
		}
	}
    public static void two(int num) {
        int left = 1;
        int middle = num * 2;
        int right = middle + 1;

        for (int i = 1; i <= num; i++) {
            System.out.print(left++);
            System.out.print(middle--);
            System.out.print(right++);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        one(3);
        two(3);
    }
}
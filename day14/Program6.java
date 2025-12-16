class Program6 {
	public static void one(int num) {
		for(int row = 1; row <= num; row++){
			for(int col = 1; col <= row; col++){
					System.out.print(col);
			}
			System.out.println();
		}
	}
	public static void two(int num) {
		for(int row = 1; row <= num; row++){
			for(int col = 1; col <= row; col++){
					System.out.print(row);
			}
			System.out.println();
		}
	}
	public static void three(int num) {
		int n = 1;
		for(int row = 1; row <= num; row++){
			for(int col = 1; col <= row; col++){
					System.out.print(n++);
			}
			System.out.println();
		}
	}

	public static void four(int num) {
		char ch='A';
		for(int row = 1; row <= num; row++){
			for(int col = 1; col <= row; col++){
					System.out.print(ch);
			}
			ch++;
			System.out.println();
		}
	}
	public static void five(int num) {
		char ch='A';
		for(int row = 1; row <= num; row++){
			for(int col = 1; col <= row; col++){
					System.out.print(ch++);
			}
			System.out.println();
		}
	}
	public static void six(int num) {
		for(int row = 1; row <= num; row++){
			char ch='A';
			for(int col = 1; col <= row; col++){
					System.out.print(ch++);
			}
			System.out.println();
		}
	}

    public static void main(String[] args) {
        // one(3);
        // two(3);
        // three(3);
        // four(3);
        // five(3);
        // six(3);
    }
}
class NumberPattern {
	public static void pat1(int num) {
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				System.out.print(row + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void pat2(int num) {
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void pat3(int num) {
		int ch = 1;
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void pat4(int num) {
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				System.out.print(row + col + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		pat1(3);
		pat2(3);
		pat3(3);
		pat4(3);

	}
}
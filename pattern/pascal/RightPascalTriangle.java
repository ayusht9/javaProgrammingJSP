class RightPascalTriangle {
	public static void rightPascalTriangle(int num) {
		for (int row = 1; row <= num * 2 - 1; row++) {
			for (int col = 1; col <= num; col++) {
				if (row >= col && row + col <= num * 2)
					System.out.print("*");
				else
					System.out.print("-");
			}
			System.out.println();
		}
		System.out.println();

	}

	public static void hollowRightPascalTriangle(int num) {
		for (int row = 1; row <= num * 2 - 1; row++) {
			for (int col = 1; col <= num; col++) {
				if (col == 1 || row + col == num * 2 || row == col)
					System.out.print("*");
				else
					System.out.print("-");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		rightPascalTriangle(3);
		hollowRightPascalTriangle(3);
	}
}
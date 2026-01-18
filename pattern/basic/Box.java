class Box {
	public static void box(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void hollowBox(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				if (row == 1 || row == n || col == 1 || col == n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void makeHollow(int n, int x, int y) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				if (row == x && col == y)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		box(3);
		hollowBox(3);
		makeHollow(3, 3, 2);
	}

}
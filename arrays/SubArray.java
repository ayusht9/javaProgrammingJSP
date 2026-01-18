class SubArray {
	public static void printSubArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i; j++) {
				for (int k = i; k <= i + j; k++) {
					System.out.print(a[k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		printSubArray(a);

	}
}
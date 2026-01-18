class ArmstrongRange {

	public static void printArmstrongInRange(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (ArmstrongNumber.isArmstrong(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		printArmstrongInRange(1, 1000);
	}
}

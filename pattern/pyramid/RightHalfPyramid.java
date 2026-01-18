class RightHalfPyramid {
    public static void rightHalfPyramid(int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num; col++) {
                if (row >= col)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void rightHalfReversePyramid(int num) {
		for(int row = 1; row <= num; row++){
			for(int col = 1; col <= num; col++){
				if(row+col<=num+1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
    }

    public static void main(String[] args) {
        rightHalfPyramid(3);
        rightHalfReversePyramid(3);
    }

}

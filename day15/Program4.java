// Hollow Pyramid
interface Pattern{
	void run(int num);
}

class Program4{
	public static void main(String[] args) {
		Pattern hollowLeftHalfPyramid = (num) -> {
            for(int row = 1; row <= num; row++){
                for(int col = 1; col <= num; col++){
                    if(row+col==num+1 || col==num || row==num)
                    	System.out.print("*");
                    else
                    	System.out.print("-");
                }
                System.out.println();
            }
            System.out.println();
		};
		Pattern hollowReverseRightHalfPyramid = (num) -> {
            for(int row = 1; row <= num; row++){
                for(int col = 1; col <= num; col++){
                    if(row+col==num+1 || row==1 || col==1)
                    	System.out.print("*");
                    else
                    	System.out.print("-");
                }
                System.out.println();
            }
            System.out.println();
		};

		Pattern hollowRightHalfPyramid = (num) -> {
            for(int row = 1; row <= num; row++){
                for(int col = 1; col <= num; col++){
                    if(row==col || row==num || col==1)
                    	System.out.print("*");
                    else
                    	System.out.print("-");
                }
                System.out.println();
            }
            System.out.println();
		};

		Pattern hollowReverseLeftHalfPyramid = (num) -> {
            for(int row = 1; row <= num; row++){
                for(int col = 1; col <= num; col++){
                    if(row==col || row==1 || col==num)
                    	System.out.print("*");
                    else
                    	System.out.print("-");
                }
                System.out.println();
            }
            System.out.println();
		};

		hollowRightHalfPyramid.run(5);
		hollowReverseRightHalfPyramid.run(5);
		hollowLeftHalfPyramid.run(5);
		hollowReverseLeftHalfPyramid.run(5);
	}
}
// Pyramid
interface Pattern{
	void run(int num);
}

class Program3{
	public static void main(String[] args) {
		Pattern leftHalfPyramid = (num) -> {
            for(int row = 1; row <= num; row++){
                for(int col = 1; col <= num; col++){
                    if(row+col>=num+1)
                    	System.out.print("*");
                    else
                    	System.out.print("-");
                }
                System.out.println();
            }
            System.out.println();
		};

		Pattern reverseLeftHalfPyramid = (num) -> {
            for(int row = 1; row <= num; row++){
                for(int col = 1; col <= num; col++){
                    if(row<=col)
                    	System.out.print("*");
                    else
                    	System.out.print("-");
                }
                System.out.println();
            }
            System.out.println();
		};

		Pattern rightHalfPyramid = (num) -> {
            for(int row = 1; row <= num; row++){
                for(int col = 1; col <= num; col++){
                    if(row>=col)
                    	System.out.print("*");
                    else
                    	System.out.print("-");
                }
                System.out.println();
            }
            System.out.println();
		};


		Pattern reverseRightHalfPyramid = (num) -> {
            for(int row = 1; row <= num; row++){
                for(int col = 1; col <= num; col++){
                    if(row+col<=num+1)
                    	System.out.print("*");
                    else
                    	System.out.print("-");
                }
                System.out.println();
            }
            System.out.println();
		};

		leftHalfPyramid.run(5);
		reverseLeftHalfPyramid.run(5);
		rightHalfPyramid.run(5);
		reverseRightHalfPyramid.run(5);
	}
}
interface Pattern{
	void run(int num);
}
class Program2 {
    public static void main(String[] args) {
        Pattern rightHalfPyramid = (num) -> {
            for(int row = 1; row <= num; row++){
                for(int col = 1; col <= row; col++){
                        System.out.print("*");
                }
                System.out.println();
            }
        };

        Pattern squareHollow = (num) -> {
            for(int row = 1; row <= num; row++){
                for(int col = 1; col <= num; col++){
                    if(row==1 || col==1 || row==num || col == num)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }         
        };

        Pattern numberIncRevPyramid = (num) -> {
            for(int row = 1; row <= num; row++){
                int i=1;
                for(int col = num; col >= row; col--){
                    System.out.print(i++);
                }
                System.out.println();
            }  
        };

        
        rightHalfPyramid.run(3);
        squareHollow.run(5);
        numberIncRevPyramid.run(4);
    }
}
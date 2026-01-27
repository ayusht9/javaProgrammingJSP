class NumberDiamond {
    public static void numberDiamond(int num) {
        for (int row = 1; row <= num * 2 - 1; row++) {
            int i=1;
            for (int col = 1; col <= num * 2 - 1; col++) {
                if (row + col >= num + 1 && col - row <= num - 1 && row - col <= num - 1 && row + col <= num * 3 - 1){

                    if(col>=num){
                        System.out.print(i--);
                        continue;
                    }
                    System.out.print(i++);
                    
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        numberDiamond(5);
    }

}

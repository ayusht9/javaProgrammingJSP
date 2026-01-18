package triangle;
class ReverseTrianglePattern {
    public static void pat1(int num) {
        for(int  row=1;row<=num;row++){
            for(int col=1;col<=num*2-1;col++){
                if(row<=col && row+col<=num*2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pat2(int num) {
        for(int row=1;row<=num;row++){
            for(int col=1;col<=num*2-1;col++){
                if(row>=col || row+col>=num*2)
                     System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pat3(int num) {
        for(int row=1;row<=num;row++){
            for(int col=1;col<=num*2-1;col++){
                if(row==col || row+col==num*2 || row==1)
                     System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        pat1(3);
        pat2(3);
        pat3(3);
    }
}
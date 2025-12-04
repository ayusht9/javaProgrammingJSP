// multiplication range
class Program2 {
    public static void table(int num){
        for(int i=1; i<=10; i++)
            System.out.println(num+" x "+i+" = "+num*i);
        System.out.println();
    }
    public static void main(String[] args) {
        for(int i=11;i<=20;i++){
            System.out.println("table of "+i);
            table(i);
        }
    }
}
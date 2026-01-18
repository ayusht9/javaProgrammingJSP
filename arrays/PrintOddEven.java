class PrintOddEven {

        public static void printAtEvenIndex(int[] arr) {
                for (int i = 0; i < arr.length; i++) {
                        if (i % 2 == 0) {
                                System.out.print(arr[i] + " ");
                        }
                }
                System.out.println();
        }

        public static void printAtOddIndex(int[] arr) {
                for (int i = 0; i < arr.length; i++) {
                        if (i % 2 != 0) {
                                System.out.print(arr[i] + " ");
                        }
                }
                System.out.println();
        }

        public static void printEvenElements(int[] arr) {
                for (int num : arr) {
                        if (num % 2 == 0) {
                                System.out.print(num + " ");
                        }
                }
                System.out.println();
        }

        public static void printOddElements(int[] arr) {
                for (int num : arr) {
                        if (num % 2 != 0) {
                                System.out.print(num + " ");
                        }
                }
                System.out.println();
        }

        public static void main(String[] args) {
                int[] arr = { 10, 20, 30, 40, 50 };
                int[] arr2 = { 1, 2, 3, 4, 5 };

                printAtEvenIndex(arr);
                printAtOddIndex(arr);
                printEvenElements(arr2);
                printOddElements(arr2);
        }
}

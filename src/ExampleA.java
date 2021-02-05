class ExampleA {
    public static void main(String[] args) {
        int myEA[] = new int[100];
        int i = 0;

        System.out.println("Empty array: ");
        for (i = 0; i < myEA.length; i++) {
            System.out.print(myEA[i] + ", ");
            if (i > 0 && ((i + 1) % 10 == 0)) {
                System.out.println();
            }
        }
        System.out.println();

        System.out.println("Completed array: ");
        for (i = 0; i < myEA.length; i++) {
            myEA[i] = i;
            System.out.print(myEA[i] + ", ");
            if (i > 0 && ((i + 1) % 10 == 0)) {
                System.out.println();
            }
        }
        System.out.println();

        System.out.println("Fixed array: ");
        for (i = 0; i < myEA.length; i++) {
            if (myEA[i] < 10) {
                System.out.print("0" + myEA[i] + ", ");
            } else
                System.out.print((myEA[i]) + ", ");
            if (i > 0 && ((i + 1) % 10 == 0)) {
                System.out.println();
            }
        }
    }
}

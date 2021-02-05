class Array3D {
    public static void main(String[] args) {
        int my2DArray[][] = new int[7][0];

        int counter = 0;
/*        for (int myAr1D[] : my2DArray) {
            for (int elMyAr1D : myAr1D) {
                System.out.print(elMyAr1D + counter);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(counter);*/


        for (int i = 0; i < my2DArray.length; i++) {
            for (int j = 0; j < i + 1; j++)
                System.out.print("1");
            System.out.println();

        }

        double arrayExample[] = new double[4];
        arrayExample[0] = 2.4;
        arrayExample[3] = 3.5;
        double sum = arrayExample[0] + arrayExample[3];

        System.out.println("Sum element 0 + element 3: " + sum);

        float tabEx[] = new float[14];
        for (int i = 0; i<tabEx.length; i++) {
            tabEx[i] = i;
            System.out.println(tabEx[i]);
        }

        System.out.println(tabEx[(10 + 4)/2]);
        System.out.print("Empty array: ");
        double myT[] = new double[6];
        for (int i = 0; i<myT.length; i++){
            System.out.print(myT[i] + ", ");
        }
        System.out.println();
        System.out.print("Array completed: ");
        for (int i = 0; i<myT.length; i++){
            System.out.print((myT[i] = myT[i] + i) + ", ");
            System.out.println("index is: " + i + ", value is: " + myT[i]);
        }



    }
}


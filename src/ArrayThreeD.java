class ArrayThreeD {
    public static void main(String[] args) {
        float array3D[][][] = new float[3][4][5];

        for (float tab2D[][] : array3D) {
            for (float tab1D[] : tab2D) {
                for (float elT1D : tab1D) {
                    elT1D = elT1D + 2;
                    System.out.print(elT1D);
                }
                System.out.println("+++++++++");
            }
            System.out.println("---------");
        }
        int i, j;

        int myT[][] = new int[5][5];
        for (i = 0; i < myT.length; i++) {
            for (j = 0; j < myT[i].length; j++) {
                System.out.print(myT[i][j]);
            }
            System.out.println();
        }
    }
}



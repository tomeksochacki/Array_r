class Main {
    public static void main(String[] args) {
        int myAr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int sum2 = 0;
        for (int elementAr : myAr) {
            sum = sum + elementAr;
            elementAr = elementAr * 10;

            System.out.println("Element " + elementAr);
            //if (elementAr == 5) break;
        }

        for (int i = 0; i < myAr.length; i++) {
            sum2 = sum2 + myAr[i];
            System.out.println(myAr[i]);
        }
        System.out.println(sum);
        System.out.println(sum2);

        int myTab[] = {2, 4, 5, 6, 79};
        for (int elMyTab : myTab) {
            System.out.println(elMyTab);

        }
        int mySum = 0;
        int myTabTwo[][] = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                myTabTwo[i][j] = (i + 1) * (j + 1);
                System.out.print(myTabTwo[i][j] + " ");
            }
        }

        System.out.println("+++++++++++++");
        for (int myElTabTwo[] : myTabTwo) {
            for (int myElTabTwo2 : myElTabTwo) {
                System.out.println(myElTabTwo2);
            }

        }

        /*        System.out.println(myTabTwo[i][j]);*/

        System.out.println("PPPPPPPPPPPPPPPP");
        double myTabD[][] = new double[4][5];
        for (double elMyTabD[] : myTabD) {
            for (double elMyTabD2 : elMyTabD) {
                elMyTabD2 = elMyTabD2 + 2;
                System.out.print(elMyTabD2 + " ");
            }

        }
        System.out.println("OOOOOOOOOOOOOOOOOOOOOOOO");

        float myTable[][] = {
                {3, 4, 5},
                {3, 3, 5},
        };

        for (float elMT[] : myTable) {
            for (float eMT : elMT) {
                System.out.println(eMT);
            }
        }


    }
}

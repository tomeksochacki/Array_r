import java.util.Scanner;

class Test2 {
    public void numberEnter(int n){

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

class My{
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.numberEnter(6);
    }
}

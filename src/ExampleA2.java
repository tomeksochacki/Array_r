import java.util.Scanner;

class ExampleA2 {
    public static void main(String[] args) {
        System.out.println("Type the size your's array, and press enter.");
        Scanner scanner = new Scanner(System.in);
        int sizeAr = scanner.nextInt();
        double arr[] = new double[sizeAr];

        double sum = 0;
        double average = 0;
        double max = arr[0];
        double temp = 0;

        for (int i = 0; i < sizeAr; i++) {
            System.out.println("Type the values:");
            Scanner scanner2 = new Scanner(System.in);
            double values = scanner2.nextFloat();
            arr[i] = values;

            sum = sum + arr[i];

            for (int k = 1; k < arr.length; k++) {
                if (arr[k] > max) {
                    max = arr[k];
                }
            }

            if (i > sizeAr) {
                break;
            }
        }

        System.out.println();
        System.out.print("Completed array: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + ", ");
        }

        System.out.println();
        System.out.print("Sum is: " + sum);
        System.out.println();
        System.out.print("Average is: " + sum / arr.length);
        System.out.println();
        System.out.print("Max value is: " + max);
    }
}

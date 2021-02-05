import java.util.Scanner;

class Test {


    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj liczbę rzędów");
        int rzedy = skaner.nextInt();
        // taka powinna być liczba kolumn, ponieważ dodajemy po jednej
        // pustej kolumnie po bokach, dzięki temu można będzie wyliczać
        // wartość kolejnej liczby dodając liczby z lewej i prawej leżące
        // w poprzedniej kolumnie
        int kolumny = rzedy * 2 + 1;
        // tworzymy tablice, zera domyślie wypełniają puste miejsca,
        // ułatwi to wyliczenie kolejnych liczb
        int[][] tab = new int[rzedy][kolumny];
        int srodek = rzedy;
        // pierwszy rząd
        tab[0][srodek] = 1;
        for (int i = 1; i < rzedy; i++) {
            // liczby > 0 mieszczą się w tym zakresie
            for (int j = srodek - i; j <= srodek + i; j++) {
                // obliczamy wszystkie komórki w zakresie, ponieważ zera
                // oznaczają puste komórki wyliczane są zarówno puste
                // komórki (0 + 0) jak i skrajne jedynki (0 + 1),
                // nie musimy ich specjalnie wstawiać
                tab[i][j] = tab[i - 1][j - 1] + tab[i - 1][j + 1];
            }
        }

        // odkomentuj poniższy fragment, jeśli chcesz podejrzeć
        // wartości w tablicy
        /*
        for (int[] tab1 : tab) {
            System.out.println(Arrays.toString(tab1));
        }
        */

        // drukowanie gwiazdek w miejscu liczb nieparzystych
        for (int[] tab1 : tab) {
            for (int l : tab1) {
                if (l % 2 != 0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }

}


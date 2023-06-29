package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MultiArray multiarray;
        int arrayRows;
        int arrayColumns;
        do {
            System.out.println("Podaj liczbę wierszy dla nowej tablicy: ");
            arrayRows = scan.nextInt();
            scan.nextLine();
        } while (arrayRows > 100);
        do {
            System.out.println("Podaj liczbę kolumn dla nowej tablicy: ");
            arrayColumns = scan.nextInt();
            scan.nextLine();
        } while (arrayColumns > 100);

        multiarray = new MultiArray(arrayRows, arrayColumns);
        multiarray.fulfil();
        multiarray.print();
    }
}

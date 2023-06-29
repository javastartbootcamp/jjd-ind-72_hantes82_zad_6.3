package pl.javastart.task;

public class MultiArray {
    private int[][] array;

    public MultiArray(int row, int column) {
        array = new int[row][column];
    }

    public void fulfil() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i * j;
            }
        }
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4d |", array[i][j]);
            }
            System.out.println("\n" + "-".repeat(array[i].length * 6));
        }
    }
}

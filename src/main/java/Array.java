package Array;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        change1to0();//task1
        three();//task2
        multiplicationToTwo();//task3
        diagonals();//task4
        maxAndMin();//task5
        int[] arr = {7, 8, 12, 3};//task6
        System.out.println(sum(arr));
        int[] arr7 = {0, 1, 2, 3, 4, 5, 6, 7};//task7
        printResult(arrayShift(arr7, 3));
    }

    public static void change1to0() {
        int[] arr = {0, 1, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println("///////////TASK1///////////");
        System.out.println(Arrays.toString(arr));
    }

    public static void three() {
        int[] arr = new int[8];
        arr[0] = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        System.out.println("///////////TASK2///////////");
        System.out.println(Arrays.toString(arr));
    }

    public static void multiplicationToTwo() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println("///////////TASK3///////////");
        System.out.println(Arrays.toString(arr));
    }

    public static void diagonals() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
        System.out.println("///////////TASK4///////////");
        print2DArray(arr);
    }

    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void maxAndMin() {
        int[] arr = {3, 5, 7, 1, 8, 15, 17};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i != arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("///////////TASK5///////////");
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);
    }

    public static boolean sum(int[] arr) {
        System.out.println("///////////TASK6///////////");
        for (int i = 1; i < arr.length; i++) {
            int sum1 = 0, sum2 = 0;
            for (int j = 0; j < i; j++) {
                sum1 += arr[j];
            }
            for (int j = i; j < arr.length; j++) {
                sum2 += arr[j];
            }
            if (sum1 == sum2) return true;
        }
        return false;
    }

    public static int[] arrayShift(int[] array, int n) {
        int[] result = new int[array.length];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (n + i < array.length) {
                result[i] = array[n + i];
            } else {
                result[i] = array[counter];
                counter++;
            }
        }
        return result;
    }

    public static void printResult(int[] array) {
        System.out.println("///////////TASK7///////////");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

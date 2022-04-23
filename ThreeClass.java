public class ThreeClass {

    public static void main(String[] args) {

        // Задание 1

        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        printArray1("1. Before:\t", array1);
        change(array1);
        printArray1("1. After:\t", array1);

        System.out.println("-----------------------------");

        // Задание 2

        int[] array2 = new int[100];
        fillIn(array2);
        printArray1("2. Filled with cycle:\t", array2);

        System.out.println("-----------------------------");

        // Задание 3

        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArray1("3. Before:\t", array3);
        doubling(array3);
        printArray1("3. After:\t", array3);

        System.out.println("-----------------------------");

        // Задание 4

        int side = 10;
        int[][] array4 = new int[side][side];
        crossFill(array4);
        printArray2("4. Result fill diagonals", array4);

        System.out.println("-----------------------------");

        // Задание 5

        int[] returnArrayFromMethod = returnArray (5, 5);
        printArray1("5. Array form method", returnArrayFromMethod);

        System.out.println("-----------------------------");

    }

    public static void printArray1(String msg, int[] inputArray) {
        System.out.print(msg + ": ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }

    public static void change(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
    }

    public static void fillIn(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = i + 1;
    }

    public static void doubling(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6)
                array[i] *= 2;
    }

    public static void crossFill(int[][] arr) {
        int abc = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][abc - i] = 1;
        }
    }

    public static void printArray2(String msg, int[][] inputArray) {
        System.out.println(msg);
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                System.out.print(inputArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] returnArray (int len, int initValue) {
        int[] tempArray = new int[len];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = initValue;
        }
        return tempArray;
    }

}

import java.util.Arrays;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        //task 1
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        System.out.println();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила: " + sum + " рублей.");
        System.out.println();

        //task 2
        int min = 200_001;
        int max = 99_999;
        for (int element : arr) {
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }
        }
        System.out.print("Минимальная сумма трат за день составила " + min + " рублей. ");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");
        System.out.println();

        //task 3
        double avgSum;
        avgSum = (double) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + avgSum + " рублей.");
        System.out.println();

        //task 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

        //task 5
        System.out.println();
        int size = 3;
        int number = 1;
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = number;
            matrix[i][size - i - 1] = number;
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        //task 6
        System.out.println();
        int[] arrayMain = new int[5];
        int[] arrayAdditional = new int[arrayMain.length];
        for (int i = 0; i < arrayMain.length; i++) {
            arrayMain[i] = arrayMain.length - i;
        }
        System.out.println(Arrays.toString(arrayMain));
        for (int i = 0; i < arrayAdditional.length; i++) {
            arrayAdditional[i] = arrayMain[arrayMain.length - i - 1];
        }
        arrayMain = arrayAdditional;
        System.out.println(Arrays.toString(arrayMain));

        //task 7
        System.out.println();
        int[] array = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            array[i] = array[i] + array[array.length - i - 1];
            array[array.length - i - 1] = array[i] - array[array.length - i - 1];
            array[i] = array[i] - array[array.length - i - 1];
        }
        System.out.println(Arrays.toString(array));

        //task 8
        System.out.println();
        int[] mainArray = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int lackOfNumbers = 0;
        label:
        for (int i = 0; i < mainArray.length - 1; i++) {
            for (int j = i + 1; j < mainArray.length; j++) {
                if (mainArray[i] + mainArray[j] == -2) {
                    System.out.println("Первое число: " + mainArray[i]);
                    System.out.println("Второе число: " + mainArray[j]);
                    lackOfNumbers++;
                    break label;
                }
            }
        }

        if (lackOfNumbers == 0) {
            System.out.println("Такой пары чисел нет!");
        }

        //task 9
        System.out.println();
        lackOfNumbers = 0;
        for (int i = 0; i < mainArray.length - 1; i++) {
            for (int j = i + 1; j < mainArray.length; j++) {
                if (mainArray[i] + mainArray[j] == -2) {
                    lackOfNumbers++;
                    System.out.println("Найдена " + lackOfNumbers + "-я пара чисел!");
                    System.out.println("Первое число: " + mainArray[i] + ", второе число: " + mainArray[j]);
                }
            }
        }
        if (lackOfNumbers == 0) {
            System.out.println("Такой пары чисел нет!");
        }
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main(String[] args) {

        // Задача 1: Объявление массивов
        System.out.println("=== Задача 1: Объявление массивов ===");

        // Целочисленный массив с помощью new
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        // Массив дробных чисел сразу заполненный значениями
        double[] doubleArray = {1.57, 7.654, 9.986};

        // Произвольный массив (строки)
        String[] stringArray = {"Java", "Python", "C++", "JavaScript"};

        System.out.println("Массивы созданы успешно!\n");

        // Задача 2: Вывод массивов в прямом порядке
        System.out.println("=== Задача 2: Вывод в прямом порядке ===");

        System.out.println("Целочисленный массив:");
        for (int i = 0; i < intArray.length; i++) {
            if (i == intArray.length - 1) {
                System.out.print(intArray[i]);
            } else {
                System.out.print(intArray[i] + ", ");
            }
        }
        System.out.println();

        System.out.println("Массив дробных чисел:");
        for (int i = 0; i < doubleArray.length; i++) {
            if (i == doubleArray.length - 1) {
                System.out.print(doubleArray[i]);
            } else {
                System.out.print(doubleArray[i] + ", ");
            }
        }
        System.out.println();

        System.out.println("Строковый массив:");
        for (int i = 0; i < stringArray.length; i++) {
            if (i == stringArray.length - 1) {
                System.out.print(stringArray[i]);
            } else {
                System.out.print(stringArray[i] + ", ");
            }
        }
        System.out.println("\n");

        // Задача 3: Вывод массивов в обратном порядке
        System.out.println("=== Задача 3: Вывод в обратном порядке ===");

        System.out.println("Целочисленный массив (обратный порядок):");
        for (int i = intArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(intArray[i]);
            } else {
                System.out.print(intArray[i] + ", ");
            }
        }
        System.out.println();

        System.out.println("Массив дробных чисел (обратный порядок):");
        for (int i = doubleArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(doubleArray[i]);
            } else {
                System.out.print(doubleArray[i] + ", ");
            }
        }
        System.out.println();

        System.out.println("Строковый массив (обратный порядок):");
        for (int i = stringArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(stringArray[i]);
            } else {
                System.out.print(stringArray[i] + ", ");
            }
        }
        System.out.println("\n");

        // Задача 4: Преобразование нечетных чисел в четные
        System.out.println("=== Задача 4: Преобразование нечетных чисел ===");

        System.out.println("Исходный массив:");
        for (int i = 0; i < intArray.length; i++) {
            if (i == intArray.length - 1) {
                System.out.print(intArray[i]);
            } else {
                System.out.print(intArray[i] + ", ");
            }
        }
        System.out.println();


        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0) {
                intArray[i] += 1;
            }
        }

        System.out.println("Преобразованный массив:");
        for (int i = 0; i < intArray.length; i++) {
            if (i == intArray.length - 1) {
                System.out.print(intArray[i]);
            } else {
                System.out.print(intArray[i] + ", ");
            }
        }
        System.out.println();
    }
}
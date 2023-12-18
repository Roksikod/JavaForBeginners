package ru.itmo.basics.lesson4.part2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    /*task 2 программу, которая считывает с клавиатуры длину массива
    (например, пользователь вводит цифру 4),
    затем пользователь вводит 4 числа
    и на новой строке выводится массив из 4 элементов
     */
        System.out.println("Введите длину массива");
        Scanner sc = new Scanner(System.in);
        int lengthArray = sc.nextInt();
        System.out.println("Array length: " + lengthArray);
        System.out.println("Введите числа своего массива");
        int[] numbers = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Result: " + Arrays.toString(numbers));

        /*task 1 отправляемся в методпроверки - отсортирован ли массив по возрастанию.
         */
        if (!arraySorted(numbers)) {
            System.out.println("Please, try again"); //отсортирован по возрастанию
        } else {
            System.out.println("OK"); //не отсортирован
        }

        /*task 3 */
        int[] numbers2 = changeNumbersLastFirst(numbers); // идем в метод, который меняет местами первый и последний элемент массива.
        System.out.println("Array 1: " + Arrays.toString(numbers));
        System.out.println("Array 2: " + Arrays.toString(numbers2));

        /*task 4.*/
        int num = getFirstUniqueNumber(numbers); //идем в метод поиска первого уникального числа
        System.out.println("Первое уникальное число в Array 1 такое: " + num);

        /*task 5. отсортируйте его. Используйте сортировку слиянием.*/
        int[] randomNumbers = getRandomNumbersArray(numbers); //заполняем массив случайными числами
        System.out.println("Созданный рандомный массив такой: " + Arrays.toString(randomNumbers));
        int[] sortedWithMergeArray = sortByMerge(randomNumbers); //отдаем его на сортировку слиянием
        System.out.println("Отсортированный слиянием рандомный массив такой: " + Arrays.toString(sortedWithMergeArray));
    }

    //5.2 сортировка слиянием
    private static int[] sortByMerge(int[] randomNumbers) {
        if (randomNumbers.length == 0 || randomNumbers.length == 1) {
            return randomNumbers;
        }
        int middle = randomNumbers.length / 2;  //делим массив на две части

        int[] leftArray = new int[middle]; //получаем левый массив

        int[] rightArray; // объявляем правый массив

        //находим длину правого массива - чтобы учесть четная-нечетная длина исходного
        if (randomNumbers.length % 2 == 0) {
            rightArray = new int[middle];
        } else {
            rightArray = new int[middle + 1];
        }

        //заполняем левый массив
        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = randomNumbers[i];
        }
        //заполняем правый массив
        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = randomNumbers[middle + i];
        }

        //отправляем их сортироваться самим - рекурсия
        leftArray = sortByMerge(leftArray);
        rightArray = sortByMerge(rightArray);

        return mergePartsToSort(leftArray, rightArray); //отправляем в метод слияния частей
    }

    //5.2.1 метод сливания отсортированных частей массива
    private static int[] mergePartsToSort(int[] leftArray, int[] rightArray) {
        int[] result = new int[leftArray.length + rightArray.length];

/*Первые элементы каждого подмассива сравниваются первыми.
Наименьший элемент перемещается в результирующий массив. Указатель "запоминает" индекс того элемента, который берем
Указатели результирующего массива и подмассива, откуда был взят элемент, увеличиваются на один.

 */
        int leftPointer = 0; //указатель левого массива
        int rightPointer = 0; //указатель правого массива
        int resultPointer = 0; //указатель результирующего массива

        while (leftPointer < leftArray.length || rightPointer < rightArray.length) { //пока есть элементы для слияния
            if (leftPointer < leftArray.length && rightPointer < rightArray.length) { //если есть элементы и в левом, и в правом
                if (leftArray[leftPointer] < rightArray[rightPointer]) { //если элемент по указателю в левом массиве меньше, чем в правом
                    result[resultPointer++] = leftArray[leftPointer++];  //берем его и увеличиваем указатель в результирующем и левом массиве
                } else {
                    result[resultPointer++] = rightArray[rightPointer++]; //или в правом и результирующем
                }
            } else if (leftPointer < leftArray.length) {  //если остались элементы только в левом, берем их
                result[resultPointer++] = leftArray[leftPointer++];
            } else if (rightPointer < rightArray.length) {  //если только в правом - добираем их
                result[resultPointer++] = rightArray[rightPointer++];
            }
        }
        return result;
    }


    //5.1 метод для заполнения массива рандомными числами
    private static int[] getRandomNumbersArray(int[] nums) {
        Random random = new Random();

        int[] randomNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            randomNums[i] = random.nextInt(100);
        }
        return randomNums;
    }

    //task 4 метод для поиска первого уникального числа
    private static int getFirstUniqueNumber(int[] array) {
        int result = array[0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    break;
                } else if (j == array.length - 1) {
                    return array[i];
                }
            }
        }
        return result;
    }

    //метод для task3
    private static int[] changeNumbersLastFirst(int[] numbers) {
        int[] numbersLastFirst = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbersLastFirst[i] = numbers[i];
        }
        int temp = numbersLastFirst[0];
        numbersLastFirst[0] = numbersLastFirst[numbers.length - 1];
        numbersLastFirst[numbers.length - 1] = temp;
        return numbersLastFirst;
    }

    //метод для task1
    private static boolean arraySorted(int[] nums) {
        if (nums.length == 1) {
            return true;
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    return false;
                }
            }
            return true;
        }
    }
}

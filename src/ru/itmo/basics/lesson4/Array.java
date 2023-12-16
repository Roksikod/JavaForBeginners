package ru.itmo.basics.lesson4;


import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] ints = new int[10];

        ints[0] = 20;
        ints[1] = 321;
        ints[2] = 202;
        ints[3] = 2302;
        ints[4] = 21;
        ints[5] = 220;


//        System.out.println(Arrays.toString(ints));
        //метод для выведения в строку всех элементов массива

        String[] strings = new String[5];
//        System.out.println(Arrays.toString(strings));
//
//        long[] longs = new long[]{123L, 321L, 333L};
//        System.out.println(Arrays.toString(longs));
        long[] longs2 = {123L, 322L, 333L};

//циклы.
//        for (int i = 0; i < longs2.length; i++) { //length - это НЕ МЕТОД!!! это переменная - обращение к полю!!!
//            if (longs2[i] % 2 == 0) {
//                System.out.println(longs2[i]);
//            }
//        }

        // int x = 0;
//        do {
//            System.out.println(++x);
//        } while (x != 10);
//        while (x != 5) {
//            x++;
//
//            if (x < 2) {
//                System.out.println(x);
//                continue;
//            }
//
//            System.out.println("next");
//
//            if (x == 3) {
//                break;
//            }
//
//        }

//        varargMethod(123, "Hello!");
//        varargMethod(123, "Hello!", "world", "!");
        System.out.println(Arrays.toString(ints));
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
//Сортируем , а потом поиск
        int i = Arrays.binarySearch(ints, 21);
        int y = Arrays.binarySearch(ints, 215);

        System.out.println(i);
        System.out.println(y);//Если индекс отрицательный, то скорее всего у вас выход за пределы массива

    }
    public static void varargMethod(Integer num, String... line) {
        for (String s : line) {
            // logic
            //Что именно будет передано, мы не знаем,
            // но метод сможет обработать и тот, и другой вариант.
            // Но параметр переменной длины всегда только один и он один
        }
    }
//    public static void  varargMethod(String... line, Integer num) {
//
//    }

//    public static void varargMethod(String... line, String... line2) {
//
//    }

}
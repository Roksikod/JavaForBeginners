package ru.itmo.basics.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //task1
        System.out.println("Вставьте текст ");
        String text = scanner.nextLine();
        String wordMaxLength = getTheLongestWord(text);
        System.out.println("В тексте максимальная длина у слов: " + "\n" + wordMaxLength);

        //task2
        System.out.println("Введите слово ");
        String word = scanner.nextLine();
        System.out.println(isPalindrom(word));

        //task3
        System.out.println("Введите текст для цензуры ");
        String textWithBadWord = scanner.nextLine();
        System.out.println(replaceSubstring(textWithBadWord, "БЯКА", "[вырезано цензурой]"));

        //task4
        System.out.print("Введите первую строку ");
        String string1 = scanner.nextLine();
        System.out.print("Введите подстроку ");
        String string2 = scanner.nextLine();
        Integer countIncluding = compareStrings(string1, string2);
        System.out.println(countIncluding);

        //task5
        System.out.println("Введите строку для инверсирования");
        String stringInvers = scanner.nextLine();
        System.out.println(reverseString(stringInvers));
        scanner.close();
    }

    //task1 метод для поиска самого длинного слова в тексте
    public static String getTheLongestWord(String text) {
        String[] words = text.split(" ");
        int maxLength = 0;
        String wordsMaxLength = "";
        //поиск максимальной длины
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + " " + words[i].length());
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
            }
        }
        //поиск слов с максимальной длиной
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == maxLength) {
                wordsMaxLength += words[i] + ", ";
            }
        }
        return wordsMaxLength.substring(0, wordsMaxLength.length() - 2);
    }

    //task2 метод, который проверяет является ли слово палиндромом
    public static boolean isPalindrom(String s) {
        s = s.replaceAll("[^A-Za-zА-Яа-я0-9]", ""); //удаляем все символы, кроме букв и цифр
        s = s.toLowerCase();    //переводим в нижний регистр
        String sInverted = new StringBuilder(s).reverse().toString(); //создаем перевертыш строки в нижнем регистре
        return s.equals(sInverted);  //возвращаем результат их сравнения по значению
    }

    //task3 метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]»
    public static String replaceSubstring(String text, String oldWord, String newWord) {
        //Бяка ела кулебяка мыла руки бякака
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            String temp = words[i];
            if (temp.toLowerCase().equals(oldWord.toLowerCase())) {
                words[i] = newWord;
            }
        }
        String newText = "";
        for (String word : words) {
            newText += word + " ";
        }
        return newText;
    }

    //task4 Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую
    private static int compareStrings(String string1, String string2) {
        int cnt = 0;
        String[] words = string1.split(" ");
        for (String word : words) {
            if (word.toLowerCase().contains(string2.toLowerCase())) {
                cnt++;
            }
        }
        return cnt;
    }

    //метод, который инвертирует слова в строке (в ней нет знаков препинания, и слова разделены пробелами)
    public static String reverseString(String str) {
        String[] words = str.split(" ");
        String newString = "";
        for (String word : words) {
            newString += new StringBuilder(word).reverse().toString() + " ";
        }
        return newString;
    }
}

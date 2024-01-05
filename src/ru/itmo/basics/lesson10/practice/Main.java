package ru.itmo.basics.lesson10.practice;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        File newFile = createNewFile();
        ArrayList<String> stringArrayList = getStringList(newFile); //task1
        System.out.println(stringArrayList);

        File fileToRead = new File("src/ru/itmo/basics/lesson10/practice/files/fileToRead.txt");
        System.out.println(getStringList(fileToRead));  //task1

        File fileToWrite = new File("src/ru/itmo/basics/lesson10/practice/files/fileToWrite.txt");
        addToMyFile("\nОн используется для записи текстовых файлов.", fileToWrite);  //task2
        System.out.println(getStringList(fileToWrite)); //посмотрим, как дозаписалось

        File fileToJoin = new File("src/ru/itmo/basics/lesson10/practice/files/fileToJoin.txt");
        joinFiles(fileToJoin, fileToWrite); //task 3 вот так можно к одному файлу приклеить второй
        System.out.println(getStringList(fileToJoin));

        File fileCommon = new File("src/ru/itmo/basics/lesson10/practice/files/fileCommon.txt");
        fileCommon = joinInNewFile(fileToRead, fileToWrite, fileCommon); //task 3  так можно записать в третий файл два файла
        System.out.println(getStringList(fileCommon));

        File fileToChange = new File("src/ru/itmo/basics/lesson10/practice/files/fileToChange.txt");//task4
        File fileAfterChange = new File("src/ru/itmo/basics/lesson10/practice/files/fileAfterChange.txt");
        changeCharacters(fileToChange, fileAfterChange);
        System.out.println(getStringList(fileAfterChange));
    }

    private static void changeCharacters(File fileInput, File fileOutput) throws IOException {
        BufferedReader bufferedReader;
        BufferedWriter bufferedWriter;

        bufferedReader = new BufferedReader(new FileReader(fileInput));
        bufferedWriter = new BufferedWriter(new FileWriter(fileOutput));

        String string;

        while ((string = bufferedReader.readLine()) != null)
        {
            bufferedWriter.write(string.replaceAll("[^а-яА-яa-zA-Z\\d]", "\\$"));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        bufferedReader.close();
    }


    //создаем файл
    public static File createNewFile() {
        try (FileWriter writer = new FileWriter("src/ru/itmo/basics/lesson10/practice/files/myFile.txt", false)) {
            String text = "Хотя с помощью ранее рассмотренных классов можно записывать текст в файлы, \n" +
                    "однако они предназначены прежде всего для работы с бинарными потоками данных, \n" +
                    "и их возможностей для полноценной работы с текстовыми файлами недостаточно. \n" +
                    "И для этой цели служат совсем другие классы, которые являются наследниками абстрактных классов Reader и Writer.";
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File myFile = new File("src/ru/itmo/basics/lesson10/practice/files/myFile.txt");
        return myFile;
    }

    //1.	Написать метод, который читает текстовый файл и возвращает его в виде списка строк.
    public static ArrayList<String> getStringList(File file) {
        ArrayList<String> stringList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String input;
            while ((input = bufferedReader.readLine()) != null) {
                stringList.add(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return stringList;
    }

    /*2.	Написать метод, который записывает в файл строку, переданную параметром.     */
    private static void addToMyFile(String text, File file) {
        //Параметр append true - дозапись в конец файла, false - перезапись
        try (FileWriter writer = new FileWriter(file, true)) {
            // запись всей строки
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //3.1	Используя решение 1 и 2, напишите метод, который склеивает два текстовый файла один.
    public static void joinFiles(File file1, File file2) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(file1);// сначала считываем первый файл
        int file1Data = 0;
        byte[] buffer1 = new byte[fileInputStream.available()];
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read(buffer1);
            file1Data = data; // и записываем в какой-то буффер
        }

        FileOutputStream fileOutputStream = new FileOutputStream(file1);// открыт поток для записи в 1 файл
        FileInputStream fileInputStream2 = new FileInputStream(file2); // открыт поток для чтения 2 файл
        while (fileInputStream2.available() > 0) {
            int dt = fileInputStream2.read();
            fileOutputStream.write(dt);
        } // перекидываем данные из файла 2 в файл один

        fileOutputStream.write(buffer1, 0, file1Data); //дописываем данные из буффера
        fileInputStream2.close();
        fileInputStream.close();
        fileOutputStream.close();

    }

    //3.2	Используя решение 1 и 2, напишите метод, который склеивает два текстовый файла один.
    private static File joinInNewFile(File file1, File file2, File fileCommon) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream(fileCommon);// открыт поток для записи
        FileInputStream fileInputStream1 = new FileInputStream(file1);// сначала туда пишем 1й файл

        while (fileInputStream1.available() > 0) {
            fileOutputStream.write(fileInputStream1.read());
        }

        FileInputStream fileInputStream2 = new FileInputStream(file2);// считываем  и пишем 2й файл
        while (fileInputStream2.available() > 0) {
            fileOutputStream.write(fileInputStream2.read());
        }
        if (fileInputStream1 != null && fileInputStream2 != null && fileOutputStream != null) {
            fileInputStream1.close();
            fileInputStream2.close();
            fileOutputStream.close();
        }
        return fileCommon;
    }



/*
4.	Написать метод который заменяет в файле все кроме букв и цифр на знак ‘$’
*/
}
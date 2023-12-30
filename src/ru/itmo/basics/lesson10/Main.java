package ru.itmo.basics.lesson10;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        File file = new File("files/img.png.png");
//        File file2 = new File("files/output.txt.txt");

//        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
//            String input;
//            while ((input = reader.readLine()) != null) {
//                System.out.println(input);
//            }
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }


//        InputStream is = null;
//        OutputStream os = null;
//
//        try {
//            is = new FileInputStream(file);
//            os = new FileOutputStream(file2);
//
//            while (is.available() > 0) {
//                os.write(is.read());
//            }
//
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//
//        } finally {
//            try {
//                if (is != null) {
//                    is.close();
//                }
//
//                if (os != null) {
//                    os.close();
//                }
//
//            } catch (IOException e) {
//                System.err.println(e.getMessage());
//            }
//        }

        //apache POI


//        writeData(List.of("Java", "programming", "language"), file, "files/output2.txt.txt");

        //nio

        Path path = Paths.get("C:\\Users\\user");

//        File[] files = path.toFile().listFiles();
//        if (files != null) {
//            for (File f : files) {
//                System.out.println(f.getName());
//            }
//        }

//        double totalSpace = path.toFile().getTotalSpace() / 1_000_000_000.0;
//
//        String space = new DecimalFormat("#.##").format(totalSpace);
//        System.out.println(space + "GB");


        System.out.println(path.getFileSystem());
    }


    public static void writeData(List<String> strings, File file, String pathToOutput) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             BufferedWriter writer = new BufferedWriter(new FileWriter(pathToOutput))) {

            String input;

            while ((input = reader.readLine()) != null) {
                for (String string : strings) {
                    writer.write(string + input);
                }
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
package ru.itmo.basics.lesson11.factory;

public class Main {
    public static void main(String[] args) {
//      DocumentConverter converter1 = new PdfConverter();
//      DocumentConverter converter2 = new CsvConverter();
//      DocumentConverter converter3 = new DocxConverter();
//
//      converter1.convertFile();
//      converter2.convertFile();
//      converter3.convertFile();

        DocumentConverterFactory documentConverterFactory = createConverterFactoryByFormat("docx");
        DocumentConverter converter = documentConverterFactory.createConverter();
        converter.convertFile();

    }

    public static DocumentConverterFactory createConverterFactoryByFormat(String format) {

        if (format.equalsIgnoreCase("csv")) {
            return new CsvConverterFactory();
        } else if (format.equalsIgnoreCase("pdf")) {
            return new PdfConverterFactory();
        } else if (format.equalsIgnoreCase("docx")) {
            return new DocxConverterFactory();
        } else {
            throw new RuntimeException("Wrong format: " + format);
        }
    }
}
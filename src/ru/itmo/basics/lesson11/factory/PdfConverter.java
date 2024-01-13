package ru.itmo.basics.lesson11.factory;

public class PdfConverter implements DocumentConverter{
    @Override
    public void convertFile() {
        System.out.println("Converting to pdf...");
    }
}

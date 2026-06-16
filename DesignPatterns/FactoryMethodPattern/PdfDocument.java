package DesignPatterns.FactoryMethodPattern;

public class PdfDocument extends Document {

    @Override
    public void open() {
        System.out.println("PDF Document Opened Successfully");
    }
}
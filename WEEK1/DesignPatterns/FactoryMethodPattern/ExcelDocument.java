package DesignPatterns.FactoryMethodPattern;

public class ExcelDocument extends Document {

    @Override
    public void open() {
        System.out.println("Excel Document Opened Successfully");
    }
}
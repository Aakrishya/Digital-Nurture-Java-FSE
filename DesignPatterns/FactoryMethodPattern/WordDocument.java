package DesignPatterns.FactoryMethodPattern;

public class WordDocument extends Document {

    @Override
    public void open() {
        System.out.println("Word Document Opened Successfully");
    }
}
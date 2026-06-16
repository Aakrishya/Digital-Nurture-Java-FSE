package DesignPatterns.FactoryMethodPattern;

public class Main {

    public static void main(String[] args) {

        DocumentFactory factory = new DocumentFactory();

        factory.createDocument("word").open();
        factory.createDocument("pdf").open();
        factory.createDocument("excel").open();
    }
}
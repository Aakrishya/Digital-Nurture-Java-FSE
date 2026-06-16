package WEEK1.DesignPatterns.SingletonPattern;

public class Logger {

    // Single object of Logger class
    private static Logger logger;

    // Private constructor
    private Logger() {
        System.out.println("Logger Instance Created");
    }

    // Method to get the single object
    public static Logger getInstance() {

        if (logger == null) {
            logger = new Logger();
        }

        return logger;
    }

    // Logging method
    public void log(String message) {
        System.out.println("Log Message : " + message);
    }
}
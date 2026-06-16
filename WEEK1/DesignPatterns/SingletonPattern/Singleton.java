public class Singleton {

    private static Singleton object;

    private Singleton() {
        System.out.println("Object Created");
    }

    public static Singleton getInstance() {

        if (object == null) {
            object = new Singleton();
        }

        return object;
    }

    public void display() {
        System.out.println("Singleton Pattern Example");
    }

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.display();

        if (s1 == s2) {
            System.out.println("Only One Object Exists");
        }
    }
}
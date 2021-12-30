package lab_9;

public class Main {

    public static void main(String[] args) throws Exception {
        Exception1 a = new Exception1();
        a.exceptionDemo();
        Exception2 b = new Exception2();
        b.exceptionDemo();
        ThrowsDemo c = new ThrowsDemo();
        c.getKey();
        c.printMessage("123");
    }
}

package lab_9;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        try {
            Scanner field = new Scanner(System.in);
            System.out.println("Введите целое число: ");
            String intToString = field.nextLine();
            int i = Integer.parseInt(intToString);
            System.out.println(2 / i);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        }
        catch(NumberFormatException e){
            System.out.println("Введите целое число");
        }
        finally {
            System.out.println("Успешно");
        }
    }
}
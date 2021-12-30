package lab_9;

import java.util.Scanner;

public class ThrowsDemo {

    public void getKey() {
        int i = 0;
        System.out.print(1 + " ");
        while (i < 2) {
            try {
                Scanner field = new Scanner(System.in);

                String key = field.nextLine();
                printDetails(key);
                i=2;
            } catch (Exception e) {
                i = i - 1;
                System.out.println("Введенно пустое поле");
            }
        }
    }

    public void printDetails(String key) throws Exception{
        try {
            String message = getDetails(key);
            System.out.println(message);
        }
        catch (Exception e){
            throw e;
        }
    }

    public void printMessage (String key) throws Exception{
        String message = getDetails(key);
        System.out.println(message);
    }

    public String getDetails(String key) throws Exception{
        //try {
        if (key.equals("")) {
            throw new NullPointerException("ключ является пустым");
        }
        return "Данные для " + key;
    }

}
package practice;

import static java.lang.System.out;

public class PrimitiveType {
    private static System system;
    public static void main(String[] args) {
        //Double primitive type practice

        double doubleMinValue =Double.MIN_VALUE;
        System.out.println(doubleMinValue);

        double doubleMaxValue =Double.MAX_VALUE;
        System.out.println(doubleMaxValue);

        double doubleValue = 1337.13;
                out.println(doubleValue);
    // Float primitive type practice
        float floatMinValue =Float.MIN_VALUE;
                out.println(floatMinValue);
        float floatMaxValue =Float.MAX_VALUE;
        System.out.println(floatMaxValue);
        float floatValue = 1000.1f;
                //Long primitive type practice
        //Int primitive type practice
        int minIntValue = Integer.MIN_VALUE;
        System.out.println(minIntValue);

        int maxIntValue = Integer.MAX_VALUE;
        System.out.println(maxIntValue);
        int firstVariable = 200;
        int secoundVariable = 400;
        System.out.println(Integer.max(firstVariable,secoundVariable));

// Method call
        printHelloWorld();
        //String
        String myName = "myName ";
        System.out.println("Kristina");
        String lastName = "lastName";
        System.out.println("Jefimova");


        String nameAndLastname = myName + lastName;
    }
    // Method declaration
    public static void printHelloWorld(){
        System.out.println("Hello World");
    }
}

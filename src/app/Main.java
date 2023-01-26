package app;
import java.util.Scanner;

public class Main {

    static int a;
    static int b;

    public static void main(String[] args) {
        System.out.println("Calculator for base calculations");
        System.out.println("Version 1.0");
        initVars();
        doCalc();
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int subtract(int a, int b) {
        return a - b;
    }
    private static int divide(int a, int b) {
        return a / b;
    }

    private static void initVars() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        a = sc.nextInt();
        System.out.println("Enter b:");
        b = sc.nextInt();
        sc.close();
    }

    private static void doCalc() {
        System.out.printf("Added: %d\n" +
                "Multiplied: %d\n" +
                "Subtracted: %d\n" +
                "Divided: %d", add(a, b), multiply(a, b), subtract(a, b), divide(a, b));
    }
}

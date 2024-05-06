package org.example;

public class Question3 {
    public static void main(String[] args) {

        ifStatement(12);
        switchStatement(20);
        loops();
        nestedLoops();
        whileLoop();
    }

    public static void ifStatement(int age) {
        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a minor");
        }
    }

    public static void switchStatement(int age) {
        switch(age) {
            case 2:
            case 12:
                System.out.println("You are a child");
                break;
            case 13:
            case 19:
                System.out.println("You are a teenager");
                break;
            case 20:
            case 59:
                System.out.println("You are an adult");
                break;
            case 60:
                System.out.println("You are a senior citizen");
                break;
            default:
                System.out.println("Invalid age");
        }
    }

    public static void loops() {
        for (int i= 1; i<11; i++) {
            System.out.println(i);
        }
    }

    public static void nestedLoops() {
        for (int i = 0; i<10; i++) {
            for (int j = 0; j<10; j++) {
                System.out.println('x');
            }
            System.out.println();
        }
    }

    public static void whileLoop() {
        int z = 10;
        while (z != 0) {
            System.out.println(z);
            z--;
        }

    }
}

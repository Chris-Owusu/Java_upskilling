package org.example;

public class Question3 {
    public static void main(String[] args) {

        ifStatement(12);
        switchStatement(20);
        loops();
        nestedLoops(5);
        whileLoop();
    }

    // If statements
    public static void ifStatement(int age) {
        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a minor");
        }
    }

    //Switch statements
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

    // Loops
    public static void loops() {
        for (int i= 1; i<11; i++) {
            System.out.println(i);
        }
    }

    // Nested for loops --> drawing a square
    public static void nestedLoops(int size) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 8; j++) {
                System.out.print('x');
            }
            System.out.println();
        }
    }

    // While loop
    public static void whileLoop() {
        int z = 10;
        while (z != 0) {
            System.out.println(z);
            z--;
        }

    }
}

package com.gierat.anna.finallyCheck;

public class Main {

    public static void main(String[] args) {


    }

    public static int method() {
        int[] array = new int[10];
        array[9] = 8;
        array[1] = 2;

        try {
            System.out.println(array[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Poza indeksem");
        } finally {
            System.out.println("Koniec");
        }
        return 0;
    }
}

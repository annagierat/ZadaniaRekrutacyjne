package com.gierat.anna.equalsAznakRownosci;

public class Main {

    public static void main(String[] args) {

        Palac palac = new Palac("A");
        Domek domek = new Domek("A");


//        System.out.println(palac.equals(domek));
//        System.out.println(palac. == domek);

        String a = "A";
        String b = new String("A");
        String c = "A";

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        System.out.println(a == b);
        System.out.println(a == c);
    }
}

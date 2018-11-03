package com.gierat.anna;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Tests {

    public void dzielniki(){
    System.out.println("Wprowadz liczbę: ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    List<Integer> array = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
        if (i % 3 == 0 )
            array.add(i);
    }

            System.out.println(array);


}


    public Integer sum(Integer n) {

        Integer suma = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                suma += i;
            }
        }

        return suma;
    }


    public int max  (Array array){

        int [] newArray = { 1, 59, 2, 6, 24, 120, 500, 120 };
        Arrays.sort(newArray);
        int max = newArray[newArray.length-1];

        return max;
    }

    public int max1  (Array array){

        int [] newArray = { 1, 59, 2, 6, 24, 120, 500, 120 };

        int max = 0;
        for (int i = 0; i < newArray.length ; i++) {
            if (newArray[i] > max) {
                max = newArray[i];
            }
        }
        return max;
    }

    public String palindrome(String a){
        Scanner scanner = new Scanner(System.in);
        String newString = scanner.nextLine();
        int lenString = newString.length();
        String palindrome = "";
        for (int i = lenString-1; i >= 0; i--) {
            palindrome += newString.charAt(i);
        }return palindrome;
    }


}

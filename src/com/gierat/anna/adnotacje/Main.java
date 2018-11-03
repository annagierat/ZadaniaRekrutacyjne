package com.gierat.anna.adnotacje;

import java.lang.annotation.Annotation;

@MojaPierwszaAdnotacja(to="hello")

public class Main {
    public static void main(String[] args) {
        Class aClass = Main.class;
        Annotation[] annotations = aClass.getAnnotations();
        for (Annotation annotation : annotations){
            MojaPierwszaAdnotacja adnotacja = (MojaPierwszaAdnotacja)annotation;
            System.out.println("Argument : " + adnotacja.to());
            String file = adnotacja.to();
        }
    }



}

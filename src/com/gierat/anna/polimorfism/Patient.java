package com.gierat.anna.polimorfism;

import javafx.scene.control.PasswordField;

public class Patient extends Person {
    public String pesel;

    public static void main(String[] args) {


        Patient patient = new Patient();
        Person patient2 = new Patient();

        patient.name = "Marian";
        patient.surname = "Kowalski";
        patient.pesel = "88121645692";


        patient2.name = "Helena";
        patient2.surname = "Kowalska";
        ((Patient) patient2).pesel = "44552265987";
    }
}

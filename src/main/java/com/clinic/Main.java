package com.clinic;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient(2);
        Therapist therapist = new Therapist();
        therapist.selectDoctor(patient);
    }
}

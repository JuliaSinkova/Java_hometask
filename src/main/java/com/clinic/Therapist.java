package com.clinic;

public class Therapist extends Doctor {
    public void treat() {
        System.out.println("Therapist treats!");

    }

    public void selectDoctor(Patient patient) {
        int code = patient.getTreatmentPlanCode();
        switch (code) {
            case 1 -> patient.setDoctor(new Surgeon());
            case 2 -> patient.setDoctor(new Dentist());
            default -> patient.setDoctor(new Therapist());
        }
        patient.doctor.treat();
    }
}

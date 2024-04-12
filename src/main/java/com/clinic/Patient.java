package com.clinic;

public class Patient {
    public Doctor doctor;
    private final int treatmentPlanCode;

    public Patient(int code) {
        this.treatmentPlanCode = code;
    }

    public int getTreatmentPlanCode() {
        return treatmentPlanCode;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

}

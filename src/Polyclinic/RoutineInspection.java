package Polyclinic;

import java.time.LocalDate;

public class RoutineInspection extends MedicalService  {

    public enum InspectionKind {
        Outpatient,
        Inpatient
    }

    private InspectionKind kind; // Вид
    private int year; // Год
    private int validity; // Период действия
    private String result; // Результат

    public RoutineInspection(String clinicName, String clinicAddress, String patientLastName, int patientPolicyNumber, LocalDate appointmentDate) {
        super(clinicName, clinicAddress, patientLastName, patientPolicyNumber, appointmentDate);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Вид: " + kind + System.lineSeparator() +
                "Год: " + year + System.lineSeparator() +
                "Период действия: " + validity + System.lineSeparator() +
                "Результат: " + result + System.lineSeparator();

    }

    @Override
    public String toSmallString() {
        return super.toSmallString() +  "', '" +
                kind +  "', '" +
                year +  "', '" +
                validity +  "', '" +
                result;
    }

    public InspectionKind getKind() {
        return kind;
    }

    public void setKind(InspectionKind kind) {
        this.kind = kind;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getValidity() {
        return validity;
    }

    public void setValidity(int validity) {
        this.validity = validity;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}

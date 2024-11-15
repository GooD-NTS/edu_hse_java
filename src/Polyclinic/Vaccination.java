package Polyclinic;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

public class Vaccination extends MedicalService {

    private String vaccineName;
    private LocalDate vaccinationDate;
    private int validity; // Период действия

    public Vaccination() {

    }

    public Vaccination(String clinicName, String clinicAddress, String patientLastName, int patientPolicyNumber, LocalDate appointmentDate) {
        super(clinicName, clinicAddress, patientLastName, patientPolicyNumber, appointmentDate);

        this.setVaccinationDate(appointmentDate);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Вакцина: " + vaccineName + System.lineSeparator() +
                "Год вакцинации: " + vaccinationDate + System.lineSeparator() +
                "Период действия: " + validity + System.lineSeparator();
    }

    @Override
    public String toSmallString() {
        return super.toSmallString() +  "', '" +
                vaccineName +  "', '" +
                vaccinationDate +  "', '" +
                validity;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public LocalDate getVaccinationDate() {
        return vaccinationDate;
    }

    public void setVaccinationDate(LocalDate vaccinationDate) {
        this.vaccinationDate = vaccinationDate;
    }

    public int getValidity() {
        return validity;
    }

    public void setValidity(int validity) {
        this.validity = validity;
    }
}

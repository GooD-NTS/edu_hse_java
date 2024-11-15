package Polyclinic;

import java.time.LocalDate;

public class ChildMedicalService extends MedicalService {

    public enum ChildGender {
        Male,
        Female
    }

    private int birthCertificateNumber;
    private ChildGender childGender;
    private int ChildAge;

    public ChildMedicalService(String clinicName, String clinicAddress, String patientLastName, int patientPolicyNumber, LocalDate appointmentDate) {
        super(clinicName, clinicAddress, patientLastName, patientPolicyNumber, appointmentDate);

    }

    @Override
    public String toString() {
        return super.toString() +
                "Свидетельство о рождении: " + birthCertificateNumber + System.lineSeparator() +
                "Пол: " + childGender + System.lineSeparator() +
                "Возраст: " + ChildAge + System.lineSeparator();

    }

    @Override
    public String toSmallString() {
        return super.toSmallString() +  "', '" +
                birthCertificateNumber +  "', '" +
                childGender +  "', '" +
                ChildAge;
    }

    public int getBirthCertificateNumber() {
        return birthCertificateNumber;
    }

    public void setBirthCertificateNumber(int birthCertificateNumber) {
        this.birthCertificateNumber = birthCertificateNumber;
    }

    public ChildGender getChildGender() {
        return childGender;
    }

    public void setChildGender(ChildGender childGender) {
        this.childGender = childGender;
    }

    public int getChildAge() {
        return ChildAge;
    }

    public void setChildAge(int childAge) {
        ChildAge = childAge;
    }
}

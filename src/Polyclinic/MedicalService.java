package Polyclinic;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.time.LocalDate;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = RoutineInspection.class, name = "RoutineInspection"),
        @JsonSubTypes.Type(value = Vaccination.class, name = "Vaccination"),
        @JsonSubTypes.Type(value = ChildMedicalService.class, name = "ChildMedicalService")
})
public class MedicalService {

    private String clinicName; // название поликлиники
    private String clinicAddress; // адрес поликлиники

    private String patientLastName; // фамилия пациента
    private int patientPolicyNumber; // номер полиса
    private LocalDate appointmentDate; // дата осмотра

    private String doctorLastName; // фамилия врача
    private String doctorPosition; // должность врача

    private String diagnosis; // диагноз

    public MedicalService() {

    }

    public MedicalService(String clinicName, String clinicAddress, String patientLastName,
                          int patientPolicyNumber, LocalDate appointmentDate) {
        this.setClinicName(clinicName);
        this.setClinicAddress(clinicAddress);

        this.setPatientLastName(patientLastName);
        this.setPatientPolicyNumber(patientPolicyNumber);

        this.setAppointmentDate(appointmentDate);
    }

    @Override
    public String toString() {
        return "|" + this.getClass().getName() + "|" + System.lineSeparator() +
               "Медицинское обслуживание:" + System.lineSeparator() +
               "Название поликлиники: " + clinicName + System.lineSeparator() +
               "Адрес поликлиники: " + clinicAddress + System.lineSeparator() +
               "Фамилия пациента: " + patientLastName + System.lineSeparator() +
               "Номер полиса: " + patientPolicyNumber + System.lineSeparator() +
               "Дата осмотра: " + appointmentDate + System.lineSeparator() +
               "Фамилия врача: " + doctorLastName + System.lineSeparator() +
               "Должность врача: " + doctorPosition + System.lineSeparator() +
               "Диагноз: " + diagnosis + System.lineSeparator();
    }

    public String toSmallString() {
        return "|" + this.getClass().getName() + "| " + clinicName +  "', '" +
               clinicAddress + "', '" +
               patientLastName + "', '" +
               patientPolicyNumber + "', '" +
               appointmentDate + "', '" +
               doctorLastName + "', '" +
               doctorPosition + "', '" +
               diagnosis;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public String getClinicAddress() {
        return clinicAddress;
    }

    public void setClinicAddress(String clinicAddress) {
        this.clinicAddress = clinicAddress;
    }

    public String getPatientLastName() {
        return patientLastName;
    }

    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }

    public int getPatientPolicyNumber() {
        return patientPolicyNumber;
    }

    public void setPatientPolicyNumber(int patientPolicyNumber) {
        this.patientPolicyNumber = patientPolicyNumber;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getDoctorLastName() {
        return doctorLastName;
    }

    public void setDoctorLastName(String doctorLastName) {
        this.doctorLastName = doctorLastName;
    }

    public String getDoctorPosition() {
        return doctorPosition;
    }

    public void setDoctorPosition(String doctorPosition) {
        this.doctorPosition = doctorPosition;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}

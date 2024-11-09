//Задание 5
//Создать программу на языке Java для определения класса в некоторой предметной области.
//Описать свойства, конструктор, методы геттеры/сеттеры, перекрыть метод toString() для вывода
//полной информации об объекте в отформатированном виде:
//к - Конструктор

//13). Медицинское обслуживание
//
//Polyclinic:
//Свойства:
//название поликлиники; к
//адрес поликлиники; к
//фамилия пациента; к
//номер полиса; к
//дата осмотра; к
//фамилия врача;
//должность врача;
//диагноз;

package Polyclinic;

import java.time.LocalDate;

public class Polyclinic {

    private String clinicName; // название поликлиники
    private String clinicAddress; // адрес поликлиники

    private String patientLastName; // фамилия пациента
    private int patientPolicyNumber; // номер полиса
    private LocalDate appointmentDate; // дата осмотра

    private String doctorLastName; // фамилия врача
    private String doctorPosition; // должность врача

    private String diagnosis; // диагноз

    public Polyclinic(String clinicName, String clinicAddress, String patientLastName,
                      int patientPolicyNumber, LocalDate appointmentDate) {
        this.setClinicName(clinicName);
        this.setClinicAddress(clinicAddress);

        this.setPatientLastName(patientLastName);
        this.setPatientPolicyNumber(patientPolicyNumber);

        this.setAppointmentDate(appointmentDate);
    }

    @Override
    public String toString() {
        return "Медицинское обслуживание:" + System.lineSeparator() +
               "Название поликлиники: " + clinicName + System.lineSeparator() +
               "адрес поликлиники: " + clinicAddress + System.lineSeparator() +
               "фамилия пациента: " + patientLastName + System.lineSeparator() +
               "номер полиса: " + patientPolicyNumber + System.lineSeparator() +
               "дата осмотра: " + appointmentDate + System.lineSeparator() +
               "фамилия врача: " + doctorLastName + System.lineSeparator() +
               "должность врача: " + doctorPosition + System.lineSeparator() +
               "диагноз: " + diagnosis + System.lineSeparator();
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

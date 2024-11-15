package Polyclinic;

import java.util.ArrayList;
import java.util.Comparator;


public class MedicalServiceStorage {

    private ArrayList<MedicalService> data;

    public MedicalServiceStorage() {
        data = new ArrayList<MedicalService>();
    }

    public void print() {
        for (var item : data) {
            System.out.println(item.toSmallString() + System.lineSeparator());
        }
    }

    public void sort(MedicalServiceSortBy sortBy) {
        switch (sortBy) {
            case PatientName -> {
                data.sort((o1, o2) -> (o1.getPatientLastName().compareToIgnoreCase(o2.getPatientLastName())));
                break;
            }
            case ClinicName -> {
                data.sort((o1, o2) -> (o1.getClinicName().compareToIgnoreCase(o2.getClinicName())));
                break;
            }
            case AppointmentDate -> {
                data.sort(Comparator.comparing(MedicalService::getAppointmentDate));
                break;
            }
        }
    }

    public void add(MedicalService item) {
        data.add(item);
    }
}

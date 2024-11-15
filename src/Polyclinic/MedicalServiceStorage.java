package Polyclinic;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

public class MedicalServiceStorage {
    private ArrayList<MedicalService> data;

    public MedicalServiceStorage() {
        data = new ArrayList<MedicalService>();
    }

    public void SaveToFile() throws JsonProcessingException, IOException {
        var mapper = new ObjectMapper();
        mapper.findAndRegisterModules();

        var sb = new StringBuilder();
        sb.append("[\n");
        var skipFirst = true;
        for (var item : data) {
            if (skipFirst)
            {
                skipFirst = false;
            }
            else
            {
                sb.append(", \n");
            }
            var itemJSON = mapper.writeValueAsString(item);
            sb.append(itemJSON);
        }
        sb.append("\n]");
        var json = sb.toString();

        var filePath = Paths.get("MedicalServiceStorage.json");
        Files.writeString(filePath, json, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }

    public void LoadFromFile() throws IOException {
        var filePath = Paths.get("MedicalServiceStorage.json");
        var json = Files.readString(filePath);

        var mapper = new ObjectMapper();
        mapper.findAndRegisterModules();

        data = mapper.readValue(json, mapper.getTypeFactory().constructCollectionType(ArrayList.class, MedicalService.class));
    }

    public void print() {
        for (var item : data) {
            System.out.println(item.toSmallString());
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

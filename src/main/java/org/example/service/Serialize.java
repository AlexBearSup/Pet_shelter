package org.example.service;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.Animal;

import java.io.File;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

public class Serialize {
    String filePath = "src/main/resources/";
    String fileNameForWork = "ListOfAnimalInShelter.json";
    ObjectMapper jsonMapper = new ObjectMapper();

    public void serializeAnimals (List<Animal> animals){
        try{
            jsonMapper.writeValue(new File(filePath + fileNameForWork), animals);
        } catch (IOException e){
            System.out.println("Failed to save file !!!" + e.getMessage());
        }
    }
    public List<Animal> deserializeAnimals () {
        try{
            return jsonMapper.readValue(new File(filePath + fileNameForWork), new TypeReference<>() {});
        } catch (IOException e) {
//            System.out.println("File with list is empty");
            return new ArrayList<>();
        }
    }
}

package org.example.service;

import org.example.model.Animal;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SerializeTest {
    private final String filePath = "src/main/resources/";
    private final String fileNameForWork = "ListOfAnimalInShelter.json";
    private Serialize serialize = new Serialize();
    private List<Animal> animals = new ArrayList<>(
            Arrays.asList(new Animal("sharik","dog",5),
                    new Animal("murka","cat",3),
                    new Animal("bulka","fish",5)
            ));
    @Test
    public void testSerializeAnimals(){
        serialize.serializeAnimals(animals);
        File file = new File(filePath+fileNameForWork);
        assertEquals(true,file.exists());
    }

    @Test
    public void testDeserializeAnimals(){
        serialize.serializeAnimals(animals);
        List<Animal> deserialize =  serialize.deserializeAnimals();
        assertEquals(animals,deserialize);
    }
}

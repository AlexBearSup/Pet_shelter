package org.example.service;

import org.example.SelectAction;
import org.example.model.Animal;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SelectActionTest {
    private List<Animal> animals = new ArrayList<>();
    SelectAction selectAction = new SelectAction(animals);

    @Test
    public void testShowAllAnimalsEmptyList() {
        assertEquals(true,animals.isEmpty());
    }
    @Test
    public void testShowAllAnimalsNonEmptyList() {
        animals.add(new Animal("sharik", "dog", 3));
        animals.add(new Animal("Murka", "cat", 5));
        assertEquals(2,animals.size());

    }
}

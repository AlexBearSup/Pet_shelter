package org.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Animal {
    private String name;
    private String breed;
    private int age;

    public Animal( @JsonProperty("name") String name,
                   @JsonProperty("breed") String breed,
                   @JsonProperty("age") int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Animal)) return false;
        final Animal other = (Animal) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$breed = this.getBreed();
        final Object other$breed = other.getBreed();
        if (this$breed == null ? other$breed != null : !this$breed.equals(other$breed)) return false;
        if (this.getAge() != other.getAge()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Animal;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $breed = this.getBreed();
        result = result * PRIME + ($breed == null ? 43 : $breed.hashCode());
        result = result * PRIME + this.getAge();
        return result;
    }

    public String toString() {
        return "Animal(name=" + this.getName() + ", breed=" + this.getBreed() + ", age=" + this.getAge() + ")";
    }
}


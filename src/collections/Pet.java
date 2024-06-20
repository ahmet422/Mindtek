package collections;

import java.util.Objects;

public class Pet extends Object {
    private String type;
    private String name;
    private int age;

    public Pet(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && Objects.equals(type, pet.type) && Objects.equals(name, pet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name, age);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

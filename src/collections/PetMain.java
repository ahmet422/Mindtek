package collections;

import java.util.HashSet;
import java.util.Set;

public class PetMain {
    public static void main(String[] args) {
        Pet catLeo = new Pet("cat","Leo",3);
        Pet cat = new Pet("cat","Leo",33);

        boolean areSame = cat.equals(catLeo);
        System.out.println(areSame);
        System.out.println(catLeo.hashCode());
        System.out.println(cat.hashCode());

        Set<Pet> pets = new HashSet<>();
        pets.add(catLeo);
        pets.add(cat);
        System.out.println(pets);
    }
}

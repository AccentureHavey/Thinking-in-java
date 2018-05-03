package src.typeinfo;

import src.typeinfo.*;
import src.net.mindview.util.*;
import src.typeinfo.pets.Pet;
import src.typeinfo.pets.Pets;

public class PetCount4 {

    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for (Pet pet : Pets.createArray(20)) {
            System.out.println(pet.getClass().getSimpleName()+" ");
            counter.count(pet);
        }

        System.out.println(counter);
    }
}

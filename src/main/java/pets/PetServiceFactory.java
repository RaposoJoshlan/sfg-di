package pets;

import pets.CatPetService;
import pets.DogPetService;
import pets.PetService;

public class PetServiceFactory {

    public PetService getPetService(String petType) {
        switch (petType) {
            case "dog" :
                return new DogPetService();
            case "cat" :
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}

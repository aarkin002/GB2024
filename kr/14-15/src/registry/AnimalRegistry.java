package registry;
import model.*;


import java.util.ArrayList;
import java.util.List;

public class AnimalRegistry {
    public int getIntNumber() {
        return intNumber;
    }

    private int intNumber = 0;

    private List<Animal> catsList;
    private List<Animal> dogsList;

    private List<Animal> hamstersList;
    private List<Animal> camelsList;
    private List<Animal> donhkeysList;
    private List<Animal> horsesList;

    public AnimalRegistry(List<Animal> catsList, List<Animal> dogsList, List<Animal> hamstersList, List<Animal> camelsList, List<Animal> donhkeysList, List<Animal> horsesList) {
        this.catsList = catsList;
        this.dogsList = dogsList;
        this.hamstersList = hamstersList;
        this.camelsList = camelsList;
        this.donhkeysList = donhkeysList;
        this.horsesList = horsesList;
    }

    public List<Animal> getCatsList() {   return catsList;    }
    public List<Animal> getDogsList() {        return dogsList;    }
    public List<Animal> getHamstersList() {        return hamstersList;    }
    public List<Animal> getCamelsList() {        return camelsList;    }
    public List<Animal> getDonhkeysList() {        return donhkeysList;    }
    public List<Animal> getHorsesList() {        return horsesList;    }



    public void addAnimal(String animalName, String birthday, List<String> cmd, Type typeAnimal) {
        this.intNumber += 1;
        int id = getFreeId(typeAnimal);
        if (Type.CATS == typeAnimal) {
            Animal animal = new Animal(animalName, birthday, cmd, id, typeAnimal);
            catsList.add(animal);
        }
        if (Type.DOGS == typeAnimal) {
            Animal animal = new Animal(animalName, birthday, cmd, id, typeAnimal);
            dogsList.add(animal);
        }
        if (Type.HAMSTERS == typeAnimal) {
            Animal animal = new Animal(animalName, birthday, cmd, id, typeAnimal);
            hamstersList.add(animal);
        }
        if (Type.CAMELS == typeAnimal) {
            Animal animal = new Animal(animalName, birthday, cmd, id, typeAnimal);
            camelsList.add(animal);
        }
        if (Type.DONHKEYS == typeAnimal) {
            Animal animal = new Animal(animalName, birthday, cmd, id, typeAnimal);
            donhkeysList.add(animal);
        }
        if (Type.HORSES == typeAnimal) {
            Animal animal = new Animal(animalName, birthday, cmd, id, typeAnimal);
            horsesList.add(animal);
        }
    }


    private int getFreeId(Type typeAnimal){
        int lastId = 1;
        if (typeAnimal == Type.CATS){
            lastId = getCatsList().size() + 1;
        }
        if (typeAnimal == Type.DOGS){
            lastId = getDogsList().size() + 1;
        }
        if (typeAnimal == Type.HAMSTERS){
            lastId = getHamstersList().size() + 1;
        }
        if (typeAnimal == Type.CAMELS){
            lastId = getCamelsList().size() + 1;
        }
        if (typeAnimal == Type.DONHKEYS){
            lastId = getDonhkeysList().size() + 1;
        }
        if (typeAnimal == Type.HORSES){
            lastId = getHorsesList().size() + 1;
        }
        return lastId;
    }

    public Animal getAnimalForId(int id, Type typeAnimal){
        Animal tmpAnimal = null;
        if (typeAnimal == Type.CATS){
            for(Animal animal: getCatsList()){
                if(animal.getId() == id){
                    tmpAnimal = animal;
                }
            }
        }
        if (typeAnimal == Type.DOGS){
            for(Animal animal: getDogsList()){
                if(animal.getId() == id){
                    tmpAnimal = animal;
                }
            }
        }
        if (typeAnimal == Type.HAMSTERS){
            for(Animal animal: getHamstersList()){
                if(animal.getId() == id){
                    tmpAnimal = animal;
                }
            }
        }
        if (typeAnimal == Type.CAMELS){
            for(Animal animal: getCamelsList()){
                if(animal.getId() == id){
                    tmpAnimal = animal;
                }
            }
        }
        if (typeAnimal == Type.DONHKEYS){
            for(Animal animal: getDonhkeysList()){
                if(animal.getId() == id){
                    tmpAnimal = animal;
                }
            }
        }
        if (typeAnimal == Type.HORSES){
            for(Animal animal: getHorsesList()){
                if(animal.getId() == id){
                    tmpAnimal = animal;
                }
            }
        }
        return tmpAnimal;
    }


}

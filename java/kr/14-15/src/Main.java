import model.Type;
import registry.AnimalRegistry;

import javax.script.ScriptContext;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static model.Type.*;



public class Main {
    public static void main(String[] args) {
        AnimalRegistry animalRegistry = new AnimalRegistry(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(),
                new ArrayList<>(), new ArrayList<>());

        animalRegistry.addAnimal("Max", "1990-10-10", new ArrayList<>(Arrays.asList("sit", "up")), DOGS);
        animalRegistry.addAnimal("Mix", "1960-10-10", new ArrayList<>(Arrays.asList("sit", "up")), Type.DOGS);
        animalRegistry.addAnimal("Pax", "1970-10-10", new ArrayList<>(Arrays.asList("sit", "up")), Type.DOGS);

        animalRegistry.getAnimalForId(2, DOGS).learnNewCmd("did");
        System.out.println();

        int exit = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добрый день!\n");
        try {
            while (exit == 0){

                System.out.println("Для вывода списка имеющихся в регистре животных введите 1 и нажмите enter,\n" +
                        "Для заведения нового животного введите 2 и нажмите enter,\n" +
                        "Для вывода списка команд, которые выполняет животное введите 3 и нажмите enter,\n" +
                        "Чтобы обучить животное новым командам введите 4 и нажмите enter,\n" +
                        "Чтобы получить значение счетчика из задания 15 введите 5 и нажмите enter,\n" +
                        "Чтобы выйти введите 6 и нажмите enter:");

                int usrChoise = scanner.nextInt();

                if(usrChoise == 1) {
                    printAllAnimals(animalRegistry);
                }
                if(usrChoise == 2) {
                    System.out.println("Введите тип животного (Dogs, Hamsters, Camels, Donhkeys, Cats, Horses) и нажмите enter: ");
                    String sTmp = scanner.nextLine();
                    String newAnimalType = scanner.nextLine().toUpperCase();
                    Type typeOfNewAnimal = null;
                    if(newAnimalType.equalsIgnoreCase("dogs")){
                        typeOfNewAnimal = DOGS;
                    }
                    if(newAnimalType.equalsIgnoreCase("cats")){
                        typeOfNewAnimal = CATS;
                    }
                    if(newAnimalType.equalsIgnoreCase("camels")){
                        typeOfNewAnimal = CAMELS;
                    }
                    if(newAnimalType.equalsIgnoreCase("hamsters")){
                        typeOfNewAnimal = HAMSTERS;
                    }
                    if(newAnimalType.equalsIgnoreCase("donhkeys")){
                        typeOfNewAnimal = DONHKEYS;
                    }
                    if(newAnimalType.equalsIgnoreCase("horses")){
                        typeOfNewAnimal = HORSES;
                    }

                    System.out.println("Введите имя животного и нажмите enter:");
                    String newAnimalName = scanner.nextLine();

                    System.out.println("Введите день рождения животного (в формате \"1960-10-10\") и нажмите enter:");
                    String newAnimalBirthday = scanner.nextLine();

                    System.out.println("Введите через пробел команды, которые должно знать животное  и нажмите enter:");
                    String newAnimalCmd = scanner.nextLine();
                    animalRegistry.addAnimal(newAnimalName, newAnimalBirthday,
                            new ArrayList<>(Arrays.asList(newAnimalCmd.split(" "))), typeOfNewAnimal);
                }
                if(usrChoise == 3){
                    System.out.println("Введите тип животного (Dogs, Hamsters, Camels, Donhkeys, Cats, Horses) и нажмите enter: ");
                    String sTmp = scanner.nextLine();
                    String animalTypeCmd = scanner.nextLine();
                    printAllAnimals(animalRegistry);
                    System.out.println("Введите id животного и нажмите enter: ");
                    int animalIdCmd = scanner.nextInt();

                    if(animalTypeCmd.equalsIgnoreCase("dogs")){
                        System.out.println(animalRegistry.getDogsList().get(animalIdCmd-1).getCmd());
                    }
                    if(animalTypeCmd.equalsIgnoreCase("cats")){
                        System.out.println(animalRegistry.getCatsList().get(animalIdCmd-1).getCmd());
                    }
                    if(animalTypeCmd.equalsIgnoreCase("camels")){
                        System.out.println(animalRegistry.getCamelsList().get(animalIdCmd-1).getCmd());
                    }
                    if(animalTypeCmd.equalsIgnoreCase("hamsters")){
                        System.out.println(animalRegistry.getHamstersList().get(animalIdCmd-1).getCmd());
                    }
                    if(animalTypeCmd.equalsIgnoreCase("donhkeys")){
                        System.out.println(animalRegistry.getDonhkeysList().get(animalIdCmd-1).getCmd());
                    }
                    if(animalTypeCmd.equalsIgnoreCase("horses")){
                        System.out.println(animalRegistry.getHorsesList().get(animalIdCmd-1).getCmd());
                    }
                }
                if(usrChoise == 4){
                    System.out.println("Введите тип животного (Dogs, Hamsters, Camels, Donhkeys, Cats, Horses) и нажмите enter: ");
                    String sTmp = scanner.nextLine();
                    String animalTypeCmd = scanner.nextLine();
                    printAllAnimals(animalRegistry);
                    System.out.println("Введите id животного и нажмите enter: ");
                    int animalIdCmd = scanner.nextInt();
                    String rTmp = scanner.nextLine();
                    System.out.println("Через пробел введите команды, которым нужно обучить животное и нажмите enter: ");
                    String animalLearnCmd = scanner.nextLine();
                    if(animalTypeCmd.equalsIgnoreCase("dogs")){
                        animalRegistry.getDogsList().get(animalIdCmd-1).learnNewCmd(animalLearnCmd);
                    }
                    if(animalTypeCmd.equalsIgnoreCase("cats")){
                        animalRegistry.getCatsList().get(animalIdCmd-1).learnNewCmd(animalLearnCmd);
                    }
                    if(animalTypeCmd.equalsIgnoreCase("camels")){
                        animalRegistry.getCamelsList().get(animalIdCmd-1).learnNewCmd(animalLearnCmd);
                    }
                    if(animalTypeCmd.equalsIgnoreCase("hamsters")){
                        animalRegistry.getHamstersList().get(animalIdCmd-1).learnNewCmd(animalLearnCmd);
                    }
                    if(animalTypeCmd.equalsIgnoreCase("donhkeys")){
                        animalRegistry.getDonhkeysList().get(animalIdCmd-1).learnNewCmd(animalLearnCmd);
                    }
                    if(animalTypeCmd.equalsIgnoreCase("horses")){
                        animalRegistry.getHorsesList().get(animalIdCmd-1).learnNewCmd(animalLearnCmd);
                    }
                }
                if(usrChoise == 5) {
                    System.out.println(animalRegistry.getIntNumber());
                }
                if(usrChoise == 6) {
                    System.out.println("\nByeBye!");
                    break;}
                System.out.println("\n");
            }
            scanner.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
    public static void printAllAnimals(AnimalRegistry animalRegistry) {
        System.out.println("Dogs:");
        System.out.println(animalRegistry.getDogsList());
        System.out.println("Hamsters:");
        System.out.println(animalRegistry.getHamstersList());
        System.out.println("Camels:");
        System.out.println(animalRegistry.getCamelsList());
        System.out.println("Donhkeys:");
        System.out.println(animalRegistry.getDonhkeysList());
        System.out.println("Cats:");
        System.out.println(animalRegistry.getCatsList());
        System.out.println("Horses:");
        System.out.println(animalRegistry.getHorsesList());
    }

}

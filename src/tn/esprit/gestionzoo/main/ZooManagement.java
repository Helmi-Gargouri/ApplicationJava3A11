package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import static tn.esprit.gestionzoo.entities.Zoo.nbrAnimalCree;
import static tn.esprit.gestionzoo.entities.Zoo.nbrAquaticCree;
import java.util.Scanner;

public class ZooManagement {

    public static void main(String[] args) {
        //PROSIT 2
        Animal lion = new Animal();
        lion.setName("youri");
        lion.setAge(5);
        lion.setFamily("Cats");
        lion.setIsMammal(true);

        Zoo myZoo = new Zoo();
        myZoo.setName("tn.esprit.gestionzoo.entities.Zoo Park");
        myZoo.setCity("Mourouj");
        myZoo.setNbrCages(25);
        myZoo.setAnimals(new Animal[25]);


        Animal dog = new Animal("Arabe", "drog", 4, true);
        //Instruction8...........................................................
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        //Instruction9............................................................
        //System.out.println(myZoo.addAnimal(lion));
        //System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();
        //Instruction11.......................................
        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Arabe", "drog", 4, true);
        System.out.println(myZoo.searchAnimal(dog2));

        //Instruction13.................................................
        System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

        //PROSIT 3
        //Instruction15.......................................
        if (myZoo.isZooFull()) {
            System.out.println("Le zoo est plein.");
        } else {
            System.out.println("Le zoo n'est pas plein.");
        }

        //Instruction16.......................................
        // Crée deuxième zoo
        Zoo Zoo2 = new Zoo("tn.esprit.gestionzoo.entities.Zoo 2", "ariana");

        // Ajout d'animaux
        //myZoo.addAnimal(lion);
        //Zoo2.addAnimal(dog);

        Zoo zooAvecPlusAnimaux = Zoo.comparerZoo(myZoo, Zoo2);
        if (zooAvecPlusAnimaux != null) {
            System.out.println("Le zoo avec le plus d'animaux est : " + zooAvecPlusAnimaux.getName());
        } else {
            System.out.println("z1 et z2 ont le même nombre d'animaux");
        }


        //Instruction21.......................................
        //Aquatic aquatic = new Aquatic();
        Terrestrial terrestrial = new Terrestrial();

        //Instruction23.......................................
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();

        Dolphin dolphin1=new Dolphin("Dophin","dodo",2,true,"habitat",39);
        Dolphin dolphin2=new Dolphin("Dophin","fofo",2,true,"habitat",30);
        Dolphin dolphin3=new Dolphin("Dophin","nono",2,false,"habitat",20);

        Penguin penguin1=new Penguin("Penguin","penpen",3,true,"habitat",30);
        //Aquatic aquatic2=new Aquatic("Family","penpen",4,true,"habitat");

        //aquatic.swim();
        dolphin.swim();
        penguin.swim();


        //Prosit_6..................................
        System.out.println("nbr annimals cree:" + nbrAnimalCree);
        //Instruction27....dans la classe penguin le resultat est this aquatic animal is swiming.....................
        myZoo.affSwim();
        System.out.println("Max Penguin Swimming Depth est: " + myZoo.maxPenguinSwimmingDepth());
        myZoo.displayNumberOfAquaticsByType();

        try {
            myZoo.addAnimal(dog);
        } catch (ZooFullException e) {
            throw new RuntimeException(e);
        }catch (InvalidAgeException e){
            System.err.println("Invalid Age Exception: " + e.getMessage());
        }
        try {
            myZoo.addAnimal(lion);
        } catch (ZooFullException e) {
            throw new RuntimeException(e);
        }catch (InvalidAgeException e){
            System.err.println("Invalid Age Exception: " + e.getMessage());
        }
        try {
            myZoo.addAnimal(dog2);
        } catch (ZooFullException e) {
            throw new RuntimeException(e);

        }catch (InvalidAgeException e){
            System.err.println("Invalid Age Exception: " + e.getMessage());
        }

        myZoo.displayAnimals();
    }
}
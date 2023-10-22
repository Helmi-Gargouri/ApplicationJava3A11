package tn.esprit.gestionzoo.entities;

//Instruction5...................
public class Zoo {
    //Instruction14.................................

    private static final int MAX_CAGES = 25;

    //Instruction5...................

    private Animal[] animals;
    private String name, city;
    private int nbrCages;
    private int nbrAnimals;
    private Aquatic[] aquaticAnimals;
    public static int nbrAnimalCree=0;
    public static int nbrAquaticCree=0;

    public Zoo() {
    }

    public static int getNbrAnimalCree() {
        return nbrAnimalCree;
    }

    public static void setNbrAnimalCree(int nbrAnimalCree) {
        Zoo.nbrAnimalCree = nbrAnimalCree;
    }

    //Instruction25.................................
    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public void setNbrCages(int nbrCages) {
        this.nbrCages = nbrCages;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }
    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public Animal[] getAnimals() {
        return animals;
    }
    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    //Instruction6
    public Zoo(String name, String city) {
        animals = new Animal[MAX_CAGES];
        if (name == null || name.trim().isEmpty()) {

            this.name = name;}
        this.city = city;
        this.nbrCages = MAX_CAGES; // Utilisez la constante MAX_CAGES ici
    }
    //Instruction8.......................................
    public void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", Nbr Cages/Animals: " + nbrCages);
    }

    //Instruction10.....................................
    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (isZooFull())
            return false;
        //if (nbrAnimals == nbrCages)
            //return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }
    //Instruction13....................................
    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
            animals[nbrAnimals] = null;
            this.nbrAnimals--;
        }
        return true;
    }

    public void displayAnimals() {
        System.out.println("Liste des animaux de " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }
    //Instruction11.................................
    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (this.name == animals[i].getName())
                return i;
        }
        return index;
    }
    //Instruction15.................................
    public boolean isZooFull() {
        return nbrAnimals >= MAX_CAGES;
    }
    //Instruction16.................................
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        } else if (z2.nbrAnimals > z1.nbrAnimals) {
            return z2;
        } else {
            System.out.println("z1 et z2  ont le même nombre d'animaux");
            return null;}
    }

    public String toString() {
        return "Name: " + name + ", City: " + city + ", Nbr Cages/Animals: " + nbrCages;
    }

    //Instruction26.................................
    public boolean addAquaticAnimal(Aquatic aquatic) {

        if (nbrAquaticCree<aquaticAnimals.length &&(!isZooFull())){
            aquaticAnimals[nbrAquaticCree] = aquatic;
            nbrAquaticCree++;
            nbrAnimalCree++;
            return true;
        }

        return false;
    }
    //Instruction27.................................
    public void affSwim(){
        for(int i=0;i<nbrAquaticCree;i++){
            aquaticAnimals[i].swim();
        }
    }

    //Instruction29.................................
    public float maxPenguinSwimmingDepth(){
        float maxDepth=-1;
        for(int i=0;i<nbrAquaticCree;i++){
            if(aquaticAnimals[i] instanceof Penguin){
                Penguin penguin = (Penguin) aquaticAnimals[i];
                if((penguin.getSwimmingDepth() > maxDepth)) {
                    maxDepth = ((Penguin) aquaticAnimals[i]).getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    //Instruction30.................................
    public void displayNumberOfAquaticsByType(){
        int nbrDolphin=0;
        int nbrPenguin=0;
        for(int i=0;i<nbrAquaticCree;i++){
            if (aquaticAnimals[i] instanceof Dolphin){
                nbrDolphin++;
            }else {
                nbrPenguin++;
            }
        }

        System.out.println("le nombre des penguins dans un zoo est :"+nbrPenguin);
        System.out.println("le nombre des Dolphin dans un zoo est :"+nbrDolphin);
    }
}



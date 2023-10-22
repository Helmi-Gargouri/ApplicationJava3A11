package tn.esprit.gestionzoo.entities;

//Instruction5...........................................
public class Animal {
    private  String family, name;
    private  int age;
    private  boolean isMammal;

    public Animal() {
        System.out.println("animal createddd");
    }

    public boolean isIsMammal() {
        return isMammal;
    }
    public void setIsMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    //Instruction6..................................
    public Animal(String family, String name, int age, boolean isMammal) {

        this.family = family;
        this.name = name;
        if (age < 0) {
        this.age = age;}
        this.isMammal = isMammal;
    }
    //Instruction9.........................................
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}

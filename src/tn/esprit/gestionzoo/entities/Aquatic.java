package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
    private String habitat;

    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Aquatic(String family,String name , int age ,boolean isMammal ,String habitat){
        super(family,name,age,isMammal);
        this.habitat=habitat;
    }
    public Aquatic(){

    }

    @Override
    public String toString() {
        return super.toString() + ", Habitat: " + this.habitat;
    }
    public void swim(){
        if (this instanceof Dolphin){
            System.out.println("This Dolphin is swimming");
        } else if (this instanceof Penguin) {
            System.out.println("This Penguin is swimming");
        } else {
            System.out.println("This Aquatic is swimming");
        }

    }
    //Instruction31.......................................
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if(this == null){
            return false;
        }
        if(obj instanceof  Aquatic){
            Aquatic aquatic=(Aquatic) obj;
            return  aquatic.getName()==this.getName() && aquatic.getAge()==this.getAge() && aquatic.habitat==this.habitat;
        }
        return false;

    }}


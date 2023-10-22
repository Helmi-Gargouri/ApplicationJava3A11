package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
    private int nbrLegs;
    public Terrestrial() {
    }

    public int getNbrLegs() {
        return nbrLegs;
    }
    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    public Terrestrial(String habitat, int nbrLegs) {
        super();
        this.nbrLegs = nbrLegs;
    }
    @Override
    public String toString() {
        return super.toString() + ", Number of Legs: " + nbrLegs;
    }

    public void swim() {
        System.out.println("This Terrestrial is swimming.");
    }
}
package tn.esprit.gestionzoo.entities;



public class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin(String penguin, String penpen, int i, boolean b, String habitat, int i1) {
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }
    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    public Penguin() {
        super();
        this.swimmingDepth = swimmingDepth;
    }
    @Override
    public String toString() {
        return super.toString() + ", Swimming Depth: " + swimmingDepth;
    }
    public void swim() {
        System.out.println("This Penguin animal is swimming.");
    }
}
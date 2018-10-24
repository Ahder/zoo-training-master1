package main.java.com.fges.rizomm.m1.zoo.animals;

public abstract class Animal {

    private String name;

    private int eatCount;
    private String healthState;
    private boolean inCage;
    private boolean inVisitingArea;
    private Reproduction repro;
    private float weight;
    private float size;


    public Animal() {
        inCage = true;
        inVisitingArea = false;
        healthState ="in shape";
    }

    public String getHealthState() {
        return healthState;
    }

    public void setHealthState(String healthState) {
        this.healthState = healthState;
    }

    public boolean isInVisitingArea() {
        return inVisitingArea;
    }

    public void setInVisitingArea(boolean inVisitingArea) {
        this.inVisitingArea = inVisitingArea;
    }

    public boolean isInCage() {
        return inCage;
    }

    public void setInCage(boolean inCage) {
        this.inCage = inCage;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return getName();
    }

    public abstract String scream();

    public void eat(String food) {
        this.eatCount++;
    }

    public int getEatCount() {
        return eatCount;
    }

    public void setEatCount(int eatCount) {
        this.eatCount = eatCount;
    }


    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public Reproduction getRepro() {
        return repro;
    }

    public void setRepro(Reproduction repro) {
        this.repro = repro;
    }
}

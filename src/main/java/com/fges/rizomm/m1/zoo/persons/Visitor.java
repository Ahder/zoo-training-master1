package main.java.com.fges.rizomm.m1.zoo.persons;

public class Visitor extends Person {

    private boolean inZoo = false;

    public Visitor(State age) {
        super(age);
    }

    public void accesZoo(Person identity, String acces){

        if(identity.getAge().equals(State.Adult))   {
            System.out.println("Access Granted");
            inZoo = true;
        }
            else {
            System.out.println("Access Denied");
            }

        }

    public boolean isInZoo() {
        return inZoo;
    }

    public void setInZoo(boolean inZoo) {
        this.inZoo = inZoo;
    }
}


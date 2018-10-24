package main.java.com.fges.rizomm.m1.zoo.persons;


public abstract class Person {

    private String firstName;
    private String lastName;
    private State age;
    private boolean parent; //true if the child is accompanied by a parent


    public Person()
    {

    }

    public Person(State age)
    {
        if(age.equals(State.Adult))
        {
            this.parent = false;
        }
        else
        {
            this.parent = true;
        }
    }

    public State getAge() {
        return age;
    }
    public void setAge(State age) {
        this.age = age;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }

    public void setFirstName(String FirstName) { this.firstName = FirstName; }
    public void setLastName(String LastName) { this.lastName = LastName; }




}



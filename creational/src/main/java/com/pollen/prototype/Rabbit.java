package com.pollen.prototype;

public class Rabbit implements Cloneable {
    private Person owner;
    private Breed breed;
    private int age;

    public enum Breed {
        HIMALAYAN,
        AMERICAN,
        MENI_REX,
        LIONHEAD,
        DUTCH
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        Person person = new Person(owner);
        this.owner = person;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Rabbit clone() throws CloneNotSupportedException {
       try {
            Rabbit rabbit = (Rabbit) super.clone();
            // Dealing mutability. Rabbit has first owner as Person while cloned Rabbit will be owned by cloned Person Owner.
            // Since Person object is shared, therefore ensuring the original Person object is not changed when another value is assigned to cloned Person onject.
            // Ensures Deep Copy.
            rabbit.owner = owner.clone();
            return rabbit;
        } catch (CloneNotSupportedException e) {
            throw new CloneNotSupportedException("Rabbit object cloning failed.");
        }
    }
}

package com.pollen.prototype;

public class Person implements Cloneable {
    private String name;

    public Person(String owner) {
        this.name = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new CloneNotSupportedException("Person object cloning failed.");
        }
    }
}

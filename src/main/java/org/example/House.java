package org.example;

public class House {
    private Person owner;
    private int number;
    private String street;

    public House(Person owner, int number, String street) {
        this.owner = owner;
        this.number = number;
        this.street = street;
    }

    public Person getOwner() {
        return this.owner;
    }

    public void setOwner(Person newOwner) {
        this.owner = newOwner;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int newNumber) {
        this.number = newNumber;
    }

    public String getStreet() {
        return this.street;
    }
}

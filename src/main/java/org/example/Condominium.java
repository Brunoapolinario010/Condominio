package org.example;

public class Condominium {
    private String name;
    private String location;
    private House[] houses;

    public Condominium(String name, String location, int houseAmount) {
        this.name = name;
        this.location = location;
        this.houses = new House[houseAmount];
    }

    public int getHouseAmount() {
        int amount = 0;
        for(House house : this.houses) {
            if(house != null) {
                amount++;
            }
        }
        return amount;
    }

    public void listHouses() {
        System.out.printf("%30s %20s %20s\n","Owner", "House Number", "House Street");
        System.out.println("------------------------------------------------------------------------");
        for(House house : this.houses) {
            if(house != null) {
                System.out.printf("%30s %20d %20s\n",house.getOwner().getName(), house.getNumber(), house.getStreet());
                System.out.println("------------------------------------------------------------------------");
            }
        }
    }

    public void addHouse(House newHouse) {
        int lastHouseIndex = 0;
        for(House house : this.houses) {
            if(house != null) {
                lastHouseIndex++;
            }
        }

        this.houses[lastHouseIndex] = newHouse;
    }

    public String getCondoName() {
        return this.name;
    }

    public void setCondoName(String newName) {
        this.name = newName;
    }
}

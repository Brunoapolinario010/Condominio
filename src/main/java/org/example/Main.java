package org.example;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("joao", "silva");
        Person p2 = new Person("maria", "souza");

        House h1 = new House(p1, 100, "rua 1");
        House h2 = new House(p2, 101, "rua 2");

        Condominium c1 = new Condominium("condomínio 1", "rua do condomínio 1, 505", 20);

        c1.addHouse(h1);
        c1.addHouse(h2);

        c1.listHouses();

        h1.setOwner(p2);

        c1.listHouses();

        System.out.println("Nome do condomínio: " + c1.getCondoName());
        System.out.println("Quantidade de casas: " + c1.getHouseAmount());
    }
}
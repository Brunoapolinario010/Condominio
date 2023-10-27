package org.example;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = formatName(firstName);
        this.lastName = formatName(lastName);
    }

    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = formatName(firstName);
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = formatName(lastName);
    }
    public String getName() {
        return String.format("%s %s", getFirstName(), getLastName());
    }
    private String formatName(String name) {
        try {
            name = name.trim();

            if(name.isEmpty()) {
                throw new Exception("name cannot be empty");
            }

            return String.format("%s%s", name.trim().substring(0, 1).toUpperCase(), name.trim().substring(1));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

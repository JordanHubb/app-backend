package de.HTWBerlin.webtech.Webtech.api;

public class Person {

    private long id;
    private String firstName;
    private String lastName;
    private String username;

    public Person(long id, String firstName, String lastName, String username) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getusername() {
        return username;
    }


    public void setusername(String lastusername) {
        this.username = username;
    }
}

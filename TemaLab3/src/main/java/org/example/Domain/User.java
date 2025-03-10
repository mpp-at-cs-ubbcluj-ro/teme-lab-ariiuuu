package org.example.Domain;

public class User extends Entity<Integer> {
    private String username;
    private String parola;

    private String name;
    private String telephone_number;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephoneNumber() {
        return telephone_number;
    }

    public void setTelephoneNumber(String telephone_number) {
        this.telephone_number = telephone_number;
    }


    public User(String name, String telephone_number, String username, String parola) {
        this.name = name;
        this.telephone_number = telephone_number;
        this.username = username;
        this.parola = parola;
    }

    public boolean login(String username, String parola) {
        if (this.username.equals(username) && this.parola.equals(parola)) {
            return true;
        }
        return false;
    }

    public void logout() {

    }
}

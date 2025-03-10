package org.example.Domain;

public class Rezervare extends Entity<Integer> {
    private Client client;
    private Excursie excursie;
    private Integer numar_tickete;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Excursie getExcursie() {
        return excursie;
    }

    public void setExcursie(Excursie excursie) {
        this.excursie = excursie;
    }

    public Integer getNumarTickete() {
        return numar_tickete;
    }

    public void setNumarTickete(Integer numar_tickete) {
        this.numar_tickete = numar_tickete;
    }
}
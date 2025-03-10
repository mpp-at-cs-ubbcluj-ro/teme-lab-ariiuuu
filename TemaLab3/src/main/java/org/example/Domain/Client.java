package org.example.Domain;

import java.util.ArrayList;
import java.util.List;

public class Client extends Entity<Integer> {
    private String name;
    private String telephone_number;

    public String getName(){
        return this.name;
    }

    public String getTelephone_number(){
        return this.telephone_number;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setTelephone_number(String telephone_number){
        this.telephone_number = telephone_number;
    }

    public Client(String name, String telephone_number){
        this.name = name;
        this.telephone_number = telephone_number;
    }
    List<Rezervare> rezervari = new ArrayList<>();

    public void afisare_rezervari(){
        for(Rezervare rez : rezervari){
            System.out.println(rez.getClient() + " " + rez.getExcursie() + " " + rez.getNumarTickete());
        }
    }
}

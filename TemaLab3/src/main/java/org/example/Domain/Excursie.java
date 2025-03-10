package org.example.Domain;

public class Excursie extends Entity<Integer> {
    private String destinatie;
    private String firma_transport;
    private String ora_plecarii;
    private Integer pretul;
    private Integer numar_locuri;

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    public String getFirmaTransport() {
        return firma_transport;
    }

    public void setFirmaTransport(String firma_transport) {
        this.firma_transport = firma_transport;
    }

    public String getOraPlecarii() {
        return ora_plecarii;
    }

    public void setOraPlecarii(String ora_plecarii) {
        this.ora_plecarii = ora_plecarii;
    }

    public Integer getPretul() {
        return pretul;
    }

    public void setPretul(Integer pretul) {
        this.pretul = pretul;
    }

    public Integer getNumarLocuri() {
        return numar_locuri;
    }

    public void setNumarLocuri(Integer numar_locuri) {
        this.numar_locuri = numar_locuri;
    }
}
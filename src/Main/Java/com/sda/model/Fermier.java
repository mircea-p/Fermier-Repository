package com.sda.model;

import javax.persistence.*;

@Entity
@Table(name = "fermieri")
public class Fermier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fermier_id")
    private Integer fermierId;

    @Column(name = "nume_fermier")
    private String numeFermier;

    @Column(name = "cui")
    private Integer cui;

    @Column(name = "email")
    private String email;


    public Fermier() {
    }

    public Fermier(String numeFermier, Integer cui, String email) {
        this.numeFermier = numeFermier;
        this.cui = cui;
        this.email = email;
    }

    public Integer getFermierId() {
        return fermierId;
    }

    public void setFermierId(Integer fermierId) {
        this.fermierId = fermierId;
    }

    public String getNumeFermier() {
        return numeFermier;
    }

    public void setNumeFermier(String numeFermier) {
        this.numeFermier = numeFermier;
    }

    public Integer getCui() {
        return cui;
    }

    public void setCui(Integer cui) {
        this.cui = cui;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Fermier{" +
                "fermierId=" + fermierId +
                ", numeFermier='" + numeFermier + '\'' +
                ", cui=" + cui +
                ", email='" + email + '\'' +
                '}';
    }
}

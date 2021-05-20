package com.sda.model;

import javax.persistence.*;

@Entity
@Table(name = "arendatori")
public class Arendator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "arendator_id")
    private Integer arendatorId;
    @Column(name = "nume")
    private String nume;
    @Column(name = "prenume")
    private String prenume;
    @Column(name = "cnp")
    private Integer cnp;
    @Column(name = "email")
    private String email;

    public Arendator(String nume, String prenume, Integer cnp, String email) {
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
        this.email = email;
    }

    public Arendator() {
    }

    public Integer getArendatorId() {
        return arendatorId;
    }

    public void setArendatorId(Integer arendatorId) {
        this.arendatorId = arendatorId;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Integer getCnp() {
        return cnp;
    }

    public void setCnp(Integer cnp) {
        this.cnp = cnp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Arendator{" +
                "arendatorId=" + arendatorId +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", cnp=" + cnp +
                ", email='" + email + '\'' +
                '}';
    }
}

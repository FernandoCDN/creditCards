package com.carvajal.crudCreditCards.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "clients")
public class clientModel{

    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Id
    private String identification;

    private String name;

    private String email;

    @JsonIgnore
    @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<creditCardModel> cards;


    public clientModel(String identification, String name, String email) {
        this.identification = identification;
        this.name = name;
        this.email = email;
    }

    public clientModel() {

    }

    public Long getId() {
        return id;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<creditCardModel> getCards() {
        return cards;
    }

    public void setCards(Set<creditCardModel> cards) {
        this.cards = cards;
    }
}

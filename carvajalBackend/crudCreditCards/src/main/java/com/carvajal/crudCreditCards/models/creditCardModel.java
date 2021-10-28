package com.carvajal.crudCreditCards.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "creditCards")
public class creditCardModel {

    @Id
    private String number;

    private String brand;

    private String bank;

    private String cvc;

    private String validThru;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ownerId")
    private clientModel owner;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public String getValidThru() {
        return validThru;
    }

    public void setValidThru(String validThru) {
        this.validThru = validThru;
    }

    public clientModel getOwner() {
        return owner;
    }

    public void setOwner(clientModel owner) {
        this.owner = owner;
    }
}

package com.kevcode.catsaccountservice.domain.catsaccount.entities;

import com.kevcode.catsaccountservice.domain.catsaccount.shared.EntityBase;

import javax.persistence.Entity;

@Entity
public class CatsAccount extends EntityBase {
    private Long balance;
    private Long personId;


    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Long getBalance() {
        return this.balance;
    }

    public void setBalance(Long value) {
        this.balance = value;
    }
}

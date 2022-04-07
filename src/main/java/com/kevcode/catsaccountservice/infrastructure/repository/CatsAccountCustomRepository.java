package com.kevcode.catsaccountservice.infrastructure.repository;

import com.kevcode.catsaccountservice.domain.catsaccount.repository.ICatsAccountCustomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class CatsAccountCustomRepository implements ICatsAccountCustomRepository {

    @Autowired
    EntityManager entityManager;

    @Override
    public Long withdraw() {
        return null;
    }

    @Override
    public Long deposit() {
        return null;
    }

    @Override
    public Long getBalance() {
        return null;
    }
}

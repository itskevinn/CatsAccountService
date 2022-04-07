package com.kevcode.catsaccountservice.domain.catsaccount.repository;

import com.kevcode.catsaccountservice.domain.catsaccount.entities.CatsAccount;

import java.util.List;

public interface ICatsAccountCustomRepository {
    Long withdraw();
    Long deposit();
    Long getBalance();
    List<CatsAccount> getByPersonId(Long personId);
}

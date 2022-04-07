package com.kevcode.catsaccountservice.infrastructure.repository;

import com.kevcode.catsaccountservice.domain.catsaccount.entities.CatsAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICatsAccountRepository extends JpaRepository<CatsAccount, Long> {
}

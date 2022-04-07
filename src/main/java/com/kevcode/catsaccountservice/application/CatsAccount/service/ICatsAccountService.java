package com.kevcode.catsaccountservice.application.CatsAccount.service;

import com.kevcode.catsaccountservice.application.CatsAccount.http.dto.CatsAccountDto;
import com.kevcode.catsaccountservice.application.CatsAccount.http.request.CatsAccountRequest;
import com.kevcode.catsaccountservice.application.CatsAccount.http.request.NationalTransactionRequest;
import com.kevcode.catsaccountservice.application.shared.Response;
import com.kevcode.catsaccountservice.domain.catsaccount.entities.CatsAccount;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ICatsAccountService {

    Response<CatsAccountDto> create(CatsAccountRequest catsAccount);

    Response<List<CatsAccountDto>> getByPersonId(Long personId);

    Response<CatsAccountDto> getById(Long id);

    Response<Long> withdraw(NationalTransactionRequest request);

    Response<Long> deposit(NationalTransactionRequest request);

    Response<Long> getBalance(NationalTransactionRequest request);
}

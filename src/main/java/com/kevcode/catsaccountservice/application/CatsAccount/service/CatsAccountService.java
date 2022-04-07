package com.kevcode.catsaccountservice.application.CatsAccount.service;

import com.kevcode.catsaccountservice.application.CatsAccount.http.dto.CatsAccountDto;
import com.kevcode.catsaccountservice.application.CatsAccount.http.request.CatsAccountRequest;
import com.kevcode.catsaccountservice.application.CatsAccount.http.request.NationalTransactionRequest;
import com.kevcode.catsaccountservice.application.shared.Response;
import com.kevcode.catsaccountservice.domain.catsaccount.entities.CatsAccount;
import com.kevcode.catsaccountservice.domain.catsaccount.repository.ICatsAccountCustomRepository;
import com.kevcode.catsaccountservice.infrastructure.repository.ICatsAccountRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatsAccountService implements ICatsAccountService {
    @Autowired
    private ICatsAccountRepository _repository;
    @Autowired
    private ICatsAccountCustomRepository _customRepository;
    @Autowired
    private ModelMapper _modelMapper;

    @Override
    public Response<CatsAccountDto> create(CatsAccountRequest catsAccountRequest) {
        try {
            CatsAccount catsAccount = _modelMapper.map(catsAccountRequest, CatsAccount.class);
            catsAccount = _repository.save(catsAccount);
            CatsAccountDto catsAccountDto = _modelMapper.map(catsAccount, CatsAccountDto.class);
            return new Response<>(catsAccountDto, HttpStatus.OK, "Cuenta registrada.");
        } catch (Exception e) {
            return new Response<>(null, HttpStatus.INTERNAL_SERVER_ERROR, "Ha ocurrido un error", e.getMessage());
        }
    }

    @Override
    public Response<List<CatsAccountDto>> getByPersonId(Long personId) {
        try {
            List<CatsAccount> catsAccounts = _customRepository.getByPersonId(personId);
            List<CatsAccountDto> catsAccountDto = _modelMapper.map(catsAccounts, new TypeToken<List<CatsAccountDto>>() {
            }.getType());
            return new Response<>(catsAccountDto, HttpStatus.OK, "Estas son las cuentas");
        } catch (Exception e) {
            return new Response<>(null, HttpStatus.INTERNAL_SERVER_ERROR, "Ha ocurrido un error");
        }
    }

    @Override
    public Response<CatsAccountDto> getById(Long id) {
        return null;
    }

    @Override
    public Response<Long> withdraw(NationalTransactionRequest request) {
        return null;
    }

    @Override
    public Response<Long> deposit(NationalTransactionRequest request) {
        return null;
    }

    @Override
    public Response<Long> getBalance(NationalTransactionRequest request) {
        return null;
    }
}

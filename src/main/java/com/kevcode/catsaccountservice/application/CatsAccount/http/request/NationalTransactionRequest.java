package com.kevcode.catsaccountservice.application.CatsAccount.http.request;

import lombok.Data;

@Data
public class NationalTransactionRequest {
    private Long accountId;
    private Long balance;
}

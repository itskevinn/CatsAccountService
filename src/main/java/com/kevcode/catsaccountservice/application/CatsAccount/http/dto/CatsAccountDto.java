package com.kevcode.catsaccountservice.application.CatsAccount.http.dto;

import lombok.Data;

@Data
public class CatsAccountDto {
    private Long personId;
    private Long balance;
    private Long accountId;
}

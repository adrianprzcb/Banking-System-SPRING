package com.adrian.account_service.mapper;


import com.adrian.account_service.dto.AccountRequest;
import com.adrian.account_service.dto.AccountResponse;
import com.adrian.account_service.model.Account;

public class AccountMapper {

    public static Account toEntity(AccountRequest request) {
        return Account.builder()
                .userId(request.getUserId())
                .name(request.getName())
                .email(request.getEmail())
                .build();
    }

    public static AccountResponse toResponse(Account account) {
        return AccountResponse.builder()
                .id(account.getId())
                .userId(account.getUserId())
                .name(account.getName())
                .email(account.getEmail())
                .createdAt(account.getCreatedAt())
                .build();
    }
}

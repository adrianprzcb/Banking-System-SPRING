package com.adrian.account_service.service;


import com.adrian.account_service.dto.AccountRequest;
import com.adrian.account_service.dto.AccountResponse;
import com.adrian.account_service.mapper.AccountMapper;
import com.adrian.account_service.model.Account;
import com.adrian.account_service.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountResponse createAccount(AccountRequest request) {
        Account account = AccountMapper.toEntity(request);
        Account saved = accountRepository.save(account);
        return AccountMapper.toResponse(saved);
    }

    public Optional<AccountResponse> getAccountByUserId(UUID userId) {
        return accountRepository.findByUserId(userId)
                .map(AccountMapper::toResponse);
    }
}

package com.adrian.account_service.repository;

import com.adrian.account_service.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, UUID> {
    Optional<Account> findByUserId(UUID userId);
}

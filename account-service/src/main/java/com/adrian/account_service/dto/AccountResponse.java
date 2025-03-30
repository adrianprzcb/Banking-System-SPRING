package com.adrian.account_service.dto;


import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Builder
public class AccountResponse {
    private UUID id;
    private UUID userId;
    private String name;
    private String email;
    private LocalDateTime createdAt;
}

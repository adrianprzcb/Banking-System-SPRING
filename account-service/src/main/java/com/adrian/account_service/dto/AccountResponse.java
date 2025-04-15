package com.adrian.account_service.dto;


import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class AccountResponse {
    private Long id;
    private Long userId;
    private String name;
    private String email;
    private LocalDateTime createdAt;
}

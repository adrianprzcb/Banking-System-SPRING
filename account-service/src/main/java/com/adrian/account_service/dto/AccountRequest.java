package com.adrian.account_service.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AccountRequest {
    private Long userId;

    @NotBlank
    private String name;

    @Email
    private String email;
}

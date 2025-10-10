package com.agron.FinTrackAI.accounts.dto

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record AccountCreateRequest(
    @NotBlank String name,
    @Pattern(regexp = "checking|savings|credit|cash|investment")
    String currency
) {}

public record AccountResponse(
    String id,
    String name,
    String type,
    String currency
) {}
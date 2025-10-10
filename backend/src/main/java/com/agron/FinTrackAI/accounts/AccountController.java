package com.agron.FinTrackAI.accounts;

import com.agron.FinTrackAI.accounts.dto.*;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    private final AccountService service;
    public AccountController(AccountService service) { this.service = service; }

    // TEMP: fixed user id until we add JWT
    private static final UUID DEMO_USER = UUID.fromString("00000000-0000-0000-0000-000000000001");

    @GetMapping
    public List<Account> list() { return service.list(DEMO_USER); }

    @PostMapping
    public Account create(@RequestBody @Valid AccountCreateRequest req) {
        return service.create(DEMO_USER, req);
    }
}
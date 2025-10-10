package com.agron.FinTrackAI.accounts;

import com.agron.FinTrackAI.accounts.dto.*;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class AccountService {
    private final AccountRepository repo;
    public AccountService(AccountRepository repo) { this.repo = repo; }

    public List<Account> list(UUID userId) {
        return repo.findByUserIdOrderByCreatedAtDesc(userId);
    }

    public Account create(UUID userId, AccountCreateRequest req) {
        Account acc = Account.builder()
                .userId(userId)
                .name(req.name())
                .type(req.type())
                .currency(req.currency() == null ? "USD" : req.currency())
                .build();
        return repo.save(acc);
    }
}
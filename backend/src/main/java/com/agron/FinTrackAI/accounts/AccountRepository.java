package com.agron.FinTrackAI.accounts;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, UUID>{
    List<Account> findByUserIdOrderByCreatedAtDesc(UUID userId);
}
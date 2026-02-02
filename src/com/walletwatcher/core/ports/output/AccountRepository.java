package com.walletwatcher.core.ports.output;

import com.walletwatcher.core.domain.Account;

public interface AccountRepository {
    void save(Account account);
}
package com.walletwatcher.infrastructure.persistence.database;

import com.walletwatcher.core.domain.Account;
import com.walletwatcher.core.ports.output.AccountRepository;

public class SqlAccountRepository implements AccountRepository {
    @Override
    public void save(Account account) {
        // Logic to open connection
        // SQL: INSERT INTO accounts (name, balance, type) VALUES (?, ?, ?)
        System.out.println("Saving account to SQL database: " + account.getAccountName());
    }
}
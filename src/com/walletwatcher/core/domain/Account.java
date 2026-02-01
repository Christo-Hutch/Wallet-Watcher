package com.walletwatcher.core.domain;

public abstract class Account {
    enum AccountType {
        CURRENT,
        SAVINGS,
        CREDIT,
        INVESTMENT
    }

    private String accountName;
    private int balanceInPence;

    public Account(String name, int initialBalance) {
        this.accountName = name;
        this.balanceInPence = initialBalance;
    }

    public abstract String getAccountType();

    public String getAccountName() {
        return this.accountName;
    }

    public int getAccountBalanceInPence() {
        return this.balanceInPence;
    }

    public void setAccountName(String name) {
        this.accountName = name;
    }

    public void setAccountBalanceInPence(int newAccountBalance) {
        this.balanceInPence = newAccountBalance;
    }
}
package com.walletwatcher.core.domain;

public class CurrentAccount extends Account {
    public CurrentAccount(String name, int balance){
        super(name, balance);
    }

    @Override
    public String getAccountType(){
        return "CURRENT";
    }
}
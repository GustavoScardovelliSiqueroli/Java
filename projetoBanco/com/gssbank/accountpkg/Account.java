package com.gssbank.accountpkg;

public class Account {

    private final String ID;
    private static int countAccount;

    public Account(CPF objcpf) {

        ID = objcpf.toIDString() + String.format("%d", countAccount);
        countAccount++;

    }

    public String getID() {
        return ID;
    }

}
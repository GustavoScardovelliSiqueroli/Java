package com.gssbank.accountpkg;

public class CPF {
    private final String cpf;

    public CPF(String cpf) {
        if (cpf.length() == 11) {
            this.cpf = cpf;
        } else {
            this.cpf = "00000000000";
        }
    }

    public String toStringCPF() {
        return cpf;
    }

    public String toIDString() {
        String s = "" + toStringCPF().charAt(0) + toStringCPF().charAt(3) + toStringCPF().charAt(6)
                + toStringCPF().charAt(9);
        return s;
    }
}

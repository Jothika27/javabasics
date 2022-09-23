package com.first.hashing;

public class Bay {
    int floorno;
    char wing;
    String bayno;
    String email;
    public Bay(int floorno, char wing, String bayno,String email) {
        this.floorno = floorno;
        this.wing = wing;
        this.bayno = bayno;
        this.email=email;
    }
    @Override
    public String toString() {
        return "Bay [bayno=" + bayno + ", floorno=" + floorno + ", wing=" + wing + ", Email=" + email + "]";
    }
   
}

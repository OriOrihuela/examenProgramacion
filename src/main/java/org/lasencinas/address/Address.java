package org.lasencinas.address;

import java.security.PrivateKey;
import java.security.PublicKey;
import org.lasencinas.gensig.GenSig;

public class Address {

    /* ---- Propiedades ---- */
    private PublicKey PK = null;
    private PrivateKey SK = null;
    private double balance = 0;
    private String symbol = "EZI";


    /* ---- Constructor ---- */

    public Address() {
    }

    /* ---- Getters and Setters --- */
    public PublicKey getPK() {
        return PK;
    }

    public void setPK(PublicKey PK) {
        this.PK = PK;
    }

    public PrivateKey getSK() {
        return SK;
    }

    public void setSK(PrivateKey SK) {
        this.SK = SK;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /* ---- Métodos de la clase ---- */
    public void generateKeyPair() {
        setPK(GenSig.generateKeyPair().getPublic());
    }
}

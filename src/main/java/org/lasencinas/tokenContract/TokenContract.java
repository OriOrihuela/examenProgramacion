package org.lasencinas.tokenContract;

import org.lasencinas.address.Address;


import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class TokenContract {

    /* ---- Propiedades ---- */
    private String name = null;
    private String symbol = null;
    private double totalSupply = 0;
    private PublicKey ownerPK = null;

    private List<Address> balances = new ArrayList<>();



    /* ---- Constructor ---- */
    public TokenContract(Address address) {
        this.ownerPK = address.getPK();
        this.symbol = address.getSymbol();
        this.totalSupply = address.getBalance();
    }


    /* ---- Getters & Setters ---- */
    public PublicKey getOwnerPK() {
        return ownerPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getTotalSupply() {
        return totalSupply;
    }

    public void setTotalSupply(double totalSupply) {
        this.totalSupply = totalSupply;
    }

    public List<Address> getBalances() {
        return balances;
    }

    public void setBalances(List<Address> balances) {
        this.balances = balances;
    }

    public void setOwnerPK(PublicKey ownerPK) {
        this.ownerPK = ownerPK;
    }

    /* ----- Métodos principales ---- */
    @Override
    public String toString() {
        return "\n" + "name = " + getName() + "\n" +
                "symbol = " + getSymbol() + "\n" +
                "totalSupply " + getTotalSupply() + "\n" +
                "owner PK " + getOwnerPK().hashCode();
    }

}

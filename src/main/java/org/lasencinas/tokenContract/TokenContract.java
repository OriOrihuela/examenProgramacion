package org.lasencinas.tokenContract;

import org.lasencinas.address.Address;


import java.security.PublicKey;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TokenContract {

    /* ---- Propiedades ---- */
    private String name = null;
    private String symbol = null;
    private double totalSupply = 0;
    private PublicKey ownerPK = null;

    private Map<Address, Double> balances = new HashMap<>();



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

    public double totalSupply() {
        return totalSupply;
    }

    public void setTotalSupply(double totalSupply) {
        this.totalSupply = totalSupply;
    }

    public Map<Address, Double> getBalances() {
        return balances;
    }

    public void setBalances(Map<Address, Double> balances) {
        this.balances = balances;
    }

    /* ----- Métodos principales ---- */
    @Override
    public String toString() {
        return "\n" + "name = " + getName() + "\n" +
                "symbol = " + getSymbol() + "\n" +
                "totalSupply " + totalSupply() + "\n" +
                "owner PK " + getOwnerPK().hashCode();
    }

    public void addOwner(PublicKey PK, Double units) {
        this.ownerPK = PK;
        this.totalSupply += units;
    }
}

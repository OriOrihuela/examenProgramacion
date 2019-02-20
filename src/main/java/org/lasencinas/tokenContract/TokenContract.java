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
    private String tokenSymbol = "USD";

    private Map<PublicKey, Double> balances = new HashMap<>();



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

    public String symbol() {
        return tokenSymbol;
    }

    public Map<PublicKey, Double> getBalances() {
        return balances;
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
        this.balances.put(PK, units);
    }

    public int numOwners() {
        int integerToReturn = 0;
        for (PublicKey key : this.balances.keySet()) {
            integerToReturn += 1;
        }
        return integerToReturn;
    }

    public double balanceOf(PublicKey owner) {
        try {
            return getBalances().get(owner);
        }catch (Exception e) {
            ;
        }
        return 0;
    }

}

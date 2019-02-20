package org.lasencinas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.address.Address;
import org.lasencinas.tokenContract.TokenContract;

import java.util.ArrayList;
import java.util.List;

public class TokenContractTest {

    private List<Address> balances = null;

    @Before
    public void __init__(){
        balances = new ArrayList<>();
    }

    @Test
    public void constructorTest(){
        assertNotNull(balances);
    }

    @Test
    public void gettersAndSettersTest() {

        /**
         * Elimino los balances del commit anterior ya que no forman parte del constructor, error mío ^^'.
         */

        Address address2 = new Address();
        address2.setSymbol("Mama");

        TokenContract tokenContract = new TokenContract(address2);
        assertEquals("Mama", tokenContract.getSymbol());
    }

    @Test
    public void payable_test() {

        Address rick = new Address();
        rick.generateKeyPair();
        TokenContract ricknillos = new TokenContract(rick);
        ricknillos.addOwner(rick.getPK(), 100d);
        assertEquals(100, ricknillos.totalSupply(), 0.01);
        Address morty = new Address();
        morty.generateKeyPair();
    }
}

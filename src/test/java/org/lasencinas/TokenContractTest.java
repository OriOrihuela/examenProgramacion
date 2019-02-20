package org.lasencinas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.address.Address;

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
         * Comprobaremos también que las entidades de tipo Address se insertan bien y
         * no nos salta nigún error ^^
         */

        Address address1 = new Address();
        address1.setBalance(100);
        balances.add(address1);

        Address address2 = new Address();
        address2.setSymbol("Mama");
        balances.add(address2);

        assertEquals(100, address1.getBalance(), 0.01);
        assertEquals("Mama", address2.getSymbol());




    }
}

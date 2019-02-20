package org.lasencinas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.address.Address;

public class AddressTest {

    private Address address = null;

    @Before
    public void __init__() {
        address = new Address();
    }

    @Test
    public void constructorTest() {
        assertNotNull(address);
    }

    @Test
    public void getBalanceTest() {
        address.setBalance(100);
        assertEquals(100, address.getBalance(), 0.01);
    }
}

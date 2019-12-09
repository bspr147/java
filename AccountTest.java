package com.hcl.bank;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {
	static Account account=null;
	@BeforeClass
	public static void setUp()
	{
		account=new Account();
	}
    @Test
	public void testGettersAndSetters() {
		account=new Account();
		account.setAccountNo(1);
		account.setFirstName("sandeep");
		account.setLastName("hcl");
		account.setCity("chennai");
		account.setState("tn");
		account.setAmount(7444);
		account.setCheqFacil("yes");
		account.setAccountType("savings");
		assertEquals(1,account.getAccountNo());
		assertEquals("sandeep",account.getFirstName());
		assertEquals("hcl",account.getLastName());
		assertEquals("chennai",account.getCity());
		assertEquals("tn",account.getState());
		assertEquals(7444,account.getAmount());
		assertEquals("yes",account.getCheqFacil());
		assertEquals("savings",account.getAccountType());
    }
    
    

}

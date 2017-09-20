package test;

import static org.junit.Assert.*;

import org.junit.Test;

import proj.Account;

public class NegAmount {
	Account acc = new Account();
	@Test
	public void TestNegativeInputDeposit() 
	{
		
		acc.deposit(-20);
		assertEquals(0, acc.getBalance(),0);
	}
	
	public void TestNegativeInputWithdrawal() 
	{
		
		acc.deposit(-100);
		assertEquals(0, acc.getBalance(),0);
	}

	public void TestNegativeBalanceWithdrawal() 
	{
		
		acc.deposit(200);
		acc.withdrawal(100000);
		assertEquals(200, acc.getBalance(),0);
	}
	
}

package com.hcl.bank;


import java.util.Scanner;

public class SearchAccountMain {
public static void main(String[] args) {
	int accountNo;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter AccountNo :- ");
	accountNo=sc.nextInt();
	AccountDAO dao=new AccountDAO();
	Account account=dao.searchAccount(accountNo);
	if(account!=null){
		System.out.println("First Name " +account.getFirstName());
		System.out.println("Last Name " + account.getLastName());
		
	}else{
		System.out.println("AccountNo NOT Found!!....");
	}
}
}

/**
 * 
 */
package com.ss.sb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ss.sb.dao.AccountDAO;
import com.ss.sb.dao.UserDAO;
import com.ss.sb.de.Account;
import com.ss.sb.de.User;

/**
 * @author heman
 *
 */
@Service
public class AccountService {
	
	@Autowired
	AccountDAO adao;
	
	@Autowired
	UserDAO udao;
	
	public ResponseEntity<List<Account>> getAllAccounts(){
		List<Account> accounts = new ArrayList<>();
		adao.findAll().forEach(accounts::add);
		
		return new ResponseEntity<List<Account>>(accounts, HttpStatus.OK);
	}
	
	public Account createAccount(String username, int account_type_id) {
		int user_id = checkifUserExists(username);
		if(user_id == 0) {
			return null;
		}
		
		Account account = new Account();
		account.setAccount_type_id(account_type_id);
		account.setInvesting_id(1);
		account.setTransaction_id(1);
		account.setUser_id(user_id);
		
		adao.save(account);
		return account;
		
	}
	
	private int checkifUserExists(String username) {
		List<User> users = new ArrayList<>();
		udao.findAll().forEach(users::add);
		for(User u: users) {
			if(u.getUsername().equals(username)) {
				return u.getUser_id();
			}
		}
		return 0;
	}

}

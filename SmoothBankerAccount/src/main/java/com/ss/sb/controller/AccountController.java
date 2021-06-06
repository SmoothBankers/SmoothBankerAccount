/**
 * 
 */
package com.ss.sb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ss.sb.de.Account;
import com.ss.sb.service.AccountService;

/**
 * @author heman
 *
 */
@RestController
@RequestMapping("/accounts")
public class AccountController {
	
	@Autowired
	AccountService service;

	@CrossOrigin
	@GetMapping
	public ResponseEntity<List<Account>> getAllAccounts() {
		return service.getAllAccounts();
	}
	
	@CrossOrigin
	@PostMapping
	public Account createAccount(String username, int account_type_id) {
		int a =1;
		return service.createAccount(username, account_type_id);
	}
}

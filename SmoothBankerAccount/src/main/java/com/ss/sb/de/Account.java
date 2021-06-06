/**
 * 
 */
package com.ss.sb.de;

import javax.persistence.*;

/**
 * @author heman
 *
 */

@Entity
@Table(name = "account")
public class Account {

	@Id
	private int account_id;
	private int user_id;
	private int transaction_id;
	private int investing_id;
	private int account_type_id;

	/**
	 * @return the account_type_id
	 */
	public int getAccount_type_id() {
		return account_type_id;
	}

	/**
	 * @param account_type_id the account_type_id to set
	 */
	public void setAccount_type_id(int account_type_id) {
		this.account_type_id = account_type_id;
	}

	@ManyToOne
	private AccountType account_type;
	
	@ManyToOne
	private User user;

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the account_id
	 */
	public int getAccount_id() {
		return account_id;
	}

	/**
	 * @param account_id the account_id to set
	 */
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	/**
	 * @return the user_id
	 */
	public int getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	/**
	 * @return the transaction_id
	 */
	public int getTransaction_id() {
		return transaction_id;
	}

	/**
	 * @param transaction_id the transaction_id to set
	 */
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}

	/**
	 * @return the investing_id
	 */
	public int getInvesting_id() {
		return investing_id;
	}

	/**
	 * @param investing_id the investing_id to set
	 */
	public void setInvesting_id(int investing_id) {
		this.investing_id = investing_id;
	}

	/**
	 * @return the account_type
	 */
	public AccountType getAccount_type() {
		return account_type;
	}

	/**
	 * @param account_type the account_type to set
	 */
	public void setAccount_type(AccountType account_type) {
		this.account_type = account_type;
	}

	@Override
	public String toString() {
		return "Account [account_id=" + account_id + ", transaction_id=" + transaction_id + ", investing_id="
				+ investing_id + ", account_type=" + account_type + ", user=" + user + "]";
	}

}

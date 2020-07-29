package com.Nalini.dao;

import java.util.List;

import com.Nalini.Model.Address;
import com.Nalini.Model.User;

public interface UserDAO {
	boolean addUser(User user);

	boolean addAddress(Address address);

//	Address getBillingAddress(int userId);
 //List<Address> listShippingAddresses(int userId);
	Address getAddress(int addressId);
	Address getBillingAddress(User user);

	List<Address> listShippingAddresses(User user);

	User getByEmail(String email);
	User get(int id);

	//Address getBillingAddress(int userId);
}

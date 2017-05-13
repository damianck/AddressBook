package com.addressbook.pl;

import java.io.Serializable;

public class Contact implements Serializable {
	private static final long serialVersionUID = 1L;
	private Person person;
	private Address address;

	public Contact(Person person, Address address) {
		super();
		this.person = person;
		this.address = address;
	}

	public Contact(Contact contact) {
		this.person = contact.getPerson();
		this.address = contact.getAddress();
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}

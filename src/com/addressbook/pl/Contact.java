package com.addressbook.pl;

import java.io.Serializable;
import java.util.Comparator;

public class Contact implements Serializable, Comparable<Contact>, Comparator<Contact> {
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

	@Override
	public String toString() {
		return "Contact " + person + ", " + address;
	}

	// GENERATED BY ECLIPSE
	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + ((address == null) ? 0 : address.hashCode());
		result = 31 * result + ((person == null) ? 0 : person.hashCode());
		return result;
	}

	// GENERATED BY ECLIPSE TODO CHANGE
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		return true;
	}

	@Override
	public int compareTo(Contact o) {
		int x = person.getLastName().compareTo(o.getPerson().getLastName());
		if (x == 0) {
			return person.getName().compareTo(o.getPerson().getName());
		}
		return x;
	}

	@Override
	public int compare(Contact arg0, Contact arg1) {
		return 0;
	}
}

package com.addressbook.pl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AddressBook implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<Contact> contacts;

	public AddressBook() {
		contacts = new ArrayList<>();
	}

	public AddressBook(List<Contact> contacts) {
		this();
		this.contacts.addAll(contacts);
	}

	public void addContact(Contact contact) {
		if (contact != null && !contacts.contains(contact)) {
			contacts.add(contact);
		} else {
			System.out.println("Something went wrong :(");
		}
	}

	public void removeContact(Contact contact) {
		if (contacts != null || contacts.size() != 0) {
			contacts.remove(contact);
		} else {
			System.out.println("Something went wrong :(");
		}
	}

	public boolean hasContact(Contact contact) {
		return contacts.contains(contact) ? true : false;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public int getSize() {
		return contacts.size();
	}

}

package com.addressbook.pl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Tests {

	AddressBook addressbook = new AddressBook();
	List<Contact> listOfContacts = new ArrayList<>();
	Contact _contact;

	@Before
	public void setUp() {
		listOfContacts.add(new Contact(new Person("John", "N"),
				new Address("Oxford Street", "London", "United Kingdom", "222-112")));
		listOfContacts.add(
				new Contact(new Person("Hans", "Zimmer"), new Address("Kreuzberg", "Berlin", "German", "111-222")));
		listOfContacts
				.add(new Contact(new Person("Jan", "Nowak"), new Address("Szewska", "Cracow", "Poland", "542-151")));

		_contact = new Contact(new Person("Paul", "Muller"),
				new Address("Unter den Linden", "Berlin", "Gernman", "132-151"));
	}

	@Test
	public void testContact() {
		// Adding records
		for (Contact contact : listOfContacts)
			addressbook.addContact(contact);

		assertTrue(addressbook.getSize() == 3);
		assertTrue(addressbook.hasContact(listOfContacts.get(0)));
		assertFalse(addressbook.hasContact(_contact));

		addressbook.removeContact(listOfContacts.get(0));
		assertTrue(addressbook.getSize() == 2);

		List<Contact> c = addressbook.getContacts();

		for (Contact con : c) {
			System.out.println(con.getPerson().getName() + " - " + con.getAddress().getCity());
		}

	}

}

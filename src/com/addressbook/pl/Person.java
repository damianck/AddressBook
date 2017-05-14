package com.addressbook.pl;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private String lastName;

	public Person(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "[" + name + " " + lastName + "]";
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = 31 * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	// @Override
	// public int compareTo(Person o) {
	// int _lastName = lastName.compareTo(o.lastName);
	// if (_lastName == 0) {
	// return name.compareTo(o.name);
	// } else {
	// return _lastName;
	// }
	// }
}

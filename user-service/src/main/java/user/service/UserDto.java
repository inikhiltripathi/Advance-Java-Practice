package user.service;

import java.util.ArrayList;

public class UserDto {

	private String id;
	private String name;
	private ArrayList<Contacts> contacts;

	public UserDto() {
	}

	public UserDto(String id, String name, ArrayList<Contacts> contacts) {
		super();
		this.id = id;
		this.name = name;
		this.contacts = contacts;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Contacts> getContacts() {
		return contacts;
	}

	public void setContacts(ArrayList<Contacts> contacts) {
		this.contacts = contacts;
	}

}

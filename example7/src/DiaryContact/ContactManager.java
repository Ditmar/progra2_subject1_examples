package DiaryContact;
import java.util.ArrayList;
import java.util.HashMap;
public class ContactManager {
	private HashMap<String, Contact> contacts;
	public ContactManager() {
		
		this.contacts = new HashMap();
	}
	public void addContacts(Contact contact) {
		if (!this.contacts.containsKey(contact.getEmail())) {
			this.contacts.put(contact.getEmail(), contact);
		}
	}
	public Contact searchContact(String email) {
		return this.contacts.get(email);
	}
	public void removeContact(String email) {
		this.contacts.remove(email);
	}
	public void showContact() {
		for (Contact contact : this.contacts.values()) {
			System.out.println(
					"Nombre " + contact.getName() + 
					" phone " + contact.getPhone() + 
					" Email " + contact.getEmail());
		}
	}

}

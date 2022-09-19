package example7;

import java.util.Scanner;

import DiaryContact.Contact;
import DiaryContact.ContactManager;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		String option = "";
		ContactManager contactManager = new ContactManager();
		do {
			
			printMenu();
			option = read.nextLine();
			switch (option) {
				case "1" : {
					System.out.println("Escriba el nombre");
					String name = read.nextLine();
					System.out.println("Escriba su email");
					String email = read.nextLine();
					System.out.println("Escriba su telefono");
					String phone = read.nextLine();
					Contact contact = new Contact(name, email, phone);
					contactManager.addContacts(contact);
					
					break;
				}
				case "2" : {
					System.out.println("Escriba un email para buscar");
					String email = read.nextLine();
					Contact result = contactManager.searchContact(email);
					if (result == null) {
						System.out.println("Contacto no encontrado");
						break;
					}
					System.out.println(
							"Nombre " + result.getName() + 
							" phone " + result.getPhone() + 
							" Email " + result.getEmail());
					break;
				}
				case "3" : {
					System.out.println("Borrar contactos");
					String email = read.nextLine();
					contactManager.removeContact(email);
					break;
				}
				case "4" : {
					contactManager.showContact();
					break;
				}
				
			}
			
		} while (!option.equals("5"));
		System.out.println("bye");
	}
	public static void printMenu() {
		System.out.println("1) Añadir contactos");
		System.out.println("2) Buscar contactos");
		System.out.println("3) Eliminar contactos");
		System.out.println("4) Mostrar contactos");
		System.out.println("5) salir");
	}

}

package org.snhu.cs320.contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    @Test
    public void testAddContactSuccessfully() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "John", "Smith", "2075551234", "123 Main Street");

        service.addContact(contact);

        assertEquals(contact, service.getContact("12345"));
    }

    @Test
    public void testCannotAddDuplicateContactId() {
        ContactService service = new ContactService();

        Contact contactOne = new Contact("12345", "John", "Smith", "2075551234", "123 Main Street");
        Contact contactTwo = new Contact("12345", "Jane", "Jones", "2075555678", "456 Oak Street");

        service.addContact(contactOne);

        assertThrows(IllegalArgumentException.class, () -> {
            service.addContact(contactTwo);
        });
    }

    @Test
    public void testDeleteContactSuccessfully() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "John", "Smith", "2075551234", "123 Main Street");

        service.addContact(contact);
        service.deleteContact("12345");

        assertThrows(IllegalArgumentException.class, () -> {
            service.getContact("12345");
        });
    }

    @Test
    public void testUpdateFirstNameSuccessfully() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "John", "Smith", "2075551234", "123 Main Street");

        service.addContact(contact);
        service.updateFirstName("12345", "Mike");

        assertEquals("Mike", service.getContact("12345").getFirstName());
    }

    @Test
    public void testUpdateLastNameSuccessfully() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "John", "Smith", "2075551234", "123 Main Street");

        service.addContact(contact);
        service.updateLastName("12345", "Jones");

        assertEquals("Jones", service.getContact("12345").getLastName());
    }

    @Test
    public void testUpdatePhoneSuccessfully() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "John", "Smith", "2075551234", "123 Main Street");

        service.addContact(contact);
        service.updatePhone("12345", "2075555678");

        assertEquals("2075555678", service.getContact("12345").getPhone());
    }

    @Test
    public void testUpdateAddressSuccessfully() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "John", "Smith", "2075551234", "123 Main Street");

        service.addContact(contact);
        service.updateAddress("12345", "456 Oak Street");

        assertEquals("456 Oak Street", service.getContact("12345").getAddress());
    }

    @Test
    public void testCannotUpdateInvalidContactId() {
        ContactService service = new ContactService();

        assertThrows(IllegalArgumentException.class, () -> {
            service.updateFirstName("99999", "Mike");
        });
    }
}
package org.snhu.cs320.contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test
    public void testContactCreatedSuccessfully() {
        Contact contact = new Contact("12345", "John", "Smith", "2075551234", "123 Main Street");

        assertEquals("12345", contact.getContactId());
        assertEquals("John", contact.getFirstName());
        assertEquals("Smith", contact.getLastName());
        assertEquals("2075551234", contact.getPhone());
        assertEquals("123 Main Street", contact.getAddress());
    }

    @Test
    public void testContactIdCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "John", "Smith", "2075551234", "123 Main Street");
        });
    }

    @Test
    public void testContactIdCannotBeLongerThanTenCharacters() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "John", "Smith", "2075551234", "123 Main Street");
        });
    }

    @Test
    public void testFirstNameCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", null, "Smith", "2075551234", "123 Main Street");
        });
    }

    @Test
    public void testFirstNameCannotBeLongerThanTenCharacters() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "JohnathanLong", "Smith", "2075551234", "123 Main Street");
        });
    }

    @Test
    public void testLastNameCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", null, "2075551234", "123 Main Street");
        });
    }

    @Test
    public void testLastNameCannotBeLongerThanTenCharacters() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Smithsonian", "2075551234", "123 Main Street");
        });
    }

    @Test
    public void testPhoneCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Smith", null, "123 Main Street");
        });
    }

    @Test
    public void testPhoneMustBeExactlyTenDigits() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Smith", "207555123", "123 Main Street");
        });
    }

    @Test
    public void testPhoneCannotContainLetters() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Smith", "207ABC1234", "123 Main Street");
        });
    }

    @Test
    public void testAddressCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Smith", "2075551234", null);
        });
    }

    @Test
    public void testAddressCannotBeLongerThanThirtyCharacters() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Smith", "2075551234", "123 Main Street Apartment 9999 Long");
        });
    }

    @Test
    public void testContactIdIsNotUpdatable() {
        Contact contact = new Contact("12345", "John", "Smith", "2075551234", "123 Main Street");

        assertEquals("12345", contact.getContactId());
    }
}
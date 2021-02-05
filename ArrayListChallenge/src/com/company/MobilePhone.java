package com.company;

import java.util.ArrayList;


public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> contacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contacts = new ArrayList<Contact>();
    }

    public void printContacts() {
        for(Contact contact : this.contacts) {
            System.out.println(contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }

    public String queryContact(Contact contact) {
        if(findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if(position >= 0) {
            return this.contacts.get(position);
        }
        return null;
    }

    public boolean addContact(Contact contact) {
        if(findContact(contact.getName()) != -1){
//            System.out.println("Contact already exists");
            return false;
        }
        this.contacts.add(contact);
//        System.out.println(contact.getName() + " was added as a new contact.");
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0) {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        } else if(findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() +
                    " already exists. Update was not successful.");
            return false;
        }
        contacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with" + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int contactIndex = findContact(contact);
        if(contactIndex == -1) {
            System.out.println(contact.getName() + " is not a contact.");
            return false;
        }
        else {
            this.contacts.remove(contactIndex);
            System.out.println("Removed " + contact.getName() + " from Contacts.");
        }
        return true;
    }

    private int findContact(Contact contact) {
        return this.contacts.indexOf(contact);
    }

    private int findContact(String searchName) {
        for(int i = 0; i < this.contacts.size(); i++) {
            Contact curr = this.contacts.get(i);
            if(curr.getName().equals(searchName)) return i;
        }
        return -1;
    }

}

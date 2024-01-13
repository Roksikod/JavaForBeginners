package ru.itmo.basics.lesson11.prototype;

public class PhonebookFactory {
    private Phonebook phoneBook;

    public PhonebookFactory(Phonebook phoneBook) {
        this.phoneBook = phoneBook;
    }

    public void setPhoneBook(Phonebook phoneBook) {
        this.phoneBook = phoneBook;
    }

    public Phonebook clonePhonebook() {
        return (Phonebook)this.phoneBook.copy();
    }

}

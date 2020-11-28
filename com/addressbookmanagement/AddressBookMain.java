package com.addressbookmanagement;

import java.util.Scanner;

public class AddressBookMain {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("********* Welcome to Address Book Management System *********");

        AddressBookMain book = new AddressBookMain();
        book.addressBookAction();
    }


    public void addressBookAction() {
        AddressBookManagerImp addressbookmanager = new AddressBookManagerImp();

        while (true) {

            System.out.println("\n *** Address Book ***"
                    + "\n1. Create newAddressBook"
                    + "\n2. Open Existing AddressBook"
                    + "\n3. Display Existing AddressBook"
                    + "\n  select any choice ==> ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addressbookmanager.newAddressBook();
                    break;
                case 2:
                    addressbookmanager.openAddressBook();
                    break;
                case 3:
                    addressbookmanager.displayAddressBook();
                    break;
                default:
                    System.out.println("please enter right choice");
            }
        }
    }
}
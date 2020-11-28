package com.addressbookmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookManagerImp implements AddressBookManagerInterface {

    AddressBookImplementation Menu = new AddressBookImplementation();
    AddressBookMain book = new AddressBookMain();

    Scanner scanner = new Scanner(System.in);
    ArrayList<AddressBookList> addressBookNameList = new ArrayList<>();

    public void newAddressBook() {

        System.out.println("Enter AddressBook Name");
        String userInputBookName = scanner.next();
        AddressBookList addressbook = new AddressBookList(userInputBookName);
        addressBookNameList.add(addressbook);
        System.out.println("New Address Book Name is added to list");
    }

    public void displayAddressBook() {

        System.out.println("Existing AddressBook Names are : ");

        for (AddressBookList addressBookList : addressBookNameList) {
            System.out.println(addressBookList);
        }
    }

    public void openAddressBook() {

        System.out.println("Enter Adddress Book Name to open : ");
        String openAddressbookName = scanner.next();
        while (true) {
            System.out.println("\n Address Book Name is :  " + openAddressbookName + "\n"
                    + " Select Operation in address book\n"
                    + "1) add Person\n"
                    + "2) Display Person \n"
                    + "3) Edit Person\n"
                    + "4) delete Person\n"
                    + "5) <== back to previous menu\n"
                    + "\n select any choice ==> ");
            int num = scanner.nextInt();

            switch (num) {
                case 1 -> Menu.addPerson();

                case 2 -> Menu.displayPerson();

                case 3 -> Menu.editPerson();

                case 4 -> Menu.deletePerson();

                case 5 -> book.addressBookAction();

                default -> throw new IllegalStateException("Unexpected value: " + num);
            }
        }
    }
}
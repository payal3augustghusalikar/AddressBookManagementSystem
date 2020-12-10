package com.addressbookmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookManagerImp implements AddressBookManagerInterface {

    AddressBookImplementation Menu = new AddressBookImplementation();
    AddressBookMain book = new AddressBookMain();

    ArrayList<Person> addressBook = new ArrayList<Person>();


    Scanner scanner = new Scanner(System.in);
    ArrayList<AddressBookList> addressBookNameList = new ArrayList<>();

    public void newAddressBook() {

        System.out.println("Enter AddressBook Name");
        String userInputBookName = scanner.next();

        AddressBookList multiaddressbook = new AddressBookList(userInputBookName);
        addressBookNameList.add(multiaddressbook);
        System.out.println("New Address Book Name is added to list");
    }

    public void displayAddressBook() {
        System.out.println("Existing AddressBook Names are : ");

        for (AddressBookList addressBookList : addressBookNameList) {
            System.out.println(addressBookList);
        }
    }

    public void openAddressBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Adddress Book Name to open : ");
        String openAddressbookName = scanner.nextLine();

        for (int j = 0; j < addressBookNameList.size(); j++) {
            String checkBookName = addressBookNameList.get(j).userInputBookName;

            if (openAddressbookName.equals(checkBookName)) {
                while (true) {
                    System.out.println("\n Address Book Name is :  " + openAddressbookName + "\n"
                            + " Select Operation in address book\n"
                            + "1) add Person\n"
                            + "2) Display Person \n"
                            + "3) Edit Person\n"
                            + "4) delete Person\n"
                            + "5) search by city\n"
                            + "6) search by state \n"
                            + "7) count by city\n"
                            + "8) count by State\n"
                            + "9) sort entry by first name\n"
                            + "10) sort entry by City\n"
                            + "11) sort entry by State\n"
                            + "12) sort entry by Zip\n"
                            + "13) <== back to previous menu\n"
                            + "\n select any choice ==> ");
                    int num = scanner.nextInt();

                    switch (num) {
                        case 1 -> Menu.addPerson();

                        case 2 -> Menu.displayPerson();

                        case 3 -> Menu.editPerson();

                        case 4 -> Menu.deletePerson();

                        case 5 -> Menu.searchPersonByCity();

                        case 6 -> Menu.searchPersonByState();

                        case 7 -> Menu.countByCity();

                        case 8 -> Menu.countByState();

                        case 9 -> Menu.sortPersonByFirstName();

                        case 10 -> Menu.sortPersonByCity();

                        case 11 -> Menu.sortPersonByState();

                        case 12 -> Menu.sortPersonByZip();

                        case 13 -> book.addressBookAction();

                        default -> throw new IllegalStateException("Unexpected value: " + num);
                    }
                }
            } else
                System.out.println("this address book is not present First create it!!!");
            break;
        }
    }
}



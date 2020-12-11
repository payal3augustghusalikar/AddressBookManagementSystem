package com.addressbookmanagement;

import java.util.ArrayList;
import java.util.Scanner;

import static com.addressbookmanagement.AddressBookImplementation.addressBook;

public class AddressBookMain {
    Scanner scanner = new Scanner(System.in);
    private Object ArrayList;

    public static void main(String[] args) {

        ArrayList<AddressBookList> addressBookNameList = new ArrayList<>();
        System.out.println("********* Welcome to Address Book Management System *********");

        AddressBookMain book = new AddressBookMain();
        book.addressBookAction();
    }
    /*public static void printArrayListToFile( ArrayList<Person> addressBook, String filename) throws IOException {
        try (PrintWriter writer = new PrintWriter(filename)) {
            for (Person line : addressBook) {
                writer.println(line);
            }
            writer.close();
        }
    }*/
    //public void writeDataIntiCSV() {
        /*ArrayList<AddressBookList> addressBookNameList = new ArrayList<>();
        ArrayList<Person> addressBook = new ArrayList<>();
        AddressBookImplementation writeDataIntoTXT = new AddressBookImplementation();
        File fileName = new File(
                ArrayList<Person> addressBook = new ArrayList<Person>());
        Person person;
        while (!addressBook.isEmpty()) {
            System.out.println("Add Person Data");
            Person person = writeDataIntoTXT.addPerson();

            if (!addressBook.isEmpty())
                addressBook.add(person);
            break;
        }
        try {
            FileWriter fw = new FileWriter(fileName);
            Writer output = new BufferedWriter(fw);
            int sz = addressBook.size();

            for (int i = 0; i < sz; i++) {
                output.write(addressBook.get(i).toString() + "\n");
            }
            output.close();
        } catch (Exception e) {
            System.out.println("I cannot create the file");
        }
    }*/
    /*public void createFile() {
        ArrayList<AddressBookList> addressBookNameList = new ArrayList<>();
        File fileName = new File("AddressBook.txt");
        AddressBookList addressBookData = " ";
        while (!addressBookData.isEmpty()) {
            addressBookData = JOptionPane.showInputDialog("Name a friend, Please");
            System.out.println("Add Person Data");
            if (!addressBookData.isEmpty())
               addressBookNameList.add(addressBookData);
            break;
        }
        try {
            FileWriter fw = new FileWriter(fileName);
            Writer output = new BufferedWriter(fw);
            int sz = addressBookNameList.size();

            for (int i = 0; i < sz; i++) {
                output.write(addressBookNameList.get(i).toString() + "\n");
            }
            output.close();
        } catch (Exception e) {
            System.out.println("I cannot create the file");
        }
    }
*/

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
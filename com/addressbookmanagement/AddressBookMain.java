package com.addressbookmanagement;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("********* Welcome to Address Book Management System *********");
        Scanner input = new Scanner(System.in);

        AddressBookImplementation Menu = new AddressBookImplementation();

        int loop=0;
        while (loop == 0) {

            System.out.println("\n ---- Address Book Person ----\n"
                    + "1) add Person\n"
                    + "2) Display Person \n"
                    + "3) Edit Person\n"
                    + "4) delete Person\n"
                    + "\n select any choice ==> ");
            int num = input.nextInt();

            switch (num) {
                case 1 -> Menu.addPerson();
                case 2 -> Menu.displayPerson();
                case 3 -> Menu.editPerson();
                case 4 ->
                    Menu.deletePerson();
                
                default -> throw new IllegalStateException("Unexpected value: " + num);
            }
        }
    }
}


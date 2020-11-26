package com.addressbookmanagement;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("********* Welcome to Address Book Management System *********");

        Scanner input = new Scanner(System.in);

        AddressBookImplementation Menu = new AddressBookImplementation();

        int loop = 0;
        while (loop == 0) {

            System.out.println("\n ---- Address Book ----"
                + "\n1. add Person"
                + "\n2. display Person"
                + "\n  select any choice ==> ");
            int num = input.nextInt();

            switch (num) {
                case 1:
                    Menu.addPerson();
                    break;
                case 2:
                    Menu.displayPerson();
                loop = 1;
                break;
                default:
                    System.out.println("please enter right choice");
            }
        }
    }
}

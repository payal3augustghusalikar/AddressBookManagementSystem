package com.addressbookmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookImplementation implements AddressBookInterface{

    ArrayList<Person> addressBook = new ArrayList<Person>();
    Scanner scanner = new Scanner(System.in);

    public void addPerson() {

        System.out.println("enter your first name:");
        String firstName = scanner.nextLine();
        System.out.println("enter your last name:");
        String lastName = scanner.nextLine();
        System.out.println("enter your city");
        String city = scanner.nextLine();
        System.out.println("enter your state");
        String state = scanner.nextLine();
        System.out.println("enter your email");
        String email = scanner.nextLine();
        System.out.println("enter your phone");
        long MobileNo = scanner.nextLong();
        System.out.println("enter your zip code");
        int zip = scanner.nextInt();

        Person person = new Person(firstName, lastName, city, state, email, MobileNo, zip);
        addressBook.add(person);
        System.out.println("Your Details has taken");
    }

    public void displayPerson() {
        System.out.println("\nEntered Person Details is:");
        for (Person person : addressBook) {
            System.out.println(person.toString());
        }
    }
}

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

    public void editPerson() {
        Scanner inp = new Scanner(System.in);

        System.out.println("\n enter First name to edit details:");
        String name = inp.nextLine();

        for (Person person : addressBook) {
            System.out.println(person.toString());

            if (name.equals(person.firstName)) {

                System.out.println("\"Select the option to edit: \n"
                        + "1) Mobile no\n"
                        + "2) Email-Id\n"
                        + "3) Address\n"
                        + "4) Quit");
                int numb = inp.nextInt();
                inp = new Scanner(System.in);
                switch (numb) {
                    case 1 -> {
                        System.out.println("enter new Mobile number:");
                        long mobileNo = inp.nextLong();
                        person.setMobileNo(mobileNo);
                        System.out.println("mobile no. is updated\n");
                    }
                    case 2 -> {
                        System.out.println("enter new Email-id:");
                        String email = inp.nextLine();
                        person.setEmail(email);
                        System.out.println("Email-id is updated\n");
                    }
                    case 3 -> {
                        System.out.println("enter your city");
                        String city = inp.nextLine();
                        System.out.println("enter your state");
                        String state = inp.nextLine();
                        System.out.println("enter your zip code");
                        int zip = inp.nextInt();
                        person.setCity(city);
                        person.setState(state);
                        person.setZip(zip);
                        System.out.println("Address is updated\n");
                    }
                    default -> System.out.println("please enter right choice");
                }
            }
            else
                System.out.println("Person is not registered");
            break;
        }
    }
}

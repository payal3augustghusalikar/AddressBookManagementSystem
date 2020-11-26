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
        System.out.println("\n you can add multile person's entry");
    }

    public void displayPerson() {
        System.out.println("\nEntered Person Details is:");
        for (Person person : addressBook) {
            System.out.println(person.toString());
        }
    }

    public void editPerson() {

        System.out.println("\n enter First name to edit details:");
        String name = scanner.nextLine();

        for (Person person : addressBook) {
            System.out.println(person.toString());

            if (name.equals(person.firstName)) {

                System.out.println("\"Select the option to edit: \n"
                        + "1) Mobile no\n"
                        + "2) Email-Id\n"
                        + "3) Address\n"
                        + "4) Quit");
                int numb = scanner.nextInt();

                switch (numb) {
                    case 1 -> {
                        System.out.println("enter new Mobile number:");
                        long mobileNo = scanner.nextLong();
                        person.setMobileNo(mobileNo);
                        System.out.println("mobile no. is updated\n");
                    }
                    case 2 -> {
                        System.out.println("enter new Email-id:");
                        String email = scanner.nextLine();
                        person.setEmail(email);
                        System.out.println("Email-id is updated\n");
                    }
                    case 3 -> {
                        System.out.println("enter your city");
                        String city = scanner.nextLine();
                        System.out.println("enter your state");
                        String state = scanner.nextLine();
                        System.out.println("enter your zip code");
                        int zip = scanner.nextInt();
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
        }
    }

    public void deletePerson() {

        System.out.println("enter First name to delit details:");
        String name = scanner.nextLine();

        for (int i=0; i<addressBook.size(); i++) {
            String personName = addressBook.get(i).firstName;

            if (name.equals(personName)) {
                addressBook.remove(i);
                System.out.println("this person details is deleted");
                break;
            }
            else
                System.out.println("please enter valid name");
        }
    }
}

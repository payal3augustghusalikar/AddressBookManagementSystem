package com.addressbookmanagement;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBookImplementation implements AddressBookInterface {
    Person person;
    Scanner scanner = new Scanner(System.in);
    public static ArrayList<Person> addressBook = new ArrayList<Person>();

    public AddressBookImplementation() {
        ArrayList<Person> addressBook = new ArrayList<Person>();
    }

    public void addPerson() {

        System.out.println("Enter your first name");
        String personName1 = scanner.nextLine();

        duplicateCheck(personName1);

        Scanner scanner = new Scanner(System.in);
        // System.out.println(" confirm your first name :");
        String firstName = personName1;
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

        person = new Person(firstName, lastName, city, state, email, MobileNo, zip);
        addressBook.add(person);

        System.out.println("Your Details has taken");
        System.out.println("\n you can add multiple person's entry");
        System.out.println("------------------------------------");
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

        for (int p = 0; p < addressBook.size(); p++) {
            String personName = addressBook.get(p).firstName;

            if (name.equals(personName)) {

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
                        break;
                    }
                    default -> System.out.println("please enter right choice");
                }
            } else
                System.out.println("Person is not registered");
            break;
        }
    }


    public void deletePerson() {
        System.out.println("enter First name to delit details:");
        String fname = scanner.nextLine();

        for (int i = 0; i < addressBook.size(); i++) {
            String personName = addressBook.get(i).firstName;

            if (fname.equals(personName)) {
                addressBook.remove(i);
                System.out.println("this person details is deleted");
                break;
            } else
                System.out.println("please enter valid name");
        }
    }


    public void duplicateCheck(String personName1) {

        for (int k = 0; k < addressBook.size(); k++) {
            String personName = addressBook.get(k).getFirstName();

            if (personName1.equals(personName)) {
                System.out.println("this person" + personName1 + "is already present add another one");
                addPerson();
                break;
            } else
                System.out.println("you can add this person");
            break;
        }
    }


    public void searchPersonByCity() {
        System.out.println("Enter City to Search Person");
        String userCity = scanner.nextLine();
        System.out.println("The person list for same city are :");
        addressBook.stream().filter(map -> map.getCity().contains(userCity))
                .forEach(addressBook -> System.out.println(addressBook));
    }

    public void searchPersonByState() {
        System.out.println("Enter the state to Search Person by state");
        String userState = scanner.nextLine();
        System.out.println("The person list for same state are :");
        addressBook.stream().filter(map -> map.getState().contains(userState))
                .forEach(addressBook -> System.out.println(addressBook));
    }

    public void countByCity() {

        System.out.println(addressBook.stream().collect(Collectors.groupingBy((Person P) -> P.getCity())));
        System.out.println(addressBook.stream().collect(Collectors.groupingBy((Person P) -> P.getCity(),
                Collectors.counting())));
    }

    public void countByState() {

        System.out.println(addressBook.stream().collect(Collectors.groupingBy((Person P) -> P.getState())));
        System.out.println(addressBook.stream().collect(Collectors.groupingBy((Person P) -> P.getState(),
                Collectors.counting())));
    }
}

package com.addressbookmanagement;

public class AddressBookList {

  String userInputBookName;

    public AddressBookList(String userInputBookName) {
        this.userInputBookName = userInputBookName;
    }

    public String getUserInputBookName() {
        return userInputBookName;
    }

    public void setUserInputBookName(String userInputBookName) {
        this.userInputBookName = userInputBookName;
    }

    public String toString() {
        return "AddressBookName : " + userInputBookName + "\n";
    }
}


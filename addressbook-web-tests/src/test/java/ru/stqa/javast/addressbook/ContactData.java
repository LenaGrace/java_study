package ru.stqa.javast.addressbook;

public class ContactData {
    private final String middlename;
    private final String nickname;
    private final String company;
    private final String address;
    private final String mobile;
    private final String firstname;

    public ContactData(String middlename, String nickname, String company, String address, String mobile, String firstname) {
        this.middlename = middlename;
        this.nickname = nickname;
        this.company = company;
        this.address = address;
        this.mobile = mobile;
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getNickname() {
        return nickname;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getMobile() {
        return mobile;
    }

    public String getFirstname() {
        return firstname;
    }
}

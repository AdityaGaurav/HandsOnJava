package com.handsonjava.oops.encapsulation;

/**
 * Created by adityag on 6/23/2017.
 */
public class User {
    private String uName;
    private int accountNumber;
    private int contact_Number;
    private String email_id;
    private String companyName;
    private byte yearsOfExperience;

    public User(String uName, int accountNumber, int contact_Number, String email_id, String companyName, byte yearsOfExperience) {
        this.accountNumber = accountNumber;
        this.uName = uName;
        this.contact_Number = contact_Number;
        this.email_id = email_id;
        this.companyName = companyName;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber
     */
    public void setAccountNumber(int accountNumber) {
        //if(accountNumber < 0 || accountNumber == 0 ||)
        this.accountNumber = accountNumber;
    }

    /**
     * @return
     */
    public int getContact_Number() {
        return contact_Number;
    }

    /**
     * @param contact_Number
     */
    public void setContact_Number(int contact_Number) {
        this.contact_Number = contact_Number;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public byte getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(byte yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}

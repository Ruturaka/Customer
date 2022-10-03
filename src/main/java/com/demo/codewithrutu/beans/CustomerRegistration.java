package com.demo.codewithrutu.beans;

import java.util.ArrayList;
import java.util.List;

public class CustomerRegistration {
    private List<Customer> CustomerRecords;

    private static CustomerRegistration stdregd = null;

    private CustomerRegistration(){
        CustomerRecords = new ArrayList<Customer>();
    }

    public static CustomerRegistration getInstance() {

        if(stdregd == null) {
            stdregd = new CustomerRegistration();
            return stdregd;
        }
        else {
            return stdregd;
        }
    }

    public void add(Customer std) {
        CustomerRecords.add(std);
    }

    public String upDateStudent(Customer std) {

        for (int i = 0; i < CustomerRecords.size(); i++) {
            Customer stdn = CustomerRecords.get(i);
            if (stdn.getRegistrationNumber().equals(std.getRegistrationNumber())) {
                CustomerRecords.set(i, std);//update the new record
                return "Update successful";
            }
        }
        return "Update un-successful";
    }

    public String deleteStudent(String registrationNumber) {

        for(int i=0; i<CustomerRecords.size(); i++)
        {
            Customer stdn = CustomerRecords.get(i);
            if(stdn.getRegistrationNumber().equals(registrationNumber)){
                CustomerRecords.remove(i);//update the new record
                return "Delete successful";
            }
        }

        return "Delete un-successful";
    }

    public List<Customer> getStudentRecords() {
        return CustomerRecords;
    }

}

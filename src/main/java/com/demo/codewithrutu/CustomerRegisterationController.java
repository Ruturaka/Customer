package com.demo.codewithrutu;

import com.demo.codewithrutu.beans.*;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.stereotype.Controller;

@Controller
public class CustomerRegisterationController {
    @RequestMapping(method = RequestMethod.POST, value="/register/student")

    @ResponseBody
    public CustomerRegistrationReply registerStudent(@RequestBody Customer customer) {
        System.out.println("In registerCustomer");
        CustomerRegistrationReply stdregreply = new CustomerRegistrationReply();
        CustomerRegistration.getInstance().add(customer);
        //We are setting the below value just to reply a message back to the caller
        stdregreply.setName(customer.getName());
        stdregreply.setAge(customer.getAge());
        stdregreply.setRegistrationNumber(customer.getRegistrationNumber());
        stdregreply.setRegistrationStatus("Successful");

        return stdregreply;
    }
}

package com.company;

public class App {
    public static void main(String[] args) {
        Customer customer1 = new Customer();

        customer1.setFirstName("Pat");
        customer1.setLastName("Chen");
        customer1.setEmail("patchen21@gmail.com");

        Address address1 = new Address();
        address1.setCity("Hartford");
        address1.setState("CT");
        address1.setZipcode("06107");
        address1.setStreet1("123 street rd");

        customer1.setShippingAddress(address1);
        customer1.setBillingAddress(address1);

        customer1.setRewardsMember(true);

        System.out.println(customer1);
    }
}

package com.gabriel.customer;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CustomerDataAccessService implements CustomerDao{

    //db
    private static List<Customer> customers;

    static {
        customers = new ArrayList<>();
        Customer gabriel = new Customer(1, "Gabriel", "grecualexandrugabriel@yahoo.com", 25);
        customers.add(gabriel);

        Customer alex = new Customer(2, "Alex", "grecualex@yahoo.com", 26);
        customers.add(alex);
    }

    @Override
    public List<Customer> selectAllCustomers() {
        return customers;
    }

    @Override
    public Optional<Customer> selectCustomerById(Integer id) {
        return customers.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst();
    }


}

package com.yldog.order.service.dataaccess.customer.mapper;

import com.yldog.domain.valueobject.CustomerId;
import com.yldog.order.service.dataaccess.customer.entity.CustomerEntity;
import com.yldog.order.service.domain.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDataAccessMapper {
    public Customer customerEntityToCustomer(CustomerEntity customerEntity) {
        return new Customer(new CustomerId(customerEntity.getId()));
    }
}

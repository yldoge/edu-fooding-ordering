package com.yldog.order.service.dataaccess.customer.repository;

import com.yldog.order.service.dataaccess.customer.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CustomerJpaRepository extends JpaRepository<CustomerEntity, UUID> {
}

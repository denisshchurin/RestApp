package com.denis.customerdemo.repository;

import com.denis.customerdemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link Customer} class.
 *
 * @author Denis Shchurin
 * @version 1.0
 */

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}

package com.denis.customerdemo.model;

import com.sun.org.apache.xpath.internal.objects.XString;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Simple JavaBean domain object that represents Customer.
 *
 * @author Denis Shchurin
 * @version 1.0
 */

@Entity
@Table(name = "customers")
@Getter
@Setter
@ToString
public class Customer extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name")
    private String secondName;

    @Column(name = "address")
    private String address;

    @Column(name = "budget")
    private BigDecimal budget;
}

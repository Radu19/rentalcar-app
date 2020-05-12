package com.springboot.rentapp;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.springboot.rentapp.entity.Customer;
import com.springboot.rentapp.entity.Order;

public class RentApplicationTest {

	@Test
	public void contextLoad() {
		Order theOrder = new Order();
		Customer theCustomer = new Customer();
		theOrder.setCustomer(theCustomer);
		assertThat(theOrder.toString().contains("Customer")).isTrue();
	}
}

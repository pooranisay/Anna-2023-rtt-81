package org.perscholas.database.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.perscholas.database.entity.Customer;

public class CustomerDAOTest {

	@Test
	public void findbyTest() {
		CustomerDAO customerdao=new CustomerDAO();
		Customer actual=customerdao.findById(112);
		Assertions.assertEquals(112, actual.getId());

	}

}

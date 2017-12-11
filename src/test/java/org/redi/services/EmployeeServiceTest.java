package org.redi.services;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.redischool.models.Employee;
import org.redischool.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void searchEmployeeByFirstName() throws Exception {
    }

    @Test
    public void shouldSaveEmployee() throws Exception {

        Employee employee = Employee.builder().firstName("Alaa").build();

        Employee employee1 = employeeService.saveEmployee(employee);

        Assert.assertEquals(employee1, employee);

    }

    @Test
    public void saveAllEmployees() throws Exception {
    }

}

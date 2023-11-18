package com.Builder;

import com.Builder.domain.Address;
import com.Builder.domain.Contact;
import com.Builder.domain.Phone;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee.EmployeeBuilder()
                .build();
        System.out.println("employee = " + employee);

        var employee1 = new Employee.EmployeeBuilder()

                .setAge(24)
                .setName("SANTIAGO")
                .setGender("Male")

                .setAddress(new Address("Calle 9", "Medellin", "Colombia", "050030"))
                .setAddress("Carrera 34", "Medellin", "Colombia", "050678")

                .setPhone(new Phone("1234", "1001", "Fijo"))
                .setPhone("9876", "4003", "Fijo")

                .setContact(new Contact("Daniel",
                        new Phone("8888", null, "Celular"),
                        new Address("Calle 45", "Bogota", "Country", "050934")))
                .build();

        System.out.println("employee1 = " + employee1);
    }
}
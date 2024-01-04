package com.feeeeel.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//Eliminate verbosity in creating Java Beans
//Public accessor methods, constructor,
//equals, hashCode and toString are automatically created.
//Released in JDK 16.

record Person(String name, int age, Address address) {};

// Address - firstLine & city
record Address(String firstLine, String city) {}
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Feeeeel";
    }

    @Bean
    public int age() {
        return 25;
    }

    @Bean
    public Person person() {
        return new Person("Ravi", 20, new Address("Gwangjin", "Seoul"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address()); // name, age, address
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3) { // name, age, address3
        return new Person(name, age, address3);
    }

    @Bean
    @Primary
    public Person person4Parameters(String name, int age, Address address) { // name, age, address3
        return new Person(name, age, address);
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) { // name, age, address3
        return new Person(name, age, address);
    }

    @Bean(name = "address2")
    @Primary
    public Address address() {
        return new Address("Nowon", "Seoul");
    }

    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3() {
        return new Address("Baker Street", "London");
    }
}

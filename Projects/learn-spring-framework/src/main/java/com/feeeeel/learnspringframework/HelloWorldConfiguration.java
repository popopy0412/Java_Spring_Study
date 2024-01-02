package com.feeeeel.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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

    @Bean(name = "address2")
    public Address address() {
        return new Address("Nowon", "Seoul");
    }

    @Bean(name = "address3")
    public Address address3() {
        return new Address("Baker Street", "London");
    }
}

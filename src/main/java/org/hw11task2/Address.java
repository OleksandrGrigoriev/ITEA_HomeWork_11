package org.hw11task2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "address")
public class Address {
    private String city;
    private String street;
    private int numberOfHouse;

    public Address() {}

    public Address(String city, String street, int numberOfHouse) {
        this.city = city;
        this.street = street;
        this.numberOfHouse = numberOfHouse;
    }

    public String getCity() {
        return city;
    }

    @XmlElement(name = "city")
    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    @XmlElement(name = "street")
    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumberOfHouse() {
        return numberOfHouse;
    }

    @XmlElement(name = "house_number")
    public void setNumberOfHouse(int numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", numberOfHouse=" + numberOfHouse +
                '}';
    }
}

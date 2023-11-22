package org.hw11task2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name = "addressBook")
public class AddressBook {
    @XmlElement(name = "address")
    private List<Address> addressList = new ArrayList<>();

    public AddressBook() {}

//    public AddressBook() {
//        addressList = new ArrayList<>();
//    }
    public void add(Address adress) {
        addressList.add(adress);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(addressList.toArray());
    }
}

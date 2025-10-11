class Address implements Cloneable {
    String city;
    String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }

    @Override
    public String toString() {
        return street + ", " + city;
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Deep clone
    protected Person deepClone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.address = (Address) address.clone(); // New Address object
        return cloned;
    }

    @Override
    public String toString() {
        return "Person [Name: " + name + ", Address: " + address + "]";
    }
}

public class PersonCloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("Pune", "MG Road");
        Person p1 = new Person("Ravi", addr);

        // Shallow clone
        Person p2 = (Person) p1.clone();

        // Deep clone
        Person p3 = p1.deepClone();

        // Change address in original
        p1.address.city = "Mumbai";

        System.out.println("Original: " + p1);
        System.out.println("Shallow Clone: " + p2);
        System.out.println("Deep Clone: " + p3);
    }
}
package main.java;

public class Person implements Greeter {
    protected String firstName;
    protected String lastName;

    public Person(String firstName, String lastName) {
        if (firstName == null || lastName == null){
            throw new IllegalArgumentException("Cannot be null");
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person () {}


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String sayHello() {
        return ("Hello from " + firstName + " " + lastName);
    }

    public static void main(String[] args) {
        Person person = new Person("bill", "Bill");

        person.setFirstName("Daniel");
        person.setLastName("Strolle");
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.sayHello());

    }

}

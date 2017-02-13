package zajecia.dziewiec;

public class User {
    public String firstName;
    public String lastName;
    public String birthDate;
    public Address address;

    public User(String firstName, String lastName, String birthDate){
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthDate=birthDate;
    }

    public User(String firstName, String lastName, String birthDate, Address address) {
        this(firstName, lastName, birthDate);
        this.address = address;
    }


    public void print() {
        System.out.println(firstName + " " + lastName + " " + birthDate);
        if (address != null) {
            address.print();
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", address=" + address +
                '}';
    }
}

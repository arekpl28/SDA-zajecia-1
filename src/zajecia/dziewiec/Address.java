package zajecia.dziewiec;


public class Address {
    public String city;
    public String street;
    public int houseNumber;
    public String zipCode;
    public String land;

    public Address(String city, String street, int houseNumber, String zipCode, String land){
        this.city=city;
        this.street=street;
        this.houseNumber=houseNumber;
        this.zipCode=zipCode;
        this.land=land;
    }
    public void print(){
        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append(city)
                .append(", ")
                .append(street)
                .append(" ")
                .append(houseNumber)
                .append(", ")
                .append(zipCode)
                .append(", ")
                .append(land);
        String toPrint = stringBuilder.toString();
        System.out.println(toPrint);
    }
}
public class Employee {
    private String name;
    private int code;
    private Address address;

    public Employee(String name, int code, Address address) {
        this.name = name;
        this.code = code;
        this.address = address;
    }

    public void introduce() {
        System.out.printf(
                "Code: %s%nName: %s%nDistrict: %s%nCity: %s%nCountry: %s",
                code, name, address.getDistrict(), address.getCity(), address.getCountry()
        );

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

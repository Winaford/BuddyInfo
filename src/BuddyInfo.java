public class BuddyInfo {

    public String getName() {
        return name;
    }

    public BuddyInfo(String name,String phone_number,String address) {
        this.name = name;
        this.phone_number = phone_number;
        this.address = address;
    }

    public BuddyInfo() {
       name = "Jesus";
       phone_number = "613-123-3456";
       address = "First street";
    }
    private String name;

    public String getPhone_number() {
        return phone_number;
    }

    private String phone_number;

    public String getAddress() {
        return address;
    }

    private String address;

    public static void main(String[] args) {
        System.out.println("Hello world!");

        BuddyInfo J = new BuddyInfo("Homer","613-987-6543","Springfield ave");
        System.out.println("Hello "+ J.name);
    }

}
public class Contact {
    private string final contactID;
    private string firstName;
    private string lastName;
    private string phoneNumber;
    private string address;

    public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
        if(contactID == null || contactID.length()>10){
            throw new IllegalArgumentException("Invalid contactID")
        }
        if(firstName == null || firstName.length()>10){
            throw new IllegalArgumentException("Invalid firstName")
        }
        if(lastName == null || lastName.length()>10){
            throw new IllegalArgumentException("Invalid lastName")
        }
        if(phoneNumber == null || phoneNumber.length()>10){
            throw new IllegalArgumentException("Invalid phoneNumber")
        }
        if(address == null || address.length()>30){
            throw new IllegalArgumentException("Invalid address")
        }

        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getContactID(){
        return contactID;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getAddress(){
        return address;
    }
    public String addContact(){
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Enter ContactID: ");
        
    }

}
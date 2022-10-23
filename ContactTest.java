import static org.junit.api.Assertions.*;

class ContactTest{

    @Test 
    void testContact() {
        Contact newContact = new Contact("BRK1NG8AD", "Walter", "White", "8002255324", "308 Negra Arroyo Lane");
        assertTrue(newContact.getFirstName().equals("Walter"));
        assertTrue(newContact.getLastName().equals("White"));
        assertTrue(newContact.getContactID().equals("BRK1NG8AD"));
        assertTrue(newContact.getPhoneNumber().equals("8002255324"));
        assertTrue(newContact.getAddress().equals("308 Negra Arroyo Lane"));
    }
}
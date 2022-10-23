package Contact;
 
// Importing required classes
import java.util.Scanner;
 
// Class
public class ContactLinkedList {
 
    // Main driver method
    public static void main(String[] args)
    {
        // Creating ContactsList Object.
        ContactsList cl
            = new ContactsList();
 
        Contact contact = new Contact();

        Contact initContact = new Contact("BRK1NG8AD", "Walter", "White", "8002255324", "308 Negra Arroyo Lane");
 
        // Calling add() record method to
        // add static data/(Hard CodedData) to linked List
        cl.add(record);
 
        // Creating Scanner Object to read input
        Scanner input = new Scanner(System.in);
 
        // Creating option integer variable
        int option = 0;
 
        // Do - While loop
        do {
            menu();
            option = input.nextInt();
 
            // Switch case
            switch (option) {
 
            // Case 1
            case 1:
 
                // Display message
                System.out.print(
                    "What is the ContactID? ");
 
                String idNumber = input.nextLine();
 
                // Display message
                System.out.print(
                    "What is the Contact's First Name ? ");
 
                String firstName = input.nextLine();
 
                // Display message
                System.out.print(
                    "What is the Contact's Last Name ? ");
 
                String lastName = input.nextLine();

                // Display message
                System.out.print(
                    "What is the Contact's Phone Number ? ");
 
                String phoneNumber = input.nextLine();

                // Display message
                System.out.print(
                    "What is the Contact's Address ? ");
 
                String address = input.nextLine();
 
                // Create record object and pass constructor
                // parameters.
                contact = new Contact(idNumber, firstName, lastName, phoneNumber, address);
                // Call add() record
                cl.add(record);
                System.out.println(record.toString());
 
                // Break statement used to terminate program
                // from here only once it entered this case
                break;
 
            // Case 2
            case 2:
 
                // Display message
                System.out.print(
                    "What is the Contact's ID ? ");
                int rId = input.nextInt();
 
                // Invoke remove/delete record
                cl.delete(rId);
 
                break;
 
            // Case 3
            case 3:
 
                // Display message
                System.out.print(
                    "What is the Contact's ID ? ");
 
                int rIdNo = input.nextInt();
                cl.update(rIdNo, input);
 
                break;
 
            // Case 4
            case 4:
 
                // Display message
                System.out.print(
                    "What is the Contact's ID ? ");
                int searchID = input.nextInt();
 
                if (!hr.find(searchID)) {
                    System.out.println(
                        "Student id does not exist\n");
                } else {
                    System.out.println(cl.searchID)
                }
 
                break;
 
            // Case 5
            case 5:
                cl.display();
                break;
 
            // Case 6
            case 9:
 
                // Display message
                System.out.println(
                    "\nThank you for using the program. Goodbye!\n");
                System.exit(0);
 
                break;
 
            // Case 7: Default case
            // If none above case executes
            default:
 
                // Print statement
                System.out.println("\nInvalid input\n");
                break;
            }
        }
 
        // Checking condition
        while (option != 9);
    }
 
    // Method 2
    // Menu - Static menu for displaying options
    public static void menu()
    {
 
        // Printing statements displaying menu on console
        System.out.println("MENU");
        System.out.println("1: Add Contact");
        System.out.println("2: Delete Contact");
        System.out.println("3: Update Contact");
        System.out.println("4: Search Contact");
        System.out.println("5: Display Contacts");
        System.out.println("9: Exit program");
        System.out.print("Enter your selection : ");
    }
}
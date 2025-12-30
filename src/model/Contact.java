package model;

/**
 * Contact represents a single contact entity.
 * It encapsulates contact data and validates inputs.
 */
public class Contact {

    private int id;
    private String name;
    private String phoneNumber;

    // Default constructor
    public Contact() {
        this.id = 0;
        this.name = "";
        this.phoneNumber = "";
    }

    // Setter for ID
    public void setId(int id) {
        this.id = id;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Validates and sets phone number.
     * Must be exactly 10 digits and numeric.
     */
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.length() != 10) {
            System.out.println("Enter a valid Phone Number");
            return;
        }

        for (int i = 0; i < phoneNumber.length(); i++) {
            if (!Character.isDigit(phoneNumber.charAt(i))) {
                System.out.println("Enter a valid Phone Number");
                return;
            }
        }
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

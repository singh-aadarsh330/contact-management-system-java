# Model Package

This package contains the data model classes for the Contact Management System.

## 📦 Package Overview

The `model` package defines the structure and behavior of data entities used throughout the application. It follows the principles of Object-Oriented Programming and encapsulation.

## 📄 Files

### Contact.java

The `Contact` class represents a single contact entity in the system.

#### Class Structure

```java
public class Contact {
    // Private fields
    private String name;
    private String phoneNumber;
    private String email;
    
    // Constructor
    // Getters
    // Setters
    // toString() method
}
```

#### Properties

| Property | Type | Description | Validation |
|----------|------|-------------|------------|
| `name` | String | Contact's full name | Cannot be null or empty |
| `phoneNumber` | String | Contact's phone number | Unique identifier, 10 digits |
| `email` | String | Contact's email address | Valid email format (optional) |

#### Key Methods

**Constructor**
```java
public Contact(String name, String phoneNumber, String email)
```
- Initializes a new Contact object with provided details
- Parameters are validated before assignment

**Getters**
- `getName()`: Returns the contact's name
- `getPhoneNumber()`: Returns the contact's phone number
- `getEmail()`: Returns the contact's email address

**Setters**
- `setName(String name)`: Updates the contact's name
- `setPhoneNumber(String phoneNumber)`: Updates the phone number
- `setEmail(String email)`: Updates the email address

**Display Method**
- `toString()`: Returns a formatted string representation of the contact

## 🎯 Design Principles

### Encapsulation
All fields are declared as `private` to protect the internal state of the object. Access is provided through public getter and setter methods.

### Data Integrity
The Contact class ensures:
- No null or empty values for critical fields
- Proper data types for each property
- Validation of input data

### Immutability Considerations
While the current implementation uses standard getters/setters, the class can be modified to be immutable by:
- Making fields `final`
- Removing setter methods
- Setting all values through constructor

## 📝 Usage Examples

### Creating a Contact

```java
// Create a new contact
Contact contact = new Contact("John Doe", "9876543210", "john@example.com");
```

### Accessing Contact Information

```java
// Get contact details
String name = contact.getName();
String phone = contact.getPhoneNumber();
String email = contact.getEmail();

System.out.println("Name: " + name);
System.out.println("Phone: " + phone);
System.out.println("Email: " + email);
```

### Updating Contact Information

```java
// Update contact details
contact.setName("John Smith");
contact.setEmail("johnsmith@example.com");
```

### Displaying Contact

```java
// Print contact information
System.out.println(contact.toString());
// or simply
System.out.println(contact);
```

## 🔍 Validation Rules

### Name Validation
- Cannot be null
- Cannot be empty or whitespace only
- Should contain only alphabetic characters and spaces
- Minimum length: 2 characters

### Phone Number Validation
- Must be exactly 10 digits
- Should contain only numeric characters
- No special characters or spaces
- Serves as unique identifier

### Email Validation
- Optional field
- If provided, must follow standard email format
- Pattern: `username@domain.extension`

## 🚀 Future Enhancements

Potential improvements to the Contact model:

1. **Additional Fields**
   - Address (street, city, state, zip)
   - Date of birth
   - Company name
   - Job title
   - Multiple phone numbers (home, work, mobile)
   - Social media handles

2. **Advanced Validation**
   - Regex pattern matching for email
   - International phone number formats
   - Name format validation

3. **Relationships**
   - Contact groups/categories
   - Favorite contacts flag
   - Contact notes or tags

4. **Serialization**
   - Implement `Serializable` interface for file storage
   - JSON serialization support

## 🔄 Related Classes

This model class interacts with:
- `ContactService`: Business logic for managing contacts
- `Main`: User interface for displaying contact information

## 📚 Best Practices Implemented

✅ **Encapsulation**: Private fields with public accessors
✅ **Naming Convention**: CamelCase for class and method names
✅ **Single Responsibility**: Class focuses only on contact data
✅ **Documentation**: Clear comments and method descriptions
✅ **Validation**: Input validation in setters

## 🤔 Common Questions

**Q: Why is phoneNumber a String and not an integer?**
A: Phone numbers can start with 0 and may include special formatting in future. String provides more flexibility.

**Q: Can two contacts have the same name?**
A: Yes, but they must have different phone numbers (unique identifier).

**Q: Is email mandatory?**
A: No, email is an optional field and can be empty or null.

## 📖 Further Reading

- [Java Encapsulation](https://docs.oracle.com/javase/tutorial/java/concepts/object.html)
- [Java String Class](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)
- [POJO (Plain Old Java Object)](https://en.wikipedia.org/wiki/Plain_old_Java_object)

---

*This package is part of the Contact Management System project by Aadarsh Singh*

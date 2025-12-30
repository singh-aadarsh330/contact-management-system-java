# Service Package

This package contains the business logic layer for the Contact Management System.

## 📦 Package Overview

The `service` package handles all business operations related to contact management. It acts as an intermediary between the user interface (Main class) and the data model (Contact class), implementing the core CRUD functionality.

## 📄 Files

### ContactService.java

The `ContactService` class manages all contact-related operations and maintains the contact list.

#### Class Structure

```java
public class ContactService {
    // Private field
    private ArrayList<Contact> contacts;
    
    // Constructor
    // CRUD Methods
    // Search Methods
    // Validation Methods
}
```

## 🎯 Core Functionality

### 1. Create Operations

#### addContact()
```java
public boolean addContact(Contact contact)
```

**Purpose**: Adds a new contact to the system

**Process**:
1. Validates the contact is not null
2. Checks if phone number already exists (duplicate check)
3. Adds contact to the ArrayList
4. Returns success/failure status

**Returns**: 
- `true` if contact added successfully
- `false` if contact is null or duplicate phone number exists

**Example**:
```java
ContactService service = new ContactService();
Contact contact = new Contact("John Doe", "9876543210", "john@example.com");
boolean success = service.addContact(contact);
```

### 2. Read Operations

#### getAllContacts()
```java
public ArrayList<Contact> getAllContacts()
```

**Purpose**: Retrieves all contacts in the system

**Returns**: ArrayList of all Contact objects

**Example**:
```java
ArrayList<Contact> allContacts = service.getAllContacts();
for (Contact c : allContacts) {
    System.out.println(c);
}
```

#### searchByName()
```java
public ArrayList<Contact> searchByName(String name)
```

**Purpose**: Finds all contacts matching the given name

**Parameters**:
- `name`: Search term (case-insensitive, partial match supported)

**Returns**: ArrayList of matching Contact objects

**Search Logic**:
- Case-insensitive search
- Supports partial name matching
- Returns empty list if no matches found

**Example**:
```java
ArrayList<Contact> results = service.searchByName("John");
```

#### searchByPhone()
```java
public Contact searchByPhone(String phoneNumber)
```

**Purpose**: Finds a contact with the exact phone number

**Parameters**:
- `phoneNumber`: Exact 10-digit phone number

**Returns**: 
- Contact object if found
- `null` if not found

**Example**:
```java
Contact contact = service.searchByPhone("9876543210");
```

### 3. Update Operations

#### updateContact()
```java
public boolean updateContact(String phoneNumber, String newName, String newEmail)
```

**Purpose**: Updates an existing contact's information

**Parameters**:
- `phoneNumber`: Identifier for the contact to update
- `newName`: New name (pass null to keep existing)
- `newEmail`: New email (pass null to keep existing)

**Process**:
1. Searches for contact by phone number
2. Updates non-null fields
3. Maintains phone number (unique identifier)

**Returns**:
- `true` if update successful
- `false` if contact not found

**Example**:
```java
boolean updated = service.updateContact("9876543210", "John Smith", null);
```

### 4. Delete Operations

#### deleteContact()
```java
public boolean deleteContact(String phoneNumber)
```

**Purpose**: Removes a contact from the system

**Parameters**:
- `phoneNumber`: Phone number of contact to delete

**Returns**:
- `true` if deletion successful
- `false` if contact not found

**Example**:
```java
boolean deleted = service.deleteContact("9876543210");
```

## 🔍 Helper Methods

### isPhoneNumberExists()
```java
private boolean isPhoneNumberExists(String phoneNumber)
```

**Purpose**: Checks if a phone number already exists in the system

**Access**: Private (internal validation)

**Returns**:
- `true` if phone number exists
- `false` if available

### getContactCount()
```java
public int getContactCount()
```

**Purpose**: Returns the total number of contacts

**Returns**: Integer count of contacts

## 📊 Data Structure

### ArrayList Implementation

**Why ArrayList?**
- Dynamic size (grows/shrinks automatically)
- Fast random access O(1)
- Built-in methods for common operations
- Easy iteration and manipulation

**Alternative Considerations**:
- **HashMap**: Faster lookup O(1) using phone as key
- **LinkedList**: Better for frequent insertions/deletions
- **TreeSet**: Automatic sorting

## 🔄 Operation Complexity

| Operation | Time Complexity | Space Complexity |
|-----------|----------------|------------------|
| Add Contact | O(n) | O(1) |
| Get All Contacts | O(1) | O(n) |
| Search by Phone | O(n) | O(1) |
| Search by Name | O(n) | O(k) |
| Update Contact | O(n) | O(1) |
| Delete Contact | O(n) | O(1) |

*Note: n = number of contacts, k = number of matches*

## 💡 Design Patterns

### Service Layer Pattern
- Separates business logic from presentation
- Single point of contact for contact operations
- Easier to test and maintain

### Singleton Consideration
Currently, multiple instances can be created. Consider implementing Singleton pattern for:
- Single source of truth for contacts
- Consistent data across application
- Memory efficiency

## 🛡️ Error Handling

### Validation Checks

1. **Null Checks**
   - Contact object validation
   - Field validation before operations

2. **Duplicate Prevention**
   - Phone number uniqueness enforcement
   - Pre-insert validation

3. **Empty Data Handling**
   - Returns empty lists instead of null
   - Graceful handling of not-found scenarios

### Exception Handling Strategy

```java
try {
    // Operation
} catch (NullPointerException e) {
    // Handle null cases
} catch (Exception e) {
    // Handle other exceptions
}
```

## 📝 Usage Examples

### Complete Workflow Example

```java
// Initialize service
ContactService service = new ContactService();

// Add contacts
Contact c1 = new Contact("Alice Smith", "9876543210", "alice@email.com");
Contact c2 = new Contact("Bob Jones", "9876543211", "bob@email.com");
service.addContact(c1);
service.addContact(c2);

// View all contacts
ArrayList<Contact> all = service.getAllContacts();
System.out.println("Total contacts: " + service.getContactCount());

// Search by name
ArrayList<Contact> results = service.searchByName("Alice");
for (Contact c : results) {
    System.out.println(c);
}

// Update contact
service.updateContact("9876543210", "Alice Johnson", null);

// Delete contact
service.deleteContact("9876543211");
```

## 🚀 Future Enhancements

### Planned Features

1. **Advanced Search**
   - Search by email
   - Multi-criteria search
   - Fuzzy search for typos

2. **Sorting**
   - Sort by name alphabetically
   - Sort by date added
   - Custom sorting options

3. **Batch Operations**
   - Import multiple contacts
   - Export to CSV/JSON
   - Bulk delete/update

4. **Persistence**
   - Save to file
   - Load from file
   - Database integration

5. **Statistics**
   - Contact analytics
   - Usage statistics
   - Duplicate detection

## 🔒 Thread Safety

**Current Status**: Not thread-safe

**Considerations for Multi-threading**:
- Use `Collections.synchronizedList()` for ArrayList
- Add synchronized methods
- Consider `ConcurrentHashMap` for better performance

## 🧪 Testing Strategies

### Unit Tests to Implement

```java
@Test
public void testAddContact() {
    // Test successful addition
    // Test duplicate phone number
    // Test null contact
}

@Test
public void testSearchByPhone() {
    // Test existing phone
    // Test non-existing phone
    // Test invalid format
}

@Test
public void testUpdateContact() {
    // Test successful update
    // Test non-existing contact
    // Test partial update
}
```

## 📚 Best Practices Implemented

✅ **Encapsulation**: Private ArrayList with public methods
✅ **Single Responsibility**: Handles only contact operations
✅ **Validation**: Input validation before operations
✅ **Return Types**: Consistent return types for status
✅ **Naming**: Clear, descriptive method names
✅ **Comments**: Well-documented code

## 🤔 Common Questions

**Q: Why not use a database?**
A: This is a learning project focusing on Java fundamentals. Database integration can be added later.

**Q: Can I extend this service?**
A: Yes, you can inherit from ContactService or add new methods.

**Q: How to handle concurrent access?**
A: Implement synchronization or use thread-safe collections.

## 📖 Related Documentation

- [ArrayList Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)
- [Java Collections Framework](https://docs.oracle.com/javase/tutorial/collections/)
- [Service Layer Pattern](https://martinfowler.com/eaaCatalog/serviceLayer.html)

---

*This package is part of the Contact Management System project by Aadarsh Singh*

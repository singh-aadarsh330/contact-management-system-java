# Source Code Documentation

This directory contains all the source code for the Contact Management System.

## 📂 Directory Structure

```
src/
├── model/
│   ├── Contact.java          # Data model for contact entity
│   └── README.md             # Model package documentation
│
├── service/
│   ├── ContactService.java   # Business logic layer
│   └── README.md             # Service package documentation
│
├── Main.java                 # Application entry point
└── README.md                 # This file
```

## 🎯 Architecture Overview

The application follows a **layered architecture** pattern:

```
┌─────────────────────────┐
│    Presentation Layer   │  ← Main.java (User Interface)
├─────────────────────────┤
│   Business Logic Layer  │  ← ContactService.java
├─────────────────────────┤
│      Data Model Layer   │  ← Contact.java
└─────────────────────────┘
```

### Layer Responsibilities

1. **Presentation Layer (Main.java)**
   - User interaction and input/output
   - Menu display and navigation
   - Input validation and formatting
   - Delegates operations to service layer

2. **Business Logic Layer (ContactService.java)**
   - CRUD operations implementation
   - Business rules and validations
   - Data manipulation logic
   - Interface between UI and data model

3. **Data Model Layer (Contact.java)**
   - Data structure definition
   - Entity properties and behaviors
   - Encapsulation of contact data

## 📄 Main.java

### Overview

The `Main` class serves as the entry point of the application and handles all user interactions through a console-based menu system.

### Key Components

#### 1. Class Variables

```java
private static ContactService contactService = new ContactService();
private static Scanner scanner = new Scanner(System.in);
```

- **contactService**: Instance of ContactService for business operations
- **scanner**: Scanner object for reading user input

#### 2. Main Method

```java
public static void main(String[] args)
```

**Flow**:
1. Initialize application
2. Display welcome message
3. Enter main loop
4. Display menu
5. Process user choice
6. Repeat until exit

#### 3. Menu System

```java
private static void displayMenu()
```

Displays the main menu with options:
```
===== Contact Management System =====
1. Add Contact
2. View All Contacts
3. Search Contact
4. Update Contact
5. Delete Contact
6. Exit
======================================
```

#### 4. Core Methods

**addContactMenu()**
- Prompts for contact details
- Creates Contact object
- Calls service to add contact
- Displays success/error message

**viewAllContactsMenu()**
- Retrieves all contacts from service
- Displays in formatted table
- Handles empty list scenario

**searchContactMenu()**
- Presents search options (by name/phone)
- Gets search criteria
- Displays search results
- Handles no results found

**updateContactMenu()**
- Prompts for phone number
- Gets new information
- Updates contact through service
- Confirms update

**deleteContactMenu()**
- Prompts for phone number
- Confirms deletion (optional)
- Deletes contact through service
- Displays result

### Input Handling

#### Validation Patterns

```java
// Phone number validation
private static boolean isValidPhone(String phone) {
    return phone.matches("\\d{10}");
}

// Email validation (basic)
private static boolean isValidEmail(String email) {
    return email.contains("@") && email.contains(".");
}

// Name validation
private static boolean isValidName(String name) {
    return name != null && !name.trim().isEmpty();
}
```

#### Error Handling

```java
try {
    // User input processing
    int choice = scanner.nextInt();
    scanner.nextLine(); // Clear buffer
    // Process choice
} catch (InputMismatchException e) {
    System.out.println("Invalid input! Please enter a number.");
    scanner.nextLine(); // Clear invalid input
}
```

### User Experience Features

1. **Clear Screen Simulation**
   - Empty lines for better readability
   - Section separators

2. **Formatted Output**
   - Table format for contact lists
   - Consistent spacing and alignment
   - Clear success/error messages

3. **Input Prompts**
   - Clear instructions
   - Default value suggestions
   - Validation feedback

4. **Navigation**
   - "Press Enter to continue" pauses
   - Return to main menu options
   - Exit confirmation (optional)

## 🔄 Application Flow

### 1. Startup Sequence

```
Start Application
    ↓
Initialize ContactService
    ↓
Display Welcome Message
    ↓
Enter Main Loop
```

### 2. Main Loop

```
Display Menu
    ↓
Get User Choice
    ↓
Validate Input
    ↓
Execute Corresponding Method
    ↓
Display Result
    ↓
Return to Menu (or Exit)
```

### 3. Operation Flow Example (Add Contact)

```
User selects "Add Contact"
    ↓
Prompt for Name
    ↓
Validate Name
    ↓
Prompt for Phone
    ↓
Validate Phone (10 digits, unique)
    ↓
Prompt for Email
    ↓
Validate Email (optional)
    ↓
Create Contact Object
    ↓
Call contactService.addContact()
    ↓
Display Success/Error Message
    ↓
Return to Main Menu
```

## 🎨 Code Style Guidelines

### Naming Conventions

- **Classes**: PascalCase (e.g., `ContactService`)
- **Methods**: camelCase (e.g., `addContact()`)
- **Constants**: UPPER_SNAKE_CASE (e.g., `MAX_CONTACTS`)
- **Variables**: camelCase (e.g., `phoneNumber`)

### Code Organization

```java
public class Example {
    // 1. Constants
    private static final String CONSTANT = "value";
    
    // 2. Instance variables
    private int variable;
    
    // 3. Constructor
    public Example() { }
    
    // 4. Public methods
    public void publicMethod() { }
    
    // 5. Private methods
    private void privateMethod() { }
}
```

### Documentation Standards

```java
/**
 * Brief description of method purpose
 * 
 * @param paramName description of parameter
 * @return description of return value
 */
public ReturnType methodName(ParamType paramName) {
    // Implementation
}
```

## 🔧 Compilation and Execution

### Compile Individual Files

```bash
# Compile Contact model
javac src/model/Contact.java

# Compile ContactService
javac -cp src src/service/ContactService.java

# Compile Main
javac -cp src src/Main.java
```

### Compile All Files

```bash
javac src/**/*.java src/*.java
```

### Run Application

```bash
java -cp src Main
```

### Using Package Structure (If Added)

```bash
# With package declarations
javac -d bin src/**/*.java src/*.java
java -cp bin Main
```

## 🐛 Debugging Tips

### Common Issues and Solutions

1. **InputMismatchException**
   - **Cause**: Wrong data type entered
   - **Solution**: Add try-catch and clear scanner buffer

2. **NullPointerException**
   - **Cause**: Operating on null objects
   - **Solution**: Add null checks before operations

3. **Scanner Buffer Issues**
   - **Cause**: Mixing nextInt() and nextLine()
   - **Solution**: Call scanner.nextLine() after nextInt()

4. **Duplicate Phone Numbers**
   - **Cause**: Not checking existing contacts
   - **Solution**: Validation in service layer

### Debug Logging

```java
// Add debug prints
System.out.println("[DEBUG] Variable value: " + variable);

// Or use proper logging
Logger logger = Logger.getLogger(Main.class.getName());
logger.info("Contact added successfully");
```

## 🧪 Testing Checklist

### Manual Testing

- [ ] Add contact with valid data
- [ ] Add contact with duplicate phone
- [ ] Add contact with invalid phone format
- [ ] View empty contact list
- [ ] View populated contact list
- [ ] Search by existing name
- [ ] Search by non-existing name
- [ ] Search by phone number
- [ ] Update existing contact
- [ ] Update non-existing contact
- [ ] Delete existing contact
- [ ] Delete non-existing contact
- [ ] Handle invalid menu choices
- [ ] Exit application properly

## 📊 Performance Considerations

### Current Implementation

- **Time Complexity**: Most operations are O(n) due to ArrayList iteration
- **Space Complexity**: O(n) where n is number of contacts
- **Scalability**: Suitable for small to medium contact lists (< 10,000)

### Optimization Opportunities

1. **Use HashMap** for O(1) phone number lookups
2. **Implement indexing** for faster searches
3. **Add caching** for frequently accessed contacts
4. **Lazy loading** for large datasets

## 🚀 Extension Ideas

### Feature Additions

1. **Data Persistence**
   ```java
   - Save contacts to file on exit
   - Load contacts from file on startup
   - Auto-save functionality
   ```

2. **Advanced Search**
   ```java
   - Search by multiple criteria
   - Regex pattern matching
   - Fuzzy search algorithm
   ```

3. **Contact Groups**
   ```java
   - Create contact categories
   - Group management operations
   - Filter by group
   ```

4. **Import/Export**
   ```java
   - CSV import/export
   - VCard format support
   - JSON serialization
   ```

## 📚 Learning Resources

- [Java I/O Tutorial](https://docs.oracle.com/javase/tutorial/essential/io/)
- [Java Collections](https://docs.oracle.com/javase/tutorial/collections/)
- [Exception Handling](https://docs.oracle.com/javase/tutorial/essential/exceptions/)
- [Scanner Class](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)

## 🤝 Contributing Guidelines

When contributing to this codebase:

1. Follow existing code style
2. Add comments for complex logic
3. Update documentation
4. Test all changes thoroughly
5. Keep methods focused and small

## 📖 Package Documentation

For detailed information about specific packages:

- **Model Package**: See [model/README.md](model/README.md)
- **Service Package**: See [service/README.md](service/README.md)

---

*Part of the Contact Management System by Aadarsh Singh*

**Project Status**: Active Development
**Last Updated**: December 2024
**Java Version**: 8+

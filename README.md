# Contact Management System

A console-based Contact Management System built with Java that allows users to create, read, update, and delete contacts efficiently.

## 📋 Project Overview

This Contact Management System is a simple yet comprehensive Java application that demonstrates core programming concepts including Object-Oriented Programming (OOP), data structures, and CRUD operations. The system provides an intuitive command-line interface for managing personal or professional contacts.

## ✨ Features

- **Add Contact**: Create new contacts with name, phone number, and email
- **View All Contacts**: Display all saved contacts in a formatted list
- **Search Contact**: Find contacts by name or phone number
- **Update Contact**: Modify existing contact information
- **Delete Contact**: Remove contacts from the system
- **Input Validation**: Ensures data integrity with validation checks
- **User-Friendly Interface**: Simple menu-driven console application

## 🛠️ Technology Stack

- **Language**: Java
- **Data Structure**: ArrayList for dynamic contact storage
- **I/O**: Scanner for user input
- **Design Pattern**: Service layer pattern for business logic separation

## 📁 Project Structure

```
contact-management-system-java/
│
├── src/
│   ├── model/
│   │   ├── Contact.java          # Contact entity class
│   │   └── README.md             # Model package documentation
│   │
│   ├── service/
│   │   ├── ContactService.java   # Business logic layer
│   │   └── README.md             # Service package documentation
│   │
│   ├── Main.java                 # Application entry point
│   └── README.md                 # Source code documentation
│
├── README.md                     # This file
└── .gitignore                    # Git ignore configuration
```

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code) or terminal/command prompt

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/singh-aadarsh330/contact-management-system-java.git
   cd contact-management-system-java
   ```

2. **Compile the project**
   ```bash
   javac src/Main.java src/model/Contact.java src/service/ContactService.java
   ```

3. **Run the application**
   ```bash
   java -cp src Main
   ```

### Alternative: Using an IDE

1. Open the project in your preferred IDE
2. Navigate to `src/Main.java`
3. Run the Main class

## 💻 Usage

Once you run the application, you'll see a menu with the following options:

```
===== Contact Management System =====
1. Add Contact
2. View All Contacts
3. Search Contact
4. Update Contact
5. Delete Contact
6. Exit
======================================
Enter your choice:
```

### Example Workflow

1. **Adding a Contact**
   - Select option 1
   - Enter name: John Doe
   - Enter phone: 9876543210
   - Enter email: john@example.com

2. **Viewing Contacts**
   - Select option 2
   - All contacts will be displayed in a formatted table

3. **Searching**
   - Select option 3
   - Enter search term (name or phone number)

4. **Updating**
   - Select option 4
   - Enter contact phone number
   - Update the desired fields

5. **Deleting**
   - Select option 5
   - Enter phone number of contact to delete

## 🎯 Learning Objectives

This project demonstrates:

- **Object-Oriented Programming**: Classes, objects, encapsulation
- **Data Structures**: ArrayList for dynamic data storage
- **CRUD Operations**: Create, Read, Update, Delete functionality
- **Input Validation**: Error handling and data validation
- **Code Organization**: Separation of concerns with model and service layers
- **User Interaction**: Console-based UI design

## 📚 Code Structure Explanation

### Model Layer (`model/Contact.java`)
- Represents the Contact entity
- Contains contact properties (name, phone, email)
- Implements getters and setters
- Includes validation logic

### Service Layer (`service/ContactService.java`)
- Handles business logic
- Manages contact operations (add, update, delete, search)
- Contains the ArrayList for storing contacts
- Implements search and validation methods

### Main Class (`Main.java`)
- Entry point of the application
- Displays menu and handles user input
- Coordinates between user and service layer

## 🔮 Future Enhancements

- [ ] Persistent storage using file I/O or database
- [ ] Export contacts to CSV format
- [ ] Import contacts from external files
- [ ] Advanced search with filters
- [ ] Contact categories/groups
- [ ] Backup and restore functionality
- [ ] GUI using JavaFX or Swing
- [ ] Email validation with regex
- [ ] Phone number formatting

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is open source and available under the [MIT License](LICENSE).

## 👤 Author

**Aadarsh Singh**

- GitHub: [@singh-aadarsh330](https://github.com/singh-aadarsh330)
- LinkedIn: [singh-aadarsh330](https://www.linkedin.com/in/singh-aadarsh330)
- GeeksforGeeks: [singhaadarsh330](https://www.geeksforgeeks.org/user/singhaadarsh330)

## 🙏 Acknowledgments

- Inspired by real-world contact management needs
- Built as part of learning Java programming
- Thanks to the Java community for excellent documentation

## 📞 Support

If you have any questions or run into issues, please:
- Open an issue on GitHub
- Connect with me on LinkedIn

---

⭐ **If you found this project helpful, please consider giving it a star!**

*Last Updated: December 2024*

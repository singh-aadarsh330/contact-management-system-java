# 📇 Contact Management System (Java)

A console-based Contact Management System built using Java and Object-Oriented Programming (OOP) principles.  
This project demonstrates clean code structure, encapsulation, validation, and basic collection handling.

---

## 📌 Project Overview

The Contact Management System allows users to store, view, and search contact details in memory.
It is designed as a beginner-friendly yet professional Java project, focusing on correct OOP design
rather than UI complexity.

The application follows a layered approach:
- Model layer for data representation
- Service layer for business logic
- Main class as the application entry point

---

## ✨ Features

- Add new contacts
- Display all contacts
- Search contact by unique ID
- Phone number validation
- Duplicate ID prevention
- Encapsulation using getters and setters

---

## 🧠 Concepts Demonstrated

- Object-Oriented Programming (OOP)
  - Encapsulation
  - Separation of concerns
- Java Collections (ArrayList)
- Defensive programming
- Clean and scalable project structure
- Basic CRUD-style operations

---

## 🏗️ Project Structure

contact-management-system-java/
|
|-- src/
|   |-- model/
|   |   |-- Contact.java
|   |
|   |-- service/
|   |   |-- ContactService.java
|   |
|   |-- Main.java
|
|-- README.md
|-- .gitignore

---

## 🧩 Class Responsibilities

### Contact (Model Layer)
- Represents a contact entity
- Stores id, name, and phone number
- Performs input validation
- Uses encapsulation to protect data

### ContactService (Service Layer)
- Manages a collection of Contact objects
- Adds contacts with duplicate ID checks
- Displays all contacts
- Searches contacts by ID

### Main (Application Entry Point)
- Creates objects
- Demonstrates application flow
- Delegates logic to the service layer

---

## ▶️ How to Run the Project

1. Clone the repository
2. Navigate to the src directory
3. Compile all Java files
4. Run the Main class

Example:
javac src/model/Contact.java src/service/ContactService.java src/Main.java
java Main

---

## 🎯 Learning Outcome

This project helped reinforce:
- Proper use of classes and objects
- Encapsulation and validation
- Clean separation between data, logic, and execution
- Writing maintainable and readable Java code

---

## 🚀 Future Improvements

- Menu-driven user interaction
- Update and delete contact functionality
- File-based storage
- Database integration

---

## 👤 Author

Aadarsh Singh  
Computer Science Undergraduate  
Java & DSA Learner

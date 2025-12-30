## Source Code Overview

This directory contains the complete source code for the Contact Management System.
The project is organized using a layered architecture to ensure clean separation
of responsibilities, improved readability, and easier scalability.

The goal of this structure is to clearly distinguish between:
- Data representation
- Business logic
- Application execution

Such separation is a standard practice in real-world Java applications and backend systems.

---

## Architectural Design

The application follows a simplified layered design:

1. Model Layer
   - Represents core data entities
   - Contains validation and encapsulation logic

2. Service Layer
   - Handles business logic and operations
   - Manages collections and enforces application rules

3. Application Entry Point
   - Responsible for starting the program
   - Demonstrates how the system works

This design ensures that each class has a single, well-defined responsibility.

---

## Directory Breakdown

- model/
  Contains data-centric classes that represent real-world entities.

- service/
  Contains logic-centric classes that operate on model objects.

- Main.java
  Acts as the entry point of the application and coordinates execution.

---

## Benefits of This Structure

- Improves maintainability
- Makes debugging easier
- Allows future extensions (UI, file handling, database)
- Follows industry-recognized best practices

This structure intentionally avoids unnecessary complexity while still maintaining
professional design standards.

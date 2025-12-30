## Service Layer Documentation

The service layer contains the business logic of the application.
It acts as an intermediary between the model layer and the application entry point.

This layer is responsible for managing collections of model objects and enforcing
application-level rules.

---

## Responsibilities of the Service Layer

- Manage Contact objects using collections
- Perform operations such as:
  - Adding new contacts
  - Displaying all contacts
  - Searching contacts by ID
- Enforce business constraints (e.g., unique ID requirement)
- Keep logic separate from user interaction or output formatting

---

## Design Principles Applied

- Separation of Concerns
  The service layer does not handle input/output or data validation.

- Composition over Inheritance
  The service uses Contact objects rather than extending them.

- Reusability
  Methods return data objects instead of printing directly when appropriate.

---

## Classes in This Package

### ContactService.java

Core responsibilities:
- Maintains an internal ArrayList of Contact objects
- Prevents duplicate contacts based on ID
- Provides methods to retrieve and display contact information

Key methods include:
- addContact(Contact contact)
- displayContacts()
- searchById(int id)

---

## Why This Layer Is Important

Separating business logic into a service layer:
- Makes the application easier to test
- Improves maintainability
- Allows future integration with UI, files, or databases
- Reflects real-world backend service design

This approach aligns with how services are implemented in professional Java applications.

## Model Layer Documentation

The model layer defines the core data structures used by the application.
Classes in this package represent real-world entities and are responsible for
maintaining the integrity of their own data.

This layer does NOT contain business logic related to managing collections or
application flow.

---

## Responsibilities of the Model Layer

- Represent domain entities
- Store data using private fields
- Enforce encapsulation via getters and setters
- Validate input to maintain data correctness
- Protect internal state from invalid modification

---

## Design Principles Applied

- Encapsulation
  All fields are private and accessed only through public methods.

- Defensive Programming
  Input validation (e.g., phone number validation) ensures invalid data is rejected.

- Single Responsibility Principle
  Each model class focuses only on representing data.

---

## Classes in This Package

### Contact.java

Represents a contact entity with the following attributes:
- id : Unique identifier for the contact
- name : Name of the contact
- phoneNumber : 10-digit phone number with validation

Key characteristics:
- Prevents invalid phone numbers
- Exposes controlled access using getters and setters
- Does not depend on service or application logic

---

## Why This Layer Matters

Keeping data logic isolated ensures:
- Better code readability
- Safer data handling
- Easier migration to databases or APIs in the future

This approach mirrors how entities are handled in enterprise Java and backend frameworks.

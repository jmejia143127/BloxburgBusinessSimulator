# Bloxburg Business Simulator

This project is a Java program that simulates managing businesses in
Bloxburg. Businesses can be created with an owner and starting funds,
employees can be hired, salaries can be paid, and taxes can be deducted.

## Use of `this`

The `this` keyword is used in the Business and Employee constructors to
refer to instance variables.

It is also used to chain the overloaded Business constructors. For
example, a constructor that only receives a business name calls the
constructor that accepts the name, owner, and starting funds.

## Method Overloading

Constructor overloading is used in the Business class.

The following constructors allow a Business to be created in different
ways:

- `Business(String name)`
- `Business(String name, double startingFunds)`
- `Business(String name, String owner, double startingFunds)`

The `hireEmployee()` method is also overloaded. An employee can be hired
with a custom salary or with the standard wage.

## Static Fields

The Business class contains the static field `totalBusinesses`.

This variable belongs to the Business class rather than an individual
Business object. Each time a new Business is created, the value increases
by one.

The program also uses the constant `TAX_RATE` for calculating taxes and
`STANDARD_WAGE` for the default employee wage.

## Composition and Nested Classes

The Employee class is nested inside the Business class. Each Business
contains an ArrayList of Employee objects, allowing every business to
manage its own employees.

<h1>FINN-CONNECT BANKING SYSTEM</h1>

This is a simple bank Management System developed in Java using Java Swing for the user interface and MySQL for the database.
The application allows users to perform basic bank operations such as balance inquiries, deposits, withdrawals, and transaction history viewing.

Features:

User Authentication: Secure login for customers with unique PIN.
Balance Inquiry: Check the current account balance.
Deposit: Add funds to the account.
Withdrawal: Withdraw funds from the account.
Transaction History: View a history of all transactions.
Admin Panel: Admin can view all users and transaction details.

Technology Stack:

Java: Core language used for application logic.
Java Swing: Used for building the graphical user interface.
MySQL: Database to store user information and transaction details.

Installation Prerequisites:
Java Development Kit (JDK) installed
MySQL database installed and configured
Java IDE (e.g., IntelliJ IDEA, Eclipse, or NetBeans) or a text editor

Steps:
Clone this repository.

Set up the MySQL database:
Create a new database (e.g., bank_management_db).
Run the provided SQL scripts to create necessary tables (e.g., users, transactions).
Configure the database connection:
Update the database credentials (URL, username, password) in the code.
Open the project in your Java IDE.
Run the application.

Usage:
Launch the application.
Login with the user credentials (PIN required).
Access the desired functionalities such as Balance Inquiry, Deposit, Withdrawal, and Transaction History.

Database Schema:
The MySQL database includes the following tables:
Users: Stores user information (ID, name, PIN, balance).
Transactions: Logs transaction details (transaction ID, user ID, type, amount, date).

Acknowledgements:
Thanks to the open-source Java and MySQL communities for their tools and resources.

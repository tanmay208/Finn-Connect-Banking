    <h1>ATM Management System</h1>
    <p>This is a simple ATM Management System developed in Java using Java Swing for the user interface and MySQL for the database. The application allows users to perform basic ATM operations such as balance inquiries, deposits, withdrawals, and transaction history viewing.</p>

    <h2>Features:</h2>
    <ul>
        <li><strong>User Authentication</strong>: Secure login for customers with unique PIN.</li>
        <li><strong>Balance Inquiry</strong>: Check the current account balance.</li>
        <li><strong>Deposit</strong>: Add funds to the account.</li>
        <li><strong>Withdrawal</strong>: Withdraw funds from the account.</li>
        <li><strong>Transaction History</strong>: View a history of all transactions.</li>
        <li><strong>Admin Panel</strong>: Admin can view all users and transaction details.</li>
    </ul>

    <h2>Technology Stack:</h2>
    <ul>
        <li><strong>Java</strong>: Core language used for application logic.</li>
        <li><strong>Java Swing</strong>: Used for building the graphical user interface.</li>
        <li><strong>MySQL</strong>: Database to store user information and transaction details.</li>
    </ul>

    <h2>Installation</h2>
    <h3>Prerequisites</h3>
    <ul>
        <li>Java Development Kit (JDK) installed</li>
        <li>MySQL database installed and configured</li>
        <li>Java IDE (e.g., IntelliJ IDEA, Eclipse, or NetBeans) or a text editor</li>
    </ul>

    <h3>Steps</h3>
    <ol>
        <li>Clone this repository.</li>
        <li>Set up the MySQL database:
            <ul>
                <li>Create a new database (e.g., <code>atm_management_db</code>).</li>
                <li>Run the provided SQL scripts to create necessary tables (e.g., <code>users</code>, <code>transactions</code>).</li>
            </ul>
        </li>
        <li>Configure the database connection:
            <ul>
                <li>Update the database credentials (URL, username, password) in the code.</li>
            </ul>
        </li>
        <li>Open the project in your Java IDE.</li>
        <li>Run the application.</li>
    </ol>

    <h2>Usage</h2>
    <ol>
        <li>Launch the application.</li>
        <li><strong>Login</strong> with the user credentials (PIN required).</li>
        <li>Access the desired functionalities such as <strong>Balance Inquiry</strong>, <strong>Deposit</strong>, <strong>Withdrawal</strong>, and <strong>Transaction History</strong>.</li>
    </ol>

    <h2>Database Schema</h2>
    <p>The MySQL database includes the following tables:</p>
    <ul>
        <li><strong>Users</strong>: Stores user information (ID, name, PIN, balance).</li>
        <li><strong>Transactions</strong>: Logs transaction details (transaction ID, user ID, type, amount, date).</li>
    </ul>

    <h2>Acknowledgements</h2>
    <p>Thanks to the open-source Java and MySQL communities for their tools and resources.</p>

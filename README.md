<!DOCTYPE html>
<html>
<head>
    <title>Basic Banking System</title>
</head>
<body>
    <h1>Basic Banking System 🏦</h1>
    <p>
        A simple Java-based Banking System that demonstrates object-oriented programming concepts. 
        The system allows users to manage multiple bank accounts with features like account creation, 
        deposits, withdrawals, and balance checks.
    </p>

    <h2>🚀 Features</h2>
    <ul>
        <li><strong>Add Account:</strong> Create a new bank account with a unique number, PIN, name, and initial balance. Ensures account numbers are not duplicated.</li>
        <li><strong>View Details:</strong> Authenticate using account number and PIN to view account details securely.</li>
        <li><strong>Deposit/Withdraw:</strong> Allows money transactions, updating and displaying the remaining balance instantly.</li>
        <li><strong>Validations:</strong>
            <ul>
                <li>Unique account numbers.</li>
                <li>4-digit PIN check.</li>
                <li>Insufficient balance prevention for withdrawals.</li>
            </ul>
        </li>
        <li><strong>Error Handling:</strong> Displays appropriate messages for invalid inputs or actions.</li>
    </ul>

    <h2>🛠️ Technology</h2>
    <ul>
        <li><strong>Language:</strong> Java</li>
        <li><strong>Concepts:</strong> OOP (Classes, Methods, Encapsulation), Arrays, Input/Output with <code>Scanner</code>.</li>
    </ul>

    <h2>📂 Code Structure</h2>
    <ul>
        <li><strong>BankAccount:</strong> Defines account properties and operations (add, deposit, withdraw, display).</li>
        <li><strong>BankSystem:</strong> Manages the user interface and controls program flow.</li>
    </ul>
</body>
</html>

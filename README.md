🧑‍💼 Employee Management System (Java)

A console-based Employee Management System built using Core Java and Object-Oriented Programming (OOP) concepts.
This project performs CRUD operations (Create, Read, Update, Delete) on employee records using an in-memory data structure.

📌 Features

➕ Add a new employee

📄 View all employees

✏️ Update employee details

❌ Delete an employee

🧠 Uses OOP principles (Encapsulation, Classes, Objects)

📦 Data stored using ArrayList (no database)



🛠️ Technologies Used
Java (Core Java)
OOP Concepts
ArrayList
Scanner (User Input)

📂 Project Structure
Employee-Management-System/
│
├── Employee.java          # Employee model class
├── EmployeeService.java   # CRUD logic
├── Main.java              # User Interface (Console)
└── README.md              # Project documentation



🧩 Class Explanation
1️⃣ Employee.java (Model Class)

Holds employee data:
id
name
salary
department
Contains getters, setters, and display method

2️⃣ EmployeeService.java (Service Class)
Handles all CRUD operations:
addEmployee()
viewEmployee()
updateEmployee()
deleteEmployee()
Uses ArrayList<Employee> to store data in memory.

3️⃣ Main.java (UI Class)
Provides a menu-driven console interface
Takes user input using Scanner
Calls service methods based on user choice

▶️ How to Run the Project
Step 1: Clone the Repository
git clone https://github.com/your-username/Employee-Management-System.git

Step 2: Open in IDE

Open the project in any Java IDE:

IntelliJ IDEA

Eclipse

VS Code

Step 3: Compile the Code
javac Main.java

Step 4: Run the Program
java Main

🖥️ Sample Menu Output
===== Employee Management System =====
1. Add Employee
2. View Employee
3. Update Employee
4. Delete Employee
5. Exit
Choose option:

🎯 Learning Outcomes

Strong understanding of OOP concepts

Hands-on experience with CRUD operations

Java collections (ArrayList)

Console-based application design

Clean code structure

🚀 Future Enhancements

🔗 Connect with Database (MySQL)

🌐 Convert to REST API using Spring Boot

🖥️ Add GUI (JavaFX / Swing)

🔐 Input validation & exception handling

👨‍🎓 Author

Piyush
BCA Student | Java & Full Stack Learner

⭐ Support

If you like this project, please ⭐ star the repository and share feedback!

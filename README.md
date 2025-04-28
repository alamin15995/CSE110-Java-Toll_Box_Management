
# 🚗 Padma Tollbox Management System
This is a Java-based console application that simulates the toll collection and vehicle management system for the Padma Bridge.
The project manages vehicle entries, calculates toll fees, handles both online/manual payments, and tracks traffic statistics.

#📋 Features
### Select vehicle type (Bus, CNG, Truck, Private Car, Bike, Mini Truck, Micro).
### Calculate toll based on vehicle type.
### Choose payment method:
     Online Payment (20% cashback for Bkash users).
     Manual Payment (cash, with change calculation).
### Automatic fine calculation if passenger limit is exceeded.
### Online payment includes mobile number and PIN verification.

#Track:
1. Total toll collected.
2. Number of vehicles per type and lane.
3. Detailed reports for vehicle entries.
4. Official access for viewing traffic reports and transaction history.

### 🛠️ Technologies Used
    Java (Core Java concepts like OOP, Interfaces, Collections)
    Scanner class for user input
    ArrayList for vehicle data storage

### 📂 Project Structure

File	Description: Database.java	Interface storing constants (toll rates, fines, passenger limits).
ManuallyPaid.java	Handles manual (cash) payments and returns change to the user.
OnlinePaid.java	Handles online payments with mobile number and PIN validation, applies discount.
PadmaToll.java	Main entry point (main method), runs the full application loop.
Registry.java	Tracks total toll amount, vehicle count per type, and vehicle list.
Toll.java	Core toll processing: fines, payments, lane assignments, slip generation.
Vehicle.java	Manages detailed info for each vehicle (serial, passenger count, payment method).


###📸 UML Overview
1. Class Diagram: Organized around PadmaToll, Toll, Registry, Vehicle, and Payment classes.
2. Flowchart: Payment workflow (vehicle selection ➔ payment method ➔ fine check ➔ final receipt) (You can add the UML images here if you want!)

### ▶️ How to Run
1. Clone this repository:  git clone https://github.com/your-username/PadmaTollboxManagementSystem.git
2. Open the project in your favorite Java IDE (e.g., IntelliJ IDEA, Eclipse, VSCode).
3. Make sure Java JDK 8+ is installed.
4. Run the PadmaToll.java file to start the system.

### 🙋‍♂️ Author
Created by: Mohammad Al-Amin
Special Thanks: Mahmudul Hasan Munna Sir


 


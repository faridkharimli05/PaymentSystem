# 💳 Java Payment System

A clean and simple **Java project** that demonstrates Object-Oriented Programming (OOP) principles through a **Payment Management System**.  
The project supports multiple payment types — **Online, Credit Card, and Cash** — with real-world features such as unique receipt IDs, timestamps, and multiple currencies.

---

## 🚀 Features

- 💰 Multiple payment types: **Online, Credit Card, Cash**  
- 🧾 Unique receipt ID (UUID) for every transaction  
- ⏰ Timestamp for each payment  
- 💱 Multi-currency support: **AZN, USD, EUR**  
- 🔎 Search & filter payments by type or receipt ID  
- 🧠 Demonstrates **Inheritance**, **Polymorphism**, and **Encapsulation**

---

## 🧩 Project Structure

PaymentSystem/
│
├── Currency.java
├── Payment.java
├── OnlinePayment.java
├── CreditCardPayment.java
├── CashPayment.java
├── PaymentManager.java
└── Main.java



---

## 🧠 Concepts Practiced

- Object-Oriented Programming (OOP)
- Inheritance and Polymorphism
- Encapsulation
- Collections (ArrayList)
- UUID & LocalDateTime usage
- Enum in Java
- Class interaction and method overriding

---

## 💻 How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/faridkharimli05/PaymentSystem.git
2. Open the project in IntelliJ IDEA, Eclipse, or VS Code

3 .Compile and run Main.java

4 .See the payment process in the console



💰 New payment added to the list.
💰 New payment added to the list.
💰 New payment added to the list.

🔎 Show only ONLINE payments:
📂 Payments of type: OnlinePayment
Processing online payment of 80.0 AZN via account: farid@example.com
✅ Payment successful!
📧 Receipt sent to: farid@example.com
------------------------------
Receipt ID: 93b2b9cf-8487-43a3-b84b-9c0a4e8c6ef1
Date: 09-11-2025 21:45:12
Amount: 80.0 AZN
Payment Method: Online
Thank you for your purchase!
------------------------------

🧾 Search by receipt ID:
Processing credit card payment of 100.0 USD with card: **** **** **** 5678
✅ Payment successful!
💳 Card: **** **** **** 5678
------------------------------
Receipt ID: 6214d43f-cb24-4b5b-83f8-2eac9675cf11
Date: 09-11-2025 21:45:12
Amount: 100.0 USD
Payment Method: Credit Card
Thank you for your purchase!
------------------------------

💵 Total amount (in mixed currencies): 240.0


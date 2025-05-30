# DELI-cious Point of Sale (POS) Application
Welcome to **DELI-cious**, a Java-based Point of Sale system built for a custom sandwich shop! This console-based application allows customers to create fully customized sandwich orders and checkout easily.

## 🥪 Project Description

This POS system was created to automate and digitize the ordering process at DELI-cious. Customers can:

- Select sandwich size and bread
- Add premium meats, cheeses, toppings, drinks, and chips
- View a live receipt
- Checkout and clear the order
- Save each order to a text file in the project directory

This project follows Object-Oriented Programming (OOP) principles such as encapsulation, modular design, and enums.

## 📁 Project Structure

![Screenshot 2025-05-29 191933](https://github.com/user-attachments/assets/1b4083cb-658b-484f-97c8-dbee20eaa315)



##src/
│
## ├── DeliOptions.java 
 Enums and pricing logic for sizes, breads, toppings, etc.
## ├── Order.java 
 Manages the current sandwich order
## ├── ReceiptManager.java
 Handles receipt display and file saving
## ├── Main.java 
Runs the main POS interface


## 🚀 How to Run

1. Clone the repository or download the source files.
2. Open the project in your Java IDE (e.g., IntelliJ IDEA, Eclipse).
3. Run the `Main.java` file.
4. Follow the on-screen menu to start building a sandwich!

## 💾 Order File Location

After checkout, a `.txt` receipt file is saved in the same directory as your `.gitignore`. Each receipt is timestamped and contains:

- Bread and size
- Added toppings and extras
- Final total

## ✅ Features

- Object-Oriented Design using classes and enums
- Clear, interactive menu system
- Automatic receipt generation
- File I/O for order history
- Resets order data after checkout

## 📌 Sample Order

![Screenshot 2025-05-29 182558](https://github.com/user-attachments/assets/db97c23a-12d9-40ee-91a2-a2ce1b08fe03)

## Intresting code
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {

    public static void saveReceiptToFile(String receiptContent) {
        // Create a "receipts" directory if it doesn't exist
        File receiptsDir = new File("receipts");
        if (!receiptsDir.exists()) {
            receiptsDir.mkdir();
        }

        // Generate a timestamp-based filename for uniqueness
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));                  
        String fileName = "receipts/" + timestamp + ".txt";
        // Write the receipt content to the file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(receiptContent);
            System.out.println("✅ Receipt saved to: " + fileName);
        } catch (IOException e) {
            System.out.println("❌ Error saving receipt: " + e.getMessage());
        }
    }
# Why I find it interesting.
## It Automatically checks and creates a directory
## The class is also responsible for writing reciepts
## Demonstrartes how to create, write and manage external files





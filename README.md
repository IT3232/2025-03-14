<!DOCTYPE html>
<html lang="en">
<head>
    
           
       
</head>
<body>

  <h1>IT3232 E-Commerce Practicals - Day 1 (2025-03-14)</h1>
    <p>This repository contains solutions to the given practical questions.</p>

    
  <div class="question">
        <h2>Question 1: Print a Message</h2>
        <p>Prints "Hello, World!" to the console. Basic demonstration of <code>System.out.println()</code> in Java.</p>
        <div class="question-code">
            <pre>
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
            </pre>
        </div>
       
  </div>

   
  <div class="question">
        <h2>Question 2: Print Numbers from 1 to 10</h2>
        <p>Uses a for loop to print numbers from 1 to 10. Demonstrates loop iteration and <code>System.out.print()</code>.</p>
        <div class="question-code">
            <pre>
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}
            </pre>
        </div>
        
   </div>

   
  <div class="question">
        <h2>Question 3: Print Numbers in Reverse</h2>
        <p>Prints numbers from 10 to 1 in reverse order. Uses a decrementing for loop.</p>
        <div class="question-code">
            <pre>
public class Main {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
            </pre>
        </div>
       
  </div>

  <div class="question">
        <h2>Question 4: Print Odd Numbers Between 1 and 20</h2>
        <p>Prints all odd numbers between 1 and 20. Increments the loop variable by 2 to get only odd numbers.</p>
        <div class="question-code">
            <pre>
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
    }
}
            </pre>
        </div>
       
  </div>

    
   <div class="question">
        <h2>Question 5: Reverse the Left and Right Numbers</h2>
        <p>Reverses the first half of the sequence and prints the second half as is. Uses a for loop to split and rearrange numbers.</p>
        <div class="question-code">
            <pre>
public class Main {
    public static void main(String[] args) {
        int n = 13;
        for (int i = n / 2; i >= 1; i--) {
            System.out.print(i + " ");
        }
        for (int i = n; i > n / 2; i--) {
            System.out.print(i + " ");
        }
    }
}
            </pre>
        </div>
        
  </div>

    
   <div class="question">
        <h2>Question 6: Create a Student Class</h2>
        <p>Implements a Student class with attributes name and marks. Stores five student objects in an ArrayList. Calculates and prints the average marks.</p>
        <div class="question-code">
            <pre>
import java.util.ArrayList;

class Student {
    String name;
    int marks;

  public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 90));
        students.add(new Student("Charlie", 75));
        students.add(new Student("David", 80));
        students.add(new Student("Eve", 88));

  int totalMarks = 0;
        for (Student student : students) {
            totalMarks += student.marks;
        }

  double averageMarks = totalMarks / students.size();
        System.out.println("Average Marks: " + averageMarks);
    }
}
            </pre>
        </div>
        
  </div>

   
  <div class="question">
        <h2>Question 7: Implement Classes for a Library System</h2>
        <p>Implements a Library system using Object-Oriented Programming (OOP) concepts. Uses inheritance for PrintedBook, EBook, and AudioBook classes. Demonstrates polymorphism through method overriding.</p>
        <div class="question-code">
            <pre>
class Book {
    String title;
    String author;

  public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

  public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class PrintedBook extends Book {
    public PrintedBook(String title, String author) {
        super(title, author);
    }

   @Override
    public void displayDetails() {
        System.out.println("Printed Book - " + super.title + ", Author: " + super.author);
    }
}

class EBook extends Book {
    public EBook(String title, String author) {
        super(title, author);
    }

  @Override
    public void displayDetails() {
        System.out.println("EBook - " + super.title + ", Author: " + super.author);
    }
}

class AudioBook extends Book {
    public AudioBook(String title, String author) {
        super(title, author);
    }

   @Override
    public void displayDetails() {
        System.out.println("AudioBook - " + super.title + ", Author: " + super.author);
    }
}

public class Library {
    public static void main(String[] args) {
        Book book1 = new PrintedBook("Java Basics", "John Doe");
        Book book2 = new EBook("Advanced Java", "Jane Doe");
        Book book3 = new AudioBook("Java Design Patterns", "Richard Roe");

  book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
    }
}
            </pre>
        </div>
       
  </div>

   
  <div class="question">
        <h2>Question 8: Implement Classes for a Retail Store</h2>
        <p>Implements a retail store system where products like fruits, vegetables, and groceries can be added, edited, and deleted. Displays available products with details such as price, name, and quantity.</p>
        <div class="question-code">
            <pre>
class Product {
    String name;
    double price;
    int quantity;

  public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

  public void displayProduct() {
        System.out.println("Name: " + name + ", Price: " + price + ", Quantity: " + quantity);
    }
}

public class RetailStore {
    public static void main(String[] args) {
        Product product1 = new Product("Apple", 0.99, 100);
        Product product2 = new Product("Carrot", 1.29, 150);
        Product product3 = new Product("Milk", 2.49, 200);

  product1.displayProduct();
        product2.displayProduct();
        product3.displayProduct();
    }
}
            </pre>
        </div>
       
  </div>

</body>
</html>

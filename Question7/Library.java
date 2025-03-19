
abstract class Book {
    private String title;
    private String author;
    private int year;

   
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    
    public abstract void displayInfo();
}


class PrintedBook extends Book {
    private int pages;

    public PrintedBook(String title, String author, int year, int pages) {
        super(title, author, year);
        this.pages = pages;
    }

    @Override
    public void displayInfo() {
        System.out.println("Printed Book: " + getTitle() + " by " + getAuthor() + " (" + getYear() + ")");
        System.out.println("Pages: " + pages);
    }
}

class EBook extends Book {
    private double fileSize; 

    public EBook(String title, String author, int year, double fileSize) {
        super(title, author, year);
        this.fileSize = fileSize;
    }

    @Override
    public void displayInfo() {
        System.out.println("E-Book: " + getTitle() + " by " + getAuthor() + " (" + getYear() + ")");
        System.out.println("File Size: " + fileSize + " MB");
    }
}


class AudioBook extends Book {
    private double duration; 

    public AudioBook(String title, String author, int year, double duration) {
        super(title, author, year);
        this.duration = duration;
    }

    @Override
    public void displayInfo() {
        System.out.println("Audio Book: " + getTitle() + " by " + getAuthor() + " (" + getYear() + ")");
        System.out.println("Duration: " + duration + " hours");
    }
}

public class Library {
    public static void main(String[] args) {
        
        Book printedBook = new PrintedBook("The Great Gatsby", "F. Scott Fitzgerald", 1925, 180);
        Book eBook = new EBook("Clean Code", "Robert C. Martin", 2008, 4.5);
        Book audioBook = new AudioBook("Atomic Habits", "James Clear", 2018, 5.3);

        Book[] books = {printedBook, eBook, audioBook};

        for (Book book : books) {
            book.displayInfo();
            System.out.println("---------------------------------");
        }
    }
}
